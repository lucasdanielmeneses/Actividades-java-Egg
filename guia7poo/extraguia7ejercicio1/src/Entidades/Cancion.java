/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos 
 * constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros 
 * el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package Entidades;

/**
 *
 * @author Lucas
 */
public class Cancion {

    public String Titulo; //crtl + shift + abajo  --- > copia y pega la linea donde me ubico y la deja abajo
    public String Autor;
//construccion vacio

    public Cancion() {
    }
    //costructor con parametros

    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }
// metodos getters
    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }
// metodos setters

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    
    
}
