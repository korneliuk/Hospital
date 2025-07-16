package com.solvd.hospital.diagnosticSpecialists;

import com.solvd.hospital.TestResult;
import com.solvd.hospital.doctors.Specialization;

public class NeurodiagnosticSpecialist extends AbstractDiagnosticSpecialist {

    private TestResult<Double> result;

    public NeurodiagnosticSpecialist(String name) {
        super(name);
    }

    @Override
    public TestResult<Double> getResult() {
        return result;
    }

    @Override
    public void analyzeResults() {
        LOGGER.info("{} is interpreting EEG and neuroimaging results.", name);
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
