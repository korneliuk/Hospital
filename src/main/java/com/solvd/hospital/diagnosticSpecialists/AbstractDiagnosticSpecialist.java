package com.solvd.hospital.diagnosticSpecialists;

import com.solvd.hospital.TestResult;
import com.solvd.hospital.doctors.AbstractDoctor;

public abstract class AbstractDiagnosticSpecialist extends AbstractDoctor {

    private TestResult<?> result;

    public AbstractDiagnosticSpecialist(String name) {
        super(name);
    }

    public abstract TestResult<?> getResult();

    public abstract void analyzeResults();
}
