package com.solvd.specialWordCounter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SpecialWordCounter {

    // INFO
    private static final Logger PRINT = LogManager.getLogger("InfoLogger");

    // DEBUG, ERROR
    private static final Logger LOG = LogManager.getLogger(SpecialWordCounter.class);

    public static void main(String[] args) {
        File source = new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\source.txt");
        File output = new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\output.txt");

        String contents;
        try {
            contents = FileUtils.readFileToString(source, StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            LOG.error(e);
            return;
        }

        contents = contents.replaceAll("[^a-zA-Z0-9]", " ");

        String[] words = StringUtils.split(contents);
        int specialWordCounter = 0;
        for(String word : words) {
            if(isSpecial(word)) {
                ++specialWordCounter;
            }
        }

        if(!output.exists()) {
            try  {
                output.createNewFile();
            } catch (IOException | SecurityException e) {
                LOG.error(e);
                return;
            }
        }

        String resultString = String.format("Special word count: %d%n", specialWordCounter);

        try {
            FileUtils.writeStringToFile(output, resultString, StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            LOG.error(e);
            return;
        }

        PRINT.info("Count has successfully wrote to the \"output.txt\"");
    }

    private static boolean isSpecial(String word) {
        return StringUtils.isAlpha(word) && Character.isUpperCase(word.charAt(0));
    }
}
