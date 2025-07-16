package com.solvd.hospital.doctors;

import com.solvd.hospital.interfaces.IEmergencyReady;
import com.solvd.hospital.interfaces.IReferralProvider;

import java.util.List;

public class Pulmonologist extends AbstractDoctor implements IReferralProvider, IEmergencyReady {

    private static final Specialization specialization = Specialization.PULMONOLOGIST;

    public Pulmonologist() {
        super();
    }

    public Pulmonologist(String name) {
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
    public void performEmergencyProcedure() {

    }

    @Override
    public String generateReport() {
        return "";
    }
}
