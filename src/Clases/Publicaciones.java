
package Clases;


public class Publicaciones {
    // ATRIBUTOS EN PRIVADOS
    private int codigo;
    private int cantidadDePaginas;
    private String fechaDePublicacion;
    
    //CONSTRUCTOR POR DEFECTO
    public Publicaciones() {
    }
    
    //CONSTRUCTOR QUE INICIALIZA
    public Publicaciones(int codigo, int cantidadDePaginas, String fechaDePublicacion) {
        this.codigo = codigo;
        this.cantidadDePaginas = cantidadDePaginas;
        this.fechaDePublicacion = fechaDePublicacion;
    }

    //SETTER Y GETTER
    
    public void setCodigo(int nuevoCodigo) {
        this.codigo = nuevoCodigo;
    }

    public void setCantidadDePaginas(int nuevaCantidadDePaginas) {
        this.cantidadDePaginas = nuevaCantidadDePaginas;
    }

    public void setFechaDePublicacion(String nuevaFechaDePublicacion) {
        this.fechaDePublicacion = nuevaFechaDePublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }
    
    
}
