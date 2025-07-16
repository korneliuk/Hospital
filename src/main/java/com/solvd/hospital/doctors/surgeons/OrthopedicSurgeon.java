package com.solvd.hospital.doctors.surgeons;

import com.solvd.hospital.doctors.Specialization;

public class OrthopedicSurgeon extends AbstractSurgeon{

    public OrthopedicSurgeon(String name) {
        super(name);
    }

    @Override
    public void performSurgery() {
        LOGGER.info("{} is repairing broken bones or joints.", name);
    }

    @Override
    public Specialization getSpecialization() {
        return null;
    }

    @Override
    public boolean acceptsChildPatients() {
        return false;
    }

    @Override
    public void performEmergencyProcedure() {
        LOGGER.info("{} is treating fracture in ER.", name);
    }

    @Override
    public String generateReport() {
        return "";
    }
}
