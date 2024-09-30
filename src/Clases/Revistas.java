
package Clases;


public class Revistas extends Publicaciones{
    private int largo;
    private int ancho;
    private String versionImpresa;

    //DEFAULT
    public Revistas() {
    }

    //INICIALIZADOR
    public Revistas(int codigo, int cantidadDePaginas, String fechaDePublicacion,int largo, int ancho, String versionImpresa) {
        super(codigo, cantidadDePaginas, fechaDePublicacion);
        this.largo = largo;
        this.ancho = ancho;
        this.versionImpresa = versionImpresa;
    }
    
    //SETTER Y GETTER

    public void setLargo(int nuevoLargo) {
        this.largo = nuevoLargo;
    }

    public void setAncho(int nuevoAncho) {
        this.ancho = nuevoAncho;
    }

    public void setVersionImpresa(String nuevaVersionImpresa) {
        this.versionImpresa = nuevaVersionImpresa;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public String getVersionImpresa() {
        return versionImpresa;
    }
    
    //MOSTRAREMOS LOS MENSAJES CREANDO UN METODO PARA ELLO
    public void mensajeClaseHijaDos(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Cantidad de páginas: " + getCantidadDePaginas());
        System.out.println("Fecha de publicación: " + getFechaDePublicacion());
        System.out.println("Largo: " + getLargo());
        System.out.println("Ancho: " + getAncho());
        System.out.println("Version impresa: " + getVersionImpresa());
        System.out.println("\n===================================\n");
       
    }
}
