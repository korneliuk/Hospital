package com.solvd.specialWordCounter;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterThread extends Thread {

    // INFO
    private static final Logger PRINT = LogManager.getLogger("InfoLogger");

    // DEBUG, ERROR
    private static final Logger LOG = LogManager.getLogger(FileWriterThread.class);

    private final File target;
    private final String s;

    public FileWriterThread(File target, String s) {
        this.target = target;
        this.s = s;
    }

    @Override
    public void run() {
        LOG.debug("Writing in file from thread ID: {}", Thread.currentThread().threadId());
        try {
            FileUtils.writeStringToFile(target, s, StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            LOG.error(e);
        }
    }
}
