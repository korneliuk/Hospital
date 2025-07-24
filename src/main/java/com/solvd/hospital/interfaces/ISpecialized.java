package com.solvd.hospital.interfaces;

import com.solvd.hospital.doctors.Specialization;

@FunctionalInterface
public interface ISpecialized {
    Specialization getSpecialization();
}
