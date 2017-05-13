package ua.kpi.tef;

import ua.kpi.tef.Controller.Controller;
import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

public class Main {
    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.processUser();
    }
}
