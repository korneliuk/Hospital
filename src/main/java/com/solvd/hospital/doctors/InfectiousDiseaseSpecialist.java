package com.solvd.hospital.doctors;

public class InfectiousDiseaseSpecialist extends AbstractDoctor {

    private static final Specialization specialization = Specialization.INFECTIOUS_DISEASE_SPECIALIST;

    public InfectiousDiseaseSpecialist() {
        super();
    }

    public InfectiousDiseaseSpecialist(String name) {
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
