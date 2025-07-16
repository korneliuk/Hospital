package com.solvd.hospital;

import com.solvd.hospital.doctors.AbstractDoctor;

public record RatedDoctor<T extends AbstractDoctor>(T doctor, double rating) {

    @Override
    public String toString() {
        return doctor.getName() + " (" + doctor.getSpecialization() + ") - Rating: " + rating;
    }
}
