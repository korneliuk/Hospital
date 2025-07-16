package com.solvd.hospital.interfaces;

import java.util.List;

public interface IReferralProvider {
    List<String> getRecommendedTests(String[] symptoms);
}
