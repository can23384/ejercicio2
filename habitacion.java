/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/
import java.util.*;


public class habitacion{
    private String nombre;
    private int espacio;
    private int minimo;
    private boolean ocupado;


    public habitacion(String nombre, int espacio, int minimo, boolean ocupado){
        this.nombre = nombre;
        this.espacio = espacio;
        this.minimo = minimo;
        this.ocupado = ocupado;
    }


    public String getNombre(){
        return this.nombre;
    }

    public int getMin(){
        return this.minimo;
    }

    public int getEspacio(){
        return this.espacio;
    }

    public boolean getOcupado(){
        return this.ocupado;
    }



    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public void setMin(int minimo){
        this.minimo = minimo; 
    }

    public void setEspacio(int espacio){
        this.espacio = espacio; 
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado; 
    }
    
    public boolean validaciones(int num, int num2){
        if (this.ocupado == false){
            if(this.espacio >= num){
                if(this.minimo <= num2){
                    return true;
                }else{
                    return false;
                }
            }else{
            return false;
            }
        }

        else{
            return false;
        }

    }
}

