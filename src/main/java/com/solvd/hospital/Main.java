package com.solvd.hospital;

import com.solvd.hospital.ui.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Console application asks the user for the symptoms, that bother them.
 * <br>
 * Then, based on the symptoms, it is determined which doctor's specialization suits the user best.
 * The symptoms available for input are viewed in the console.
 * <p>
 * <strong>It is required to input symptoms divided by semicolon and space: "; "</strong>
 * <p>
 * Inner work of the application implements design pattern <b>Factory Method</b>
 * to alter the type of objects that will be created.
 */
public class Main {

    // DEBUG, ERROR
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("Program started");
        Menu.invoke();
    }
}