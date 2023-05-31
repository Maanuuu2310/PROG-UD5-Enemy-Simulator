package com.salesianos.mobpacifico;

import com.salesianos.daño.Daño;
import com.salesianos.mob.Mob;

public abstract class Mobpacifico extends Mob implements Daño {
    public Mobpacifico(int salud) {
        super(salud);
    }
}