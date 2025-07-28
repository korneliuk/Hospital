package com.solvd.forwardList.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class BenchmarkProcessor {

    private final List<Method> benchmarkedMethods = new ArrayList<>();
    private final List<Constructor<?>> benchmarkedConstructors = new ArrayList<>();

    public List<Method> getBenchmarkedMethods() {
        return benchmarkedMethods;
    }

    public List<Constructor<?>> getBenchmarkedConstructors() {
        return benchmarkedConstructors;
    }

    public void scanClass(Class<?> clazz) {
        for(Method method : clazz.getDeclaredMethods()) {
            if(method.isAnnotationPresent(Benchmark.class)) {
                benchmarkedMethods.add(method);
            }
        }

        for(Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            if(constructor.isAnnotationPresent(Benchmark.class)) {
                benchmarkedConstructors.add(constructor);
            }
        }
    }
}
