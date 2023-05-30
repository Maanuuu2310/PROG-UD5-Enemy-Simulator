package com.salesianos.mob;

public abstract class Mob {
    protected int salud;

    public Mob(int salud) {
        this.salud = salud;
    }

    public abstract void moverse();

    // Getters y setters

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
