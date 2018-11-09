import com.google.inject.Guice;
import com.google.inject.Injector;
import config.ControllerConfig;
import config.InjectionConfig;

public class StackTest {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new InjectionConfig());
        injector.getInstance(ControllerConfig.class).configure();
    }
}
