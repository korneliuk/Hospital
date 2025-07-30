package com.solvd.specialWordCounter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // INFO
    private static final Logger PRINT = LogManager.getLogger("InfoLogger");

    // DEBUG, ERROR
    private static final Logger LOG = LogManager.getLogger(Main.class);

    private static final File source =
            new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\source.txt");

    private static final File[] outputs = new File[]{
            new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\output1.txt"),
            new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\output2.txt"),
            new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\output3.txt"),
            new File("D:\\SolvdLaba\\Hospital\\src\\main\\java\\com\\solvd\\specialWordCounter\\output4.txt")
    };

    public static void main(String[] args) {

        String contents;
        try {
            contents = FileUtils.readFileToString(source, StandardCharsets.UTF_8.name());
            createOutputs();
        } catch (IOException | SecurityException e) {
            LOG.error(e);
            return;
        }

        contents = contents.replaceAll("[^a-zA-Z0-9]", " ");
        String[] words = StringUtils.split(contents);

        SpecialWordCounter counter = new SpecialWordCounter().getInstance();

        int result = counter.invoke(words);
        String resultString = String.format("Special word count: %d%n", result);

        try {
            writeToFiles(resultString);
        } catch (InterruptedException e) {
            LOG.error(e);
        }

        PRINT.info("Count has successfully wrote to the outputs\n");
    }

    private static void createOutputs() throws IOException, SecurityException {
        for (File output : outputs) {
            if (!output.exists()) {
                output.createNewFile();
            }
        }
    }

    private static void writeToFiles(String resultString) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < outputs.length; ++i) {
            threads.add(new FileWriterThread(outputs[i], resultString));
            threads.get(i).start();
        }

        for(Thread thread : threads) {
            thread.join();
        }
    }
}