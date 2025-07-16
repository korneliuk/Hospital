package com.solvd.hospital.doctors;

import java.util.Objects;

public class Allergist extends AbstractDoctor {

    private static final Specialization specialization = Specialization.ALLERGIST;

    public Allergist() {
        super();
    }

    public Allergist(String name) {
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
    public boolean acceptsChildPatients() {
        return false;
    }

    @Override
    public String generateReport() {
        return "";
    }
}
