package jvb.com.makecoffeedi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import jvb.com.makecoffeedi.di.component.CoffeeApp;
import jvb.com.makecoffeedi.di.component.DaggerCoffeeApp_CoffeeShop;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeeApp.CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
        coffeeShop.maker().brew();
    }
}
