package controller;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import service.KekService;

import static spark.Spark.get;

public class KekController implements Controller {

    private final KekService kekService;

    @Inject
    public KekController(@Named("DefaultKekService") KekService kekService) {
        this.kekService = kekService;
    }

    public void defineController() {

        get(WebRoute.KEK, (rq,rs) -> kekService.getKek());

    }
}
