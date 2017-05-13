package ua.kpi.tef.model;

import ua.kpi.tef.Controller.GlobalConstants;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minNumber = GlobalConstants.PRIMARY_MIN_BARRIER;
    private int maxNumber = GlobalConstants.PRIMARY_MAX_BARRIER;
    private int secretNumber;
    private List<Integer> yourWay = new ArrayList<Integer>();

    public Model() {
        secretNumber = randomNumber(minNumber, maxNumber);
    }

    public Model(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        secretNumber = randomNumber(minNumber, maxNumber);
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public List<Integer> getYourWay() {
        return yourWay;
    }

    public boolean checkValue (int value){
        yourWay.add(value);
        if (value == secretNumber){
            return true;
        } else if (value > secretNumber){
            maxNumber = value;
        } else {
            minNumber = value;
        }
        return false;
    }

    private int randomNumber(int minNumber, int maxNumber) {
        int scope = maxNumber - minNumber;
        scope++;
        return (int) (Math.random() * scope) + minNumber;
    }
}
