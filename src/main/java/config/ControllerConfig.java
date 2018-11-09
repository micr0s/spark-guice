package config;

import com.google.inject.Inject;
import controller.Controller;

import java.util.Map;

public class ControllerConfig {

    private final Map<String, Controller> controllers;

    @Inject
    public ControllerConfig(Map<String, Controller> controllers) {
        this.controllers = controllers;
    }

    public void configure() {
        controllers.values().forEach(Controller::defineController);
    }
}
