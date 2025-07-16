package com.solvd.hospital;

import com.solvd.hospital.doctors.AbstractDoctor;

import java.time.LocalDateTime;

public record Referral<T extends AbstractDoctor>(T referredDoctor, String reason, LocalDateTime dateIssued) {

    @Override
    public String toString() {
        return "Referral to: " + referredDoctor.getName() +
                " (" + referredDoctor.getSpecialization() + ")" +
                "\nReason: " + reason +
                "\nDate: " + dateIssued;
    }
}
