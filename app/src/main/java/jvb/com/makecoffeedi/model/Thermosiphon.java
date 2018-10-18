package jvb.com.makecoffeedi.model;

import android.util.Log;

import javax.inject.Inject;

public class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            Log.d("CoffeeMaker", "Pumping...");
        }
    }
}
