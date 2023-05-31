package com.salesianos.oveja;

import com.salesianos.mobpacifico.Mobpacifico;

public class Oveja extends Mobpacifico {
    public Oveja(int salud) {
        super(salud);
    }

    @Override
    public void moverse() {
        System.out.println("La oveja se mueve por el campo.");
    }

    @Override
    public void recibirAtaque(int ataque) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recibirAtaque'");
    }
}