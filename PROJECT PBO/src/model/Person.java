package model;

public abstract class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract void getInfo();
}