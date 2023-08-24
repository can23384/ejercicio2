/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

import java.util.*;


public class main{

    public static void main(String[] args){

        habitacion[] habitaciones = new habitacion[3];
        cliente[] Lista_espera = new cliente[5];
        cliente cliente = new cliente("ninguno", 0, 0);

        Scanner teclado = new Scanner(System.in);

        for(int count=0; count <3; count++){
            System.out.println("Ingrese los datos de la habitacion "+(count+1));
            System.out.println("Ingrese el nombre: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese el espacio: ");
            int espacio = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Ingrese la cantidad minima de visitas: ");
            int minimo = teclado.nextInt();
            teclado.nextLine();

            habitaciones[count] = new habitacion(nombre,espacio, minimo, false);
            System.out.println(habitaciones[count].getNombre());
        }

        

            
        System.out.println("==================");
        boolean hola = true;

        while(hola){
            System.out.println("==================");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. recibir huésped");
            System.out.println("2. asignar cliente a habitación");
            System.out.println("3. ver habitaciones");
            System.out.println("4. salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            System.out.println("==================");


            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.println("Ingrese el numero de ocupantes(los niños y adultos se consideran ocupantes, sin importar la edad: ");
                    int ocupantes = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese la cantidad de visitas del cliente: ");
                    int visitas = teclado.nextInt();
                    teclado.nextLine();

                    cliente.setNombre(nombre);
                    cliente.setOcupantes(ocupantes);
                    cliente.setVisitas(visitas);

                    break;

                case 2:
                    System.out.println("En que habitacion desea asignar a el cliente: ");
                    System.out.println("habitacion 1 ");
                    System.out.println("habitacion 2 ");
                    System.out.println("habitacion 3 ");
                    int option = teclado.nextInt();
                    teclado.nextLine();
                    switch (option){
                        case 1:
                            if(habitaciones[0].validaciones(cliente.getOcupantes(), cliente.getVisitas())){
                                System.out.println("Cliente asignado");
                                habitaciones[0].setOcupado(true);
                            }
                            else{
                                System.out.println("No se pudo asignar a el cliente, se habilito un espacio en lista de espera");
                                int nose = -1;
                                for (int i = 0; i < Lista_espera.length; i++) {
                                    if (Lista_espera[i] == null) {
                                        nose = i;
                                        break;
                                    }
                                }

                                if (nose != -1) {
                                    Lista_espera[nose] = cliente;
                                } 
                            }
                            break;

                        case 2:
                            if(habitaciones[1].validaciones(cliente.getOcupantes(), cliente.getVisitas())){
                                System.out.println("Cliente asignado");
                                habitaciones[1].setOcupado(true);
                            }
                            else{
                                System.out.println("No se pudo asignar a el cliente, se habilito un espacio en lista de espera");
                                int nose = -1;
                                for (int i = 0; i < Lista_espera.length; i++) {
                                    if (Lista_espera[i] == null) {
                                        nose = i;
                                        break;
                                    }
                                }

                                if (nose != -1) {
                                    Lista_espera[nose] = cliente;
                                } 
                            }
                            break;

                        case 3:
                            if(habitaciones[2].validaciones(cliente.getOcupantes(), cliente.getVisitas())){
                                System.out.println("Cliente asignado");
                                habitaciones[2].setOcupado(true);
                            }
                            else{
                                System.out.println("No se pudo asignar a el cliente, se habilito un espacio en lista de espera");
                                int nose = -1;
                                for (int i = 0; i < Lista_espera.length; i++) {
                                    if (Lista_espera[i] == null) {
                                        nose = i;
                                        break;
                                    }
                                }

                                if (nose != -1) {
                                    Lista_espera[nose] = cliente;
                                } 
                            }
                            break;

                    }
                    break;
                    

                case 3:
                    for (int i = 0; i < habitaciones.length; i++) {
                        System.out.println("Habitacion: "+habitaciones[i].getNombre());
                        System.out.println("Espacio: "+habitaciones[i].getEspacio());
                        System.out.println("Cantidad de visitas minima: "+habitaciones[i].getMin());
                        if(habitaciones[i].getOcupado()){
                            System.out.println("Ocupado: si");
                        }else{
                            System.out.println("Ocupado: NO");
                        }
                         System.out.println("-------------------");
                        
                    }
                    break;

                case 4:
                    hola = false;
                    break;

                    

            }




        }




    }

}