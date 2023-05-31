package com.salesianos.enderman;

import com.salesianos.mobhostil.Mobhostil;

public class Enderman extends Mobhostil {
    public Enderman(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    public void moverse() {
        System.out.println("El enderman se teletransporta detrás.");
    }
}
