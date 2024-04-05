package org.example;

import org.example.creational.builder.Employee;
import org.example.creational.singleton.ClassSingleton;
import org.example.structural.composite.Component;
import org.example.structural.composite.Composite;
import org.example.structural.composite.Leaf;

public class Main {
    public static void main(String[] args) {
        //creational
        singleton();
        builder();

        //structural
        composite();
    }

    //CREATIONAL
    private static void builder() {
        var employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
    }

    private static void singleton() {
        var single = ClassSingleton.getInstance();
        var single2 = ClassSingleton.getInstance();
        System.out.println(single2.getInfo());
    }

    //STRUCTURAL
    private static void composite() {
        Component hdd       = new Leaf("hdd" , 4000.0);
        Component keyboard  = new Leaf("keyboard",1000.0);
        Component mouse     = new Leaf("mouse",500.0);
        Component ram       = new Leaf("ram",3000.0);
        Component processor = new Leaf("Processor",10000.0);

        Composite computer = new Composite("computer");

        Composite motherboard = new Composite("motherboard");
        motherboard.add(ram);
        motherboard.add(processor);


        Composite cabinet  = new Composite("cabinet");
        cabinet.add(hdd);
        cabinet.add(motherboard);

        Composite peripherals     = new Composite("peripherals");
        peripherals.add(keyboard);
        peripherals.add(mouse);

        computer.add(cabinet);
        computer.add(peripherals);

        computer.showPrice();
    }
}