package com.solvd.hospital.ui;

import com.solvd.hospital.DiseaseType;
import com.solvd.hospital.DoctorFactory;
import com.solvd.hospital.SpecialistsDB;
import com.solvd.hospital.doctors.AbstractDoctor;
import com.solvd.hospital.exceptions.InvalidSymptomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Menu {

    // INFO
    private static final Logger PRINT = LogManager.getLogger("InfoLogger");

    // DEBUG, ERROR
    private static final Logger LOG = LogManager.getLogger(Menu.class);

    private static final Scanner scanner = new Scanner(System.in);

    public static void invoke() {
        PRINT.info("\nIt is Hospital Application.\n\n");

        boolean escape = false;
        do {
            PRINT.info("Enter \"1\" to find the right specialist based on your symptoms;\n");
            PRINT.info("Enter \"2\" to show available specialists;\n");
            PRINT.info("Enter \"3\" to exit;\n\n");

            PRINT.info("Chosen option: ");
            switch (readInt()) {
                case 1 -> findSpecialist();
                case 2 -> showAvailableSpecialists();
                case 3 -> escape = true;
                default -> PRINT.error("\nAn unexpected command entered. Check the command list and try again.\n\n");
            }
        } while (!escape);
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                PRINT.error("Please enter a valid integer: ");
            }
        }
    }

    private static void findSpecialist() {
        displayAvailableSymptoms();

        PRINT.info("Enter the symptoms that bother you: ");
        String[] userSymptoms = scanner.nextLine().split("; ");

        LOG.debug("\nUser entered the symptoms");

        AbstractDoctor suitableDoctor;
        try {
            suitableDoctor = DoctorFactory.getDoctor(userSymptoms);
        } catch (InvalidSymptomException e) {
            LOG.error(e);
            return;
        }

        suitableDoctor.setName("Mark Donia");

        PRINT.info("\nThe following specialist will suit you:\n");
        PRINT.info("{}\n", suitableDoctor);
    }

    /**
     * Displays information about the symptoms available for entering the console.
     */
    private static void displayAvailableSymptoms() {
        for (DiseaseType diseaseType : DiseaseType.values()) {

            PRINT.info("{}:\n", diseaseType);
            String[] values = diseaseType.getValues();
            for (int i = 0; i < values.length; ++i) {
                if (i % 2 == 0) {
                    if (i == values.length - 1)
                        System.out.printf("-%-60s%n", values[i]);
                    else System.out.printf("-%-60s", values[i]);
                } else System.out.printf("-%-120s%n", values[i]);
            }
            PRINT.info('\n');
        }
    }

    private static void showAvailableSpecialists() {
        boolean escape = false;
        do {
            PRINT.info("Enter \"1\" to display available doctors;\n");
            PRINT.info("Enter \"2\" to display available diagnostic specialists;\n");
            PRINT.info("Enter \"3\" to display available surgeons;\n");
            PRINT.info("Enter \"4\" to return to the previous menu;\n\n");

            PRINT.info("Chosen option: ");
            switch (readInt()) {
                case 1:
                    SpecialistsDB.displayAvailableDoctors();
                    PRINT.info("\n");
                    break;
                case 2:
                    SpecialistsDB.displayAvailableDiagnosticSpecialists();
                    PRINT.info("\n");
                    break;
                case 3:
                    SpecialistsDB.displayAvailableSurgeons();
                    PRINT.info("\n");
                    break;
                case 4:
                    escape = true;
                    break;
                default:
                    PRINT.error("\nAn unexpected command entered. Check the command list and try again.\n\n");
            }
        } while (!escape);
    }
}
