package com.solvd.hospital.doctors;

import com.solvd.hospital.interfaces.IReferralProvider;

import java.util.List;

public class GeneralPractitioner extends AbstractDoctor implements IReferralProvider {

    private static final Specialization specialization = Specialization.GENERAL_PRACTITIONER;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(String name) {
        super(name);
    }

    @Override
    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public List<String> getRecommendedTests(String[] symptoms) {
        return List.of();
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
