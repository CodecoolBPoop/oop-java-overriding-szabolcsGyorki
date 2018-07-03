package com.codecool.uml.overriding;

public class Order implements Orderable {

    private static int nextId = 1;
    private final int id;
    private String status;

    public Order() {
        this.id = nextId++;
        this.status = "new";
    }

    @Override
    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "payed";
        return true;
    }

    public String getStatus() {
        return status;
    }
}
