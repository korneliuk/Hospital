package com.solvd.hospital.doctors.pediatricians;

import com.solvd.hospital.doctors.AbstractDoctor;

public abstract class AbstractPediatrician extends AbstractDoctor {

    public abstract void treatChildPatient();

    @Override
    public boolean acceptsChildPatients() {
        return true;
    }
}
