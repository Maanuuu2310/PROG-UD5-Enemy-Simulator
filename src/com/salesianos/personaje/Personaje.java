public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;
    
    public Personaje(int defensa, int fuerza) {
        this.salud = 12; // salud por defecto
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int damage = ataque - defensa;
        if (damage > 0) {
            salud -= damage;
            System.out.println("¡El personaje recibió " + damage + " puntos de daño! Salud restante: " + salud);
        } else {
            System.out.println("¡El personaje ha bloqueado todo el daño! Salud restante: " + salud);
        }
    }
    
    // Getters y setters
    
    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
