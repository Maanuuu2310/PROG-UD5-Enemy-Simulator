package com.salesianos.zombie;

import com.salesianos.mobhostil.Mobhostil;

public class Zombie extends Mobhostil {
    public Zombie(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    public void moverse() {
        System.out.println("El zombie se mueve hacia el personaje.");
    }
}