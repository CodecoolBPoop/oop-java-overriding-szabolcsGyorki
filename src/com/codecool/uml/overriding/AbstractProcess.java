package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    private static int nextId = 1;
    private int id;

    AbstractProcess() {
        this.id = nextId++;
    }

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    };

    public void stepBefore() {
        System.out.println("Step before action!");
    };

    protected abstract void action(Orderable item);

    public void stepAfter() {
        System.out.println("Step after action!");
    };
}
