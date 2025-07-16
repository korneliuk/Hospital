package com.solvd.hospital.doctors;

import com.solvd.hospital.interfaces.IReferralProvider;

import java.util.List;
import java.util.Objects;

public class Endocrinologist extends AbstractDoctor implements IReferralProvider {

    private static final Specialization specialization = Specialization.ENDOCRINOLOGIST;

    public Endocrinologist() {
        super();
    }

    public Endocrinologist(String name) {
        super(name);
    }

    @Override
    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDoctor that = (AbstractDoctor) o;
        return Objects.equals(specialization, that.getSpecialization());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name) + Objects.hashCode(specialization);
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
