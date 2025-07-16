package com.solvd.hospital.diagnosticSpecialists;

import com.solvd.hospital.TestResult;
import com.solvd.hospital.doctors.AbstractDoctor;
import com.solvd.hospital.doctors.Specialization;

public class Pathologist extends AbstractDiagnosticSpecialist {

    private TestResult<Double> result;

    public Pathologist(String name) {
        super(name);
    }

    @Override
    public TestResult<Double> getResult() {
        return result;
    }

    @Override
    public Specialization getSpecialization() {
        return null;
    }

    @Override
    public void analyzeResults() {
        LOGGER.info("{} is analyzing blood and tissue samples.", name);
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
