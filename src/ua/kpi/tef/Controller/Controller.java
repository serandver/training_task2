package ua.kpi.tef.Controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        while (!model.checkValue(inputIntValueWithScanner(sc))){
            view.printWay(model);
        }

        view.printCongratulation(model);
    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(view.getMessageForOutput(model.getMinNumber(), model.getMaxNumber()));

        while( true ) {
            while (!sc.hasNextInt()) {
                view.printWrongIntInput(model);
                sc.next();
            }
            if ((res = sc.nextInt()) <= model.getMinNumber() ||
                    res >= model.getMaxNumber()) {
                view.printWrongRangeInput(model);
                continue ;
            }
            break;
        }
        return res;
    }
}
