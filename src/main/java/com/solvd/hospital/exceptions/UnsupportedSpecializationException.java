package com.solvd.hospital.exceptions;

import com.solvd.hospital.doctors.Specialization;

public class UnsupportedSpecializationException extends MedicalException {
    public UnsupportedSpecializationException(Specialization specialization) {
        super("Specialization not supported: " + specialization);
    }
}
