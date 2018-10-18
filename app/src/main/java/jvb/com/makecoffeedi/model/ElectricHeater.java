package jvb.com.makecoffeedi.model;

import android.util.Log;

public class ElectricHeater implements Heater {
    private boolean mHeating;

    @Override
    public void on() {
        Log.d("CoffeeMaker", "Heating...On");
        this.mHeating = true;
    }

    @Override
    public void off() {
        Log.d("CoffeeMaker", "Heating...Off");
        this.mHeating = false;
    }

    @Override
    public boolean isHot() {
        return mHeating;
    }
}
