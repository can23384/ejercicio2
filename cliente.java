/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/


public class cliente{
    private String nombre;
    private int ocupantes;
    private int visitas;

    public cliente(String nombre, int ocupantes, int visitas){
        this.nombre = nombre;
        this.ocupantes = ocupantes;
        this.visitas = visitas;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getOcupantes(){
        return this.ocupantes;
    }

    public int getVisitas(){
        return this.visitas;
    }

    public void setOcupantes(int ocupantes){
        this.ocupantes = ocupantes; 
    }

    public void setVisitas(int visitas){
        this.visitas = visitas; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    
}


