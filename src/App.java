import java.util.Random;
import java.util.Scanner;

import com.salesianos.mobhostil.Mobhostil;
import com.salesianos.personaje.Personaje;
import com.salesianos.zombie.Zombie;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego!");


        System.out.println("Elige el arma que llevará tu personaje en esta ronda:");
        System.out.println("1. Ninguna");
        System.out.println("2. Espada madera");
        System.out.println("3. Espada de hierro");
        System.out.println("4. Espada de diamante");
        int opcionArma = scanner.nextInt();


        System.out.println("Elige la armadura que llevará tu personaje en esta ronda:");
        System.out.println("1. Ninguna");
        System.out.println("2. De cuero");
        System.out.println("3. De hierro");
        System.out.println("4. De diamante");
        int opcionArmadura = scanner.nextInt();

        int fuerza = obtenerFuerzaArma(opcionArma);
        int defensa = obtenerDefensaArmadura(opcionArmadura);
        Personaje personaje = new Personaje(defensa, fuerza);


        int saludMob = 10;
        int fuerzaMob = 4;
        Mobhostil mob = new Zombie(saludMob, fuerzaMob);


        int turnos = 0;
        while (personaje.getSalud() > 0 && mob.getSalud() > 0) {

            int ataquePersonaje = personaje.atacar();
            mob.recibirAtaque(ataquePersonaje);


            int opcionMob = random.nextInt(2); 
            if (opcionMob == 0) {
                int ataqueMob = mob.atacar();
                personaje.recibirAtaque(ataqueMob);
            } else {
                mob.moverse();
            }

            turnos++;
        }


        if (personaje.getSalud() <= 0) {
            System.out.println("El personaje ha sido derrotado en " + turnos + " turnos. ¡El mob hostil ha ganado!");
        } else {
            System.out.println("El personaje ha ganado en " + turnos + " turnos. ¡El mob hostil ha sido derrotado!");
        }
    }


    private static int obtenerFuerzaArma(int opcionArma) {
        switch (opcionArma) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 5;
            default:
                return 1;
        }
    }


    private static int obtenerDefensaArmadura(int opcionArmadura) {
        switch (opcionArmadura) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }
}

