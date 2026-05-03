
package service;
import java.util.ArrayList;
import model.Libro;

public class bibliotecaService {
      ArrayList<Libro> libros=new ArrayList<>();

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void menu() {
        System.out.println("--------------------------------");
        System.out.println("1.- Agregar libro");
        System.out.println("2.- mostrar libros");
        System.out.println("3.- prestrar libro");
        System.out.println("4.- devolver libro");
        System.out.println("5.- salir");
        System.out.println("--------------------------------");
    }


      
      public void agregarLibro(Libro libro){
          
          libros.add(libro);
      }
      public void mostrarLibros(){
          int cont=0;
          for (Libro lb: libros){
              cont++;
              System.out.println(cont+".-"+lb.getTitulo()+ " - "+lb.getAutor().getNombre()+" - ");
              if(lb.isEstado()==true){
                  System.out.println("libro disponible");
              }
              else{
                  System.out.println("libro no disponible");
              }
         
              
          }
      }
      public void prestarLibro(int num){
          int cont=0;
         if(num>0 &&(num-1)<libros.size() && (libros.get(num-1).isEstado()==true)){
              Libro numPrestar=libros.get(num-1);
               numPrestar.prestar();
               
               System.out.println("Lista de libros no disponibles para prestar: ");
               for(Libro lb: libros   ){
                   
                   
                   if(lb.isEstado()==false){
                       cont++;
                        System.out.println(cont+".-"+lb.getTitulo());
                   }
                  
               }
         }
         else{
             System.out.println("Error al introducir el libro que desea prestar");
         }
         
        
          
      }
      public void devolverLibro(int num){
          int cont = 0;
          if (num > 0 && (num - 1) < libros.size() && (libros.get(num - 1).isEstado() == false)) {

              Libro numDevolver = libros.get(num - 1);
              numDevolver.devolver();
             
              System.out.println("Lista de libros disponibles para prestar: ");
              for (Libro lb : libros) {
                  
                  if (lb.isEstado() == true) {
                      cont++;
                      System.out.println(cont + ".-" + lb.getTitulo());
                  }

              }
          } else {
              System.out.println("Error al introducir el libro que desea devolver");
          }
         
      }
 
}
