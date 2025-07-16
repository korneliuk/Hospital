package com.solvd.hospital.doctors;

import com.solvd.hospital.interfaces.IEmergencyReady;

import java.util.Objects;

public class Cardiologist extends AbstractDoctor implements IEmergencyReady {

    private static final Specialization specialization = Specialization.CARDIOLOGIST;

    public Cardiologist() {
        super();
    }

    public Cardiologist(String name) {
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
    public void performEmergencyProcedure() {

    }

    @Override
    public String generateReport() {
        return "";
    }
}
