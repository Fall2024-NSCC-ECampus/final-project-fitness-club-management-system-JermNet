package com.example.fitness.runner;

import com.example.fitness.util.AdminInitializer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Use this class so that the AdminInitializer class is actually called on startup
@Component
public class AppStartupRunner implements CommandLineRunner {
    private final AdminInitializer adminInitializer;

    public AppStartupRunner(AdminInitializer adminInitializer) {
        this.adminInitializer = adminInitializer;
    }

    @Override
    public void run(String... args) throws Exception {
        adminInitializer.initAdmin();
    }
}
