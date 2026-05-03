
package app;

import java.util.Scanner;
import model.Autor;
import model.Libro;
import service.bibliotecaService;
      

public class main {


    public static void main(String[] args) {
        System.out.println("_____BIBLIOTECA______");
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in); //scaner para datos de tipo int
        bibliotecaService service=new bibliotecaService();
        String titulo;
        String autor;
        boolean estado;
        boolean bandera2, bandera;
        String respuesta2;
        int respuesta;
        bandera2=true;
        bandera=true;
        int num;
        
      
        //hacemos while del menu de opciones
        while (bandera == true) {
            service.menu();
            System.out.println("Ingrese la opcion a escoger: ");
            respuesta = teclado2.nextInt();
            if (respuesta == 1) {
                while (bandera2 == true) {
                    System.out.println("Ingrese el titulo: ");
                    titulo = teclado.nextLine();
                    System.out.println("Ingrese el autor: ");
                    autor = teclado.nextLine();
                    Autor a = new Autor(autor);
                    estado = true;
                    Libro li = new Libro(titulo, estado, a);
                    service.agregarLibro(li);
                    System.out.println("\n Desea seguir añadiendo? responda s/n");
                    respuesta2 = teclado.nextLine();

                    if (respuesta2.equalsIgnoreCase("s")) {
                        bandera2 = true;
                    } else {
                        bandera2 = false;
                    }

                }

            }
            if (respuesta == 2) {
                System.out.println("debug tamaño: " + service.getLibros().size());
                service.mostrarLibros();
            }
            if(respuesta==3){
                service.mostrarLibros();
                  System.out.println("Ingrese el numero del libro que desea prestar");
                  num=teclado2.nextInt();
                  service.prestarLibro(num);
         
            }
             if(respuesta==4){
                service.mostrarLibros();
                  System.out.println("Ingrese el numero del libro que desea devolver");
                  num=teclado2.nextInt();
                  service.devolverLibro(num);
       
            }
             if(respuesta==5){
                 bandera=false;
             }
        }
        
      
      
      
        
      
    }
    
}
