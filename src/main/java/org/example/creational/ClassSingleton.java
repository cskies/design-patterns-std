package org.example.creational;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassSingleton {
    private String info = "Initial info class";
    private static ClassSingleton uniqueInstance;

    //private const avoid new
    private ClassSingleton() {
    }

    //synchronized ensure method will not be called for more than 1 one thread same time
    public static synchronized ClassSingleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new ClassSingleton();

        return uniqueInstance;
    }
}
