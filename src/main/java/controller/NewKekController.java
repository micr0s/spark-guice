package controller;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import service.KekService;

import static spark.Spark.get;

public class NewKekController implements Controller {

    private final KekService kekService;

    @Inject
    public NewKekController(@Named("NewKekService") KekService kekService) {
        this.kekService = kekService;
    }

    @Override
    public void defineController() {
        get(WebRoute.NEW_KEK, (rq,rs) -> kekService.getKek());
    }
}
