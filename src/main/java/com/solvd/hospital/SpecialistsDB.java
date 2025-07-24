package com.solvd.hospital;

import com.solvd.hospital.diagnosticSpecialists.*;
import com.solvd.hospital.doctors.*;
import com.solvd.hospital.doctors.surgeons.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class SpecialistsDB {

    // INFO
    private static final Logger PRINT = LogManager.getLogger("InfoLogger");

    private static final Set<RatedDoctor<AbstractDoctor>> availableDoctors = new HashSet<>();

    private static final List<RatedDoctor<AbstractDiagnosticSpecialist>> availableDiagnosticSpecialists =
            new ArrayList<>();

    private static final Deque<RatedDoctor<AbstractSurgeon>> availableSurgeons = new ArrayDeque<>();

    static {
        availableDoctors.add(new RatedDoctor<>(new Allergist("Mark Donia"), 4.4));
        availableDoctors.add(new RatedDoctor<>(new Endocrinologist("Alessia Zayn"), 4.5));
        availableDoctors.add(new RatedDoctor<>(new Neurologist("Oleksandr Kravchuk"), 4.2));
        availableDoctors.add(new RatedDoctor<>(new Cardiologist("Jenni Rose"), 4.0));
        availableDoctors.add(new RatedDoctor<>(new Gastroenterologist("Dmitry Bushynov"), 3.5));

        availableDiagnosticSpecialists.add(new RatedDoctor<>(new CardiacDiagnosticsExpert("Maksym Chernega"), 5.0));
        availableDiagnosticSpecialists.add(new RatedDoctor<>(new LaboratoryTechnician("Yana Kogut"), 4.8));
        availableDiagnosticSpecialists.add(new RatedDoctor<>(new NeurodiagnosticSpecialist("Sofia Bespalco"), 4.3));
        availableDiagnosticSpecialists.add(new RatedDoctor<>(new Pathologist("Volodymyr Rostetski"), 4.9));
        availableDiagnosticSpecialists.add(new RatedDoctor<>(new Radiologist("Irina Boyko"), 4.5));

        availableSurgeons.add(new RatedDoctor<>(new CardiacSurgeon("Tetiana Druch"), 4.4));
        availableSurgeons.add(new RatedDoctor<>(new GeneralSurgeon("Oleksandr Korneliuk"), 4.6));
        availableSurgeons.add(new RatedDoctor<>(new Neurosurgeon("Nikita Palamarchuk"), 4.4));
        availableSurgeons.add(new RatedDoctor<>(new OrthopedicSurgeon("Illia Homenko"), 3.9));
        availableSurgeons.add(new RatedDoctor<>(new TraumaSurgeon("Arina Chick"), 4.1));
    }

    public static void addRatedDoctor(RatedDoctor<? extends AbstractDoctor> doctor) {
        availableDoctors.add((RatedDoctor<AbstractDoctor>) doctor);
    }

    public static Set<RatedDoctor<AbstractDoctor>> getAvailableDoctors() {
        return availableDoctors;
    }

    public static void addRatedDiagnosticSpecialist
            (RatedDoctor<? extends AbstractDiagnosticSpecialist> diagnosticSpecialist) {
        availableDiagnosticSpecialists.add((RatedDoctor<AbstractDiagnosticSpecialist>) diagnosticSpecialist);
    }

    public static List<RatedDoctor<AbstractDiagnosticSpecialist>> getAvailableDiagnosticSpecialists() {
        return availableDiagnosticSpecialists;
    }

    public static void addRatedSurgeon(RatedDoctor<? extends AbstractSurgeon> surgeon) {
        availableSurgeons.add((RatedDoctor<AbstractSurgeon>) surgeon);
    }

    public static Deque<RatedDoctor<AbstractSurgeon>> getAvailableSurgeons() {
        return availableSurgeons;
    }

    public static void displayAvailableDoctors() {
        availableDoctors.stream().forEach((doctor) -> PRINT.info("{}\n", doctor));
    }

    public static void displayAvailableDiagnosticSpecialists() {
        availableDiagnosticSpecialists.stream().forEach((doctor) -> PRINT.info("{}\n", doctor));
    }

    public static void displayAvailableSurgeons() {
        availableSurgeons.stream().forEach((doctor) -> PRINT.info("{}\n", doctor));
    }
}
