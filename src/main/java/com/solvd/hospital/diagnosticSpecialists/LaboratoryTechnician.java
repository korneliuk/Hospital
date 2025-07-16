package com.solvd.hospital.diagnosticSpecialists;

import com.solvd.hospital.TestResult;
import com.solvd.hospital.doctors.Specialization;

public class LaboratoryTechnician extends AbstractDiagnosticSpecialist {

    private TestResult<Double> result;

    public LaboratoryTechnician(String name) {
        super(name);
    }

    @Override
    public TestResult<Double> getResult() {
        return result;
    }

    @Override
    public void analyzeResults() {
        LOGGER.info("{} is reviewing lab test data.", name);
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
    public String generateReport() {
        return "";
    }
}
