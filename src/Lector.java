public class Lector{

    private String nombre;
    private String cedula;
    private Libro libroActual;

public Lector(String nombre, String cedula){

    this.nombre = nombre;
    this.cedula = cedula;

}

public String getNombre(){

    return nombre;
}

public void setNombre(){

    this.nombre = nombre;
}

public String getCedula(){

    return cedula;
}

public void setCedula(){

    this.cedula = cedula;
}

//----METODOS----

public void tomarPrestado(Libro libro){
    if (libroActual != null){
        System.out.println(nombre + " ya tiene el libro \"" + libroActual.getTitulo
        () + "\". Debe devolverlo primero.");
        } else {
            if (libro.prestar()){
                libroActual = libro;
            }
        }

    
}

public void regresarLibro(){
    if (libroActual == null){
        System.out.println(nombre = " ya tiene el libro \"" + libroActual.getTitulo
        () + "\". Debe devolverlo primero.");
    }else{
        libroActual.devolver();
        libroActual = null;
    }
}

public void mostrarEstado(){
    String estado = (libroActual !=null)? libroActual.getTitulo(): "Sin titulo";
    System.out.println("Lector: " + nombre + "| Libro: " + estado);
}

}

