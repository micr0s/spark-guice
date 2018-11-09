package config;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;
import controller.Controller;
import controller.EmptyController;
import controller.KekController;
import controller.NewKekController;
import service.KekService;
import service.impl.KekServiceImpl;
import service.impl.NewKekServiceImpl;

public class InjectionConfig extends AbstractModule {

    protected void configure() {
        configureControllers();
        bind(ControllerConfig.class);
        bind(KekService.class).annotatedWith(Names.named("DefaultKekService")).to(KekServiceImpl.class).in(Scopes.SINGLETON);
        bind(KekService.class).annotatedWith(Names.named("NewKekService")).to(NewKekServiceImpl.class).in(Scopes.SINGLETON);
    }

    private void configureControllers() {
        MapBinder <String, Controller> mapbinder = MapBinder.newMapBinder(binder(), String.class, Controller.class);
        mapbinder.addBinding("KekController").to(KekController.class);
        mapbinder.addBinding("EmptyController").to(EmptyController.class);
        mapbinder.addBinding("NewKekController").to(NewKekController.class);
    }

}
