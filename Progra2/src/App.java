import api.ColaTDA;
import api.PilaTDA;
import impl.ColaDinamica;
import impl.PilaDinamica;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        PilaTDA p1 = new PilaDinamica();

        PilaTDA p2 = new PilaDinamica();
        
        PilaTDA p3 = new PilaDinamica();

        p1.InicializarPila();
        p2.InicializarPila();
        p3.InicializarPila();


        for(int i=0; i<=20; i++){
            p1.Apilar(i);

        }

        System.out.println("---PILA 1---");

        while(!p1.PilaVacia()){

            p2.Apilar(p1.Tope());
            System.out.println(p1.Tope());
            p1.Desapilar();
            
        }

        while(!p2.PilaVacia()){

            p3.Apilar(p2.Tope());
            p2.Desapilar();
            
        }

        System.out.println("---PILA 2---");

        while(!p3.PilaVacia()){

            System.out.println(p3.Tope());
            p3.Desapilar();

        }*/
        
        ColaTDA colaEj2 = new ColaDinamica(); 

        colaEj2.InicializarCola();

        for(int i = 0; i>5; i++){
            colaEj2.acolar(i);
        }

        System.out.println(colaEj2.Primero());

    }
}
