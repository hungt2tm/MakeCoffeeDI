package jvb.com.makecoffeedi.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import jvb.com.makecoffeedi.model.ElectricHeater;
import jvb.com.makecoffeedi.model.Heater;

@Module(includes = PumpModule.class)
public class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
