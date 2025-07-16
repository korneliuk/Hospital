package com.solvd.hospital.doctors.surgeons;

import com.solvd.hospital.doctors.Specialization;

public class CardiacSurgeon extends AbstractSurgeon {

    public CardiacSurgeon(String name) {
        super(name);
    }

    @Override
    public void performSurgery() {
    LOGGER.info("{} is performing open-heart surgery.", name);
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
        LOGGER.info("{} is performing cardiac emergency.");
    }

    @Override
    public String generateReport() {
        return "";
    }
}
