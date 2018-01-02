package com.hfad.beeradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramesh on 30/12/17.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if ( color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Scout");
        }
        return brands;
    }
}

