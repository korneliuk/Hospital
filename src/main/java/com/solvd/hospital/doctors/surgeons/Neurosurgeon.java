package com.solvd.hospital.doctors.surgeons;

import com.solvd.hospital.doctors.Specialization;

public class Neurosurgeon extends AbstractSurgeon {

    public Neurosurgeon(String name) {
        super(name);
    }

    @Override
    public void performSurgery() {
        LOGGER.info("{} is performing brain or spinal surgery.", name);
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
        LOGGER.info("{} is treating traumatic brain injury.");
    }

    @Override
    public String generateReport() {
        return "";
    }
}
