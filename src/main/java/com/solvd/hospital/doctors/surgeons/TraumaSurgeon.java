package com.solvd.hospital.doctors.surgeons;

import com.solvd.hospital.doctors.Specialization;

public class TraumaSurgeon extends AbstractSurgeon {

    public TraumaSurgeon(String name) {
        super(name);
    }

    @Override
    public void performSurgery() {
        LOGGER.info("{} is performing emergency trauma surgery.", name);
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
        LOGGER.info("{} is stabilizing patient after accident.", name);
    }

    @Override
    public String generateReport() {
        return "";
    }
}
