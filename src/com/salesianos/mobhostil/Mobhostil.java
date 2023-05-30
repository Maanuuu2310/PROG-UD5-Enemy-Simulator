package com.salesianos.mobhostil;

import com.salesianos.combate.Combate;
import com.salesianos.mob.Mob;

public abstract class Mobhostil extends Mob implements Combate {
    private int fuerza;

    public Mobhostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("¡El mob hostil recibió " + ataque + " puntos de daño! Salud restante: " + salud);
    }

    // Getter y setter de la fuerza

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
