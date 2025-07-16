package com.solvd.hospital.doctors.surgeons;

import com.solvd.hospital.doctors.AbstractDoctor;
import com.solvd.hospital.interfaces.IEmergencyReady;

public abstract class AbstractSurgeon extends AbstractDoctor implements IEmergencyReady {

    public AbstractSurgeon(String name) {
        super(name);
    }

    public abstract void performSurgery();
}
