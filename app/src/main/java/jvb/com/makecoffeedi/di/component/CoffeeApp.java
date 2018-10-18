package jvb.com.makecoffeedi.di.component;

import javax.inject.Singleton;

import dagger.Component;
import jvb.com.makecoffeedi.di.module.DripCoffeeModule;
import jvb.com.makecoffeedi.CoffeeMaker;

public class CoffeeApp {
    @Singleton
    @Component(modules = DripCoffeeModule.class)
    public interface CoffeeShop {
        CoffeeMaker maker();
    }
}
