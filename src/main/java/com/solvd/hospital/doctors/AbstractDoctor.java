package com.solvd.hospital.doctors;

import com.solvd.hospital.interfaces.IChildSpecialist;
import com.solvd.hospital.interfaces.IReportable;
import com.solvd.hospital.interfaces.ISpecialized;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class AbstractDoctor implements IChildSpecialist, IReportable {

    protected Logger LOGGER = LogManager.getLogger(AbstractDoctor.class);

    protected String name;

    public AbstractDoctor() {
        LOGGER.debug("{} constructor called", getClass().getSimpleName());

        this.name = null;
    }

    public AbstractDoctor(String name) {
        LOGGER.debug("{} constructor called with parameter name = {}", getClass().getSimpleName(), name);

        this.name = name;
    }

    public void setName(String name) {
        LOGGER.debug("Setting name {} for doctor {}", name, getClass().getSimpleName());

        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final ISpecialized specialized = () -> {
        return Specialization.GENERAL_PRACTITIONER;
    };

    public Specialization getSpecialization() {
        return specialized.getSpecialization();
    }

    @Override
    public String toString() {
        return "Doctor: " + name + "\n" + getSpecialization().getDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDoctor that = (AbstractDoctor) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
