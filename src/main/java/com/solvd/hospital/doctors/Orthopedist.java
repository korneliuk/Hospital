package com.solvd.hospital.doctors;

public class Orthopedist extends AbstractDoctor {

    private static final Specialization specialization = Specialization.ORTHOPEDIST;

    public Orthopedist() {
        super();
    }

    public Orthopedist(String name) {
        super(name);
    }

    @Override
    public Specialization getSpecialization() {
        return specialization;
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
