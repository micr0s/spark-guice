package controller;

public interface Controller {

    void defineController();

    class WebRoute {
        public static final String KEK = "/kek";
        public static final String NEW_KEK = "/kek/new";
    }
}
