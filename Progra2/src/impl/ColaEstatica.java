package impl;

import api.ColaTDA;

public class ColaEstatica implements ColaTDA{

    int [] vector;
    int i;

    public void InicializarCola(){

        vector=new int [100];
        i=0;
    }

    public void Acolar(int x){
        vector[i]=x;
        i++;
        
    }

    public void Desacolar(){
        i--;
    }

    public int Primero(){
        return(vector[i-1]);
    }
    
    public boolean ColaVacia(){
       return (i==0);
    }
    
}

