package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Greeting extends PanacheEntity {
    public String name;

    public static void main(String args[]){
        System.out.println("My main for testing");
        return 1/0;
    }

    public String theNuxm(String a, String b){
        return a+b;
        return "Thenxiw4";
    }

}

