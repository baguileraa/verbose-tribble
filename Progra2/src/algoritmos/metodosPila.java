package algoritmos;

import api.PilaTDA;
import impl.PilaDinamica;

public class metodosPila {
    public static void pasarPila(PilaTDA pila1, PilaTDA pila2){

        while (!pila1.PilaVacia()){
            //Copiar invertidamente
            pila2.Apilar(pila1.Tope());
            pila1.Desapilar();
        }

    }

    public static void copiarPila (PilaTDA pila1, PilaTDA pila2){
        //Copiar en el mismo orden
        PilaTDA aux = new PilaDinamica();
        aux.InicializarPila();

        pasarPila(pila1, aux);

        while (!aux.PilaVacia()){
            pila1.Apilar(aux.Tope());
            pila2.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }


    public static void mostrarPila(PilaTDA pilaMostrar){

        PilaTDA aux = new PilaDinamica();

        aux.InicializarPila();

        while (!pilaMostrar.PilaVacia()){

            System.out.println(pilaMostrar.Tope());
            aux.Apilar(pilaMostrar.Tope());
            pilaMostrar.Desapilar();

            

        }

    pasarPila(aux, pilaMostrar);

    }

}
