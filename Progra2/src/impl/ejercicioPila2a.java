package impl;

import api.PilaTDA;
import algoritmos.metodosPila;

public class ejercicioPila2a {
    public static void main(String[] args) throws Exception {
        
        PilaTDA p1 = new PilaDinamica();
        
        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);

        PilaTDA p2 = new PilaDinamica();
        p2.InicializarPila();

        System.out.println("Pila 1");
        metodosPila.mostrarPila(p1);

        metodosPila.pasarPila(p1, p2);

        System.out.println("Pila 2");
        metodosPila.mostrarPila(p2);

    }
}
