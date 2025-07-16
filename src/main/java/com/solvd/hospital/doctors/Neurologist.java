package com.solvd.hospital.doctors;

public class Neurologist extends AbstractDoctor {

    private static final Specialization specialization = Specialization.NEUROLOGIST;

    public Neurologist() {
        super();
    }

    public Neurologist(String name) {
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
