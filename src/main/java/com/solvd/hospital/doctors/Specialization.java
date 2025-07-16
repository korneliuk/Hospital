package com.solvd.hospital.doctors;

public enum Specialization {
    GENERAL_PRACTITIONER("""
            Specialization: General practitioner
            Description:
            A General Practitioner provides basic medical care, treats a wide range of symptoms, \
            and refers patients to specialists if needed.
            """),

    GASTROENTEROLOGIST("""
            Specialization: Gastroenterologist
            Description:
            A doctor who treats disorders of the digestive system.
            Common cases: ulcers, gastritis, IBS, liver disease, pancreatitis, constipation.
            """),

    CARDIOLOGIST("""
            Specialization: Cardiologist
            Description:
            A doctor who specializes in diagnosing and treating heart and blood vessel conditions.
            Common cases: hypertension, heart attack, arrhythmias, heart failure.
            """),

    INFECTIOUS_DISEASE_SPECIALIST("""
            Specialization: InfectiousDiseaseSpecialist
            Description:
            A doctor who diagnoses and treats complex infections caused by bacteria, viruses, fungi, or parasites.
            Common cases: HIV, tuberculosis, chronic infections, antibiotic-resistant bacteria.
            """),

    NEUROLOGIST("""
            Specialization: Neurologist
            Description:
            A doctor focused on disorders of the nervous system, including the brain, spinal cord, and nerves.
            Common cases: stroke, epilepsy, migraine, Parkinson’s disease, multiple sclerosis.
            """),

    ALLERGIST("""
            Specialization: Allergist
            Description:
            A specialist in diagnosing and managing allergic reactions and immune system disorders.
            Common cases: hay fever, food allergies, skin rashes, asthma, anaphylaxis.
            """),

    ORTHOPEDIST("""
            Specialization: Orthopedist
            Description:
            A doctor who treats injuries and diseases of the bones, joints, muscles, ligaments, and tendons.
            Common cases: arthritis, fractures, back pain, joint pain, sports injuries.
            """),

    PSYCHIATRIST("""
            Specialization: Psychiatrist
            Description:
            A medical doctor who diagnoses and treats mental, emotional, and behavioral disorders.
            Common cases: depression, anxiety, bipolar disorder, schizophrenia.
            """),

    PULMONOLOGIST("""
            Specialization: Pulmonologist
            Description:
            A doctor specialized in respiratory system diseases, including the lungs and bronchial tubes.
            Common cases: pneumonia, asthma, bronchitis, COPD, lung infections.
            """),

    ENDOCRINOLOGIST("""
            Specialization: Endocrinologist
            Description:
            A specialist in hormonal and metabolic diseases.
            Common cases: diabetes, thyroid disease, obesity, adrenal or pituitary disorders.
            """);

    private final String description;

    Specialization(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}