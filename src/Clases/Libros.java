
package Clases;


public class Libros extends Publicaciones{
    //ATRIBUTOS PRIVADOS
    private String codigoLibro;
    private int precio;
    private String autor;
    private String editorial;
    
    //CONSTRUCTOR POR DEFECTO
    public Libros() {
    }
    
    //CONSTRUCTOR INICIALIZA

    public Libros(int codigo, int cantidadDePaginas, String fechaDePublicacion,String codigoLibro, int precio, String autor, String editorial) {
        super(codigo, cantidadDePaginas, fechaDePublicacion);
        this.codigoLibro = codigoLibro;
        this.precio = precio;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    //SETTER Y GETTER

    public void setCodigoLibro(String nuevoCodigoLibro) {
        this.codigoLibro = nuevoCodigoLibro;
    }

    public void setPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void setAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }

    public void setEditorial(String nuevaEditorial) {
        this.editorial = nuevaEditorial;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public int getPrecio() {
        return precio;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }
    
    public void mostrarDatos(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Cantidad de páginas: " + getCantidadDePaginas());
        System.out.println("Fecha de publicación: " + getFechaDePublicacion());
        System.out.println("Código libro: " + getCodigoLibro());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editorial: " +getEditorial());
    }
    
    //METODO PARA INTERACCIONES SEGUN EL PRECIO
    public void mensajeSegunPrecio(){
        if(precio < 3000){
            System.out.println("El precio es barato");
        }
        else if(precio > 3000 && precio <= 16000){
            System.out.println("El precio es regular");
        }
        else if(precio > 16000){
            System.out.println("El precio es caro");
        }
        else{
            System.out.println("ERROR");
        }
    }
    
    public void mensajeEstudiante(){
        System.out.println("Rut: 20.846.567-8 ");
        System.out.println("Nombre: Carlos José Lozano Silva");
        System.out.println("Carrera: Ingenieria en Informatica\n\n");
    }
}
