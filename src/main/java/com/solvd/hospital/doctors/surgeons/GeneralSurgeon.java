package com.solvd.hospital.doctors.surgeons;

import com.solvd.hospital.doctors.Specialization;

public class GeneralSurgeon extends AbstractSurgeon {

    public GeneralSurgeon(String name) {
        super(name);
    }

    @Override
    public void performSurgery() {
        LOGGER.info("{} is performing appendectomy or hernia repair.", name);
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
        LOGGER.info("{} is treating acute abdominal pain.", name);
    }

    @Override
    public String generateReport() {
        return "";
    }
}
