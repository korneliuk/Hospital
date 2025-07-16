package com.solvd.hospital.doctors.psychiatrists;

import com.solvd.hospital.doctors.AbstractDoctor;
import com.solvd.hospital.doctors.Specialization;

public class Psychiatrist extends AbstractDoctor {

    private static final Specialization specialization = Specialization.PSYCHIATRIST;

    public Psychiatrist() {
        super();
    }

    public Psychiatrist(String name) {
        super(name);
    }

    @Override
    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Doctor: " + name + ", Specialization: " + specialization;
    }

    @Override
    public boolean acceptsChildPatients() {
        return false;
    }

    @Override
    public String generateReport() {
        return "";
    }
}
