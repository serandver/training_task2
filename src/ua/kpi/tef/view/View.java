package ua.kpi.tef.view;

import ua.kpi.tef.model.Model;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_PATH = "ua.kpi.tef.resources.messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_PATH,
            new Locale("ua"));  // Ukrainian

    // Text's constants
    private static String EQUAL_SING = "=";
    private static String SPACE_SING = " ";
    private static String OPENS_SQUARE_BRACKET = "[";
    private static String CLOSING_SQUARE_BRACKET = "]";

    private static String INPUT_INT_DATA_KEY = "input.int.data";
    private static String WRONG_INPUT_INT_DATA = "input.wrong.data";
    private static String WRONG_RANGE_DATA = "input.wrong.range";
    private static String CONGRATULATION = "input.congratulation";
    private static String YOUR_WAY = "input.way";
    private static String INPUT_SCOPE = "input.scope";

    public void printMessage(String message) {
        System.out.println(message);
    }

    private String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public String getMessageForOutput(int min, int max) {
        String str = concatenationString(bundle.getString(INPUT_INT_DATA_KEY), SPACE_SING, bundle.getString(INPUT_SCOPE),
                OPENS_SQUARE_BRACKET, String.valueOf(min), SPACE_SING, String.valueOf(max), CLOSING_SQUARE_BRACKET, SPACE_SING);
        return str;
    }

    public void printWrongRangeInput(Model model) {
        printMessage(bundle.getString(WRONG_RANGE_DATA) +
                getMessageForOutput(model.getMinNumber(), model.getMaxNumber()));
    }

    public void printWrongIntInput(Model model) {
        printMessage(bundle.getString(WRONG_INPUT_INT_DATA) +
                getMessageForOutput(model.getMinNumber(), model.getMaxNumber()));
    }

    public void printCongratulation(Model model) {
        printMessage(bundle.getString(CONGRATULATION) +
                model.getSecretNumber());
    }

    public void printWay(Model model) {
        printMessage(bundle.getString(YOUR_WAY) +
                String.valueOf(model.getYourWay()));
    }
}
