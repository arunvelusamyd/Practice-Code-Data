package com.revise.handon;

import java.util.Objects;

public class Animal {
    private String name;
    private String type;
    private int id;

    public Animal(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Animal) {
            Animal animal = (Animal) object;
            if(this.name.equals(animal.getName()) && this.type.equals(animal.getType()))
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        //return Objects.hash(this.name,this.type);
        return this.type.hashCode();
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", "domestic",1);
        Animal animal2 = new Animal("Cat", "domestic",2);
        Animal animal3 = new Animal("Cat", "Wild",3);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal3.hashCode());
    }
}
