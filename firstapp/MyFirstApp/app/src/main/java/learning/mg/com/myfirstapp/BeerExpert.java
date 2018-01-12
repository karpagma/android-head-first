package learning.mg.com.myfirstapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m0g00rh on 1/11/18.
 */

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
