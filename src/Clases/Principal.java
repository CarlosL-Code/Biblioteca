
package Clases;


public class Principal {

    
    public static void main(String[] args) {
       Publicaciones publicaciones = new Publicaciones();
       Libros librosUno = new Libros();
       Revistas revistasUno = new Revistas();
       Revistas revistasDos = new Revistas();
       //MOSTRARE MIS DATOS EN PRIMERA INSTANCIA
       librosUno.mensajeEstudiante();
       Libros librosDos = new Libros();
       
       
       //Crearemos los objetos tanto de la clase hija 1 y clase hija 2 para 
       //asignarle valores
       
       //PRIMERA
       librosUno.setCodigoLibro("22A33A44A");
       librosUno.setPrecio(5000);
       librosUno.setAutor("Carlos Lozano");
       librosUno.setEditorial("Barquito de papel");
       librosUno.setCodigo(15);
       librosUno.setCantidadDePaginas(300);
       librosUno.setFechaDePublicacion("13 de septiembre 2024");
       
       revistasUno.setLargo(125);
       revistasUno.setAncho(400);
       revistasUno.setVersionImpresa("Version digital");
       revistasUno.setCodigo(35);
       revistasUno.setCantidadDePaginas(400);
       revistasUno.setFechaDePublicacion("24 de noviembre 2024");
       
       //SEGUNDA
       
       librosDos.setCodigoLibro("22A33A44A");
       librosDos.setPrecio(24000);
       librosDos.setAutor("David Lozano");
       librosDos.setEditorial("La casa de papel");
       librosDos.setCodigo(24);
       librosDos.setCantidadDePaginas(500);
       librosDos.setFechaDePublicacion("25 de septiembre 2023");
       
       
       revistasDos.setLargo(469);
       revistasDos.setAncho(650);
       revistasDos.setVersionImpresa("Version impresa digital");
       revistasDos.setCodigo(45);
       revistasDos.setCantidadDePaginas(700);
       revistasDos.setFechaDePublicacion("27 de enero 2024");
       
       
       //MOSTRAREMOS EL MENSAJE EN CONSOLA
       revistasUno.mensajeClaseHijaDos();
       revistasDos.mensajeClaseHijaDos();
       
      
       //Instanciaremos los datos de la clase hija 1 ademas de adjuntando segun su precio
       librosUno.mostrarDatos();
       librosUno.mensajeSegunPrecio();
        System.out.println("\n==================\n");
       librosDos.mostrarDatos();
       librosDos.mensajeSegunPrecio();
       
    }
    
}
