
package model;
import interfaces.Prestable;



public class Libro implements Prestable {
    private String titulo;
    private boolean estado;
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, boolean estado, Autor autor) {
        this.titulo = titulo;
        this.estado = estado;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String prestar(){
        estado=false;
       
       return "libro prestado";
        
    }
     @Override
    public String devolver(){
       
        estado=true;
        return "libro devuelto";
    }
   
    
}
