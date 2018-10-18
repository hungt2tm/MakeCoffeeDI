package jvb.com.makecoffeedi;

import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
import jvb.com.makecoffeedi.model.Heater;
import jvb.com.makecoffeedi.model.Pump;

public class CoffeeMaker {
    private final Lazy<Heater> heater;
    private final Pump pump;

    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    void brew() {
        heater.get().on();
        pump.pump();
        Log.d("CoffeeMaker", "Coffee!!!");
        heater.get().off();
    }
}
