package com.solvd.hospital;

public enum DiseaseType {
    INFECTIOUS_DISEASES("fever", "chills", "sore throat", "runny nose"),

    PNEUMONIA("chest pain when breathing or coughing", "productive cough (with phlegm)",
            "fever and chills", "shortness of breath"),

    ALLERGIES("sneezing", "runny or stuffy nose", "itchy eyes, nose, or throat", "watery eyes",
            "skin rash or hives", "swelling (e.g. lips, eyes)"),

    CARDIOVASCULAR_DISEASES("chest pain or pressure", "pain radiating to arm, neck, jaw",
            "nausea", "shortness of breath", "cold sweat", "dizziness"),

    NEUROLOGICAL_DISEASES("sudden numbness or weakness (especially one side)",
            "confusion", "trouble speaking", "loss of balance",
            "blurred vision", "throbbing headache (usually one side)"),

    MUSCULOSKELETAL_SYSTEM("joint pain", "swelling",
            "stiffness (especially in the morning)", "reduced range of motion"),

    METABOLIC_DISORDERS("frequent urination", "excessive thirst", "unexplained weight loss",
            "blurred vision", "slow healing of wounds", "fatigue"),

    MENTAL_HEALTH("persistent sadness", "loss of interest", "sleep disturbances", "fatigue",
            "slow healing of wounds", "changes in appetite", "thoughts of death or suicide",
            "restlessness", "rapid heartbeat", "excessive worry", "muscle tension"),

    GASTROINTESTINAL_DISEASES("stomach pain", "nausea", "vomiting", "bloating",
            "loss of appetite", "abdominal pain");

    private final String[] values;

    DiseaseType(String... values) {
        this.values = values;
    }

    public String[] getValues() {
        return values;
    }
}