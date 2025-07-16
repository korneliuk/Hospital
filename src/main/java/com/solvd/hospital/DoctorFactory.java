package com.solvd.hospital;

import com.solvd.hospital.doctors.*;
import com.solvd.hospital.doctors.psychiatrists.Psychiatrist;
import com.solvd.hospital.exceptions.InvalidSymptomException;

import java.util.HashMap;
import java.util.Map;

/**
 * The DoctorFactory provides static method for instantiation object of the appropriate specialist
 * based on array of the symptoms.
 */
public class DoctorFactory {

    /**
     * Fabric method for instantiation object of the appropriate specialist
     * based on array of the symptoms.
     *
     * @param userSymptoms represents array of the user's symptoms.
     * @return instance of the appropriate specialist type.
     */
    public static AbstractDoctor getDoctor(String[] userSymptoms)
            throws InvalidSymptomException {
        DiseaseType diseaseType = getMostCommonDiseaseType(userSymptoms);

        return switch (diseaseType) {
            case INFECTIOUS_DISEASES -> new InfectiousDiseaseSpecialist();
            case PNEUMONIA -> new Pulmonologist();
            case ALLERGIES -> new Allergist();
            case CARDIOVASCULAR_DISEASES -> new Cardiologist();
            case NEUROLOGICAL_DISEASES -> new Neurologist();
            case MUSCULOSKELETAL_SYSTEM -> new Orthopedist();
            case METABOLIC_DISORDERS -> new Endocrinologist();
            case MENTAL_HEALTH -> new Psychiatrist();
            case GASTROINTESTINAL_DISEASES -> new Gastroenterologist();
            case null -> throw new InvalidSymptomException("There are no recognized symptoms");
        };
    }

    /**
     * Determines the most common type of disease based on symptoms.
     *
     * @param userSymptoms represents array of the user's symptoms.
     * @return the most common disease type.
     */
    private static DiseaseType getMostCommonDiseaseType(String[] userSymptoms) {
        Map<DiseaseType, Integer> diseaseTypeRecurrence = new HashMap<>();

        for (String symptom : userSymptoms) {
            for (DiseaseType diseaseType : DiseaseType.values()) {

                String[] values = diseaseType.getValues();
                for (String value : values) {
                    if (value.equals(symptom)) {
                        diseaseTypeRecurrence.put(diseaseType,
                                diseaseTypeRecurrence.getOrDefault(diseaseType, 0) + 1);
                    }
                }
            }
        }

        int mostCommon = 0;
        DiseaseType mostCommonDiseaseType = null;

        // Use Entry to get key and value from the map.
        for (Map.Entry<DiseaseType, Integer> entry : diseaseTypeRecurrence.entrySet()) {
            if (entry.getValue() > mostCommon) {
                mostCommon = entry.getValue();
                mostCommonDiseaseType = entry.getKey();
            }
        }

        return mostCommonDiseaseType;
    }
}