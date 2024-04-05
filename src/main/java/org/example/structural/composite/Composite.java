package org.example.structural.composite;

import java.util.ArrayList;

public class Composite implements Component {

    String name;
    ArrayList<Component> components;

    //const default
    public Composite(){

    }

    public Composite(String name){
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void showPrice() {
        for (Component c : components){
            c.showPrice();
        }
    }

    public void add (Component subComponent){
        components.add(subComponent);
    }
}
