package jvb.com.makecoffeedi.di.module;

import dagger.Binds;
import dagger.Module;
import jvb.com.makecoffeedi.model.Pump;
import jvb.com.makecoffeedi.model.Thermosiphon;

@Module
public abstract class PumpModule {
    @Binds
    public abstract Pump providePump(Thermosiphon pump);
}
