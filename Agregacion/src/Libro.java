public class Libro {

    private String autor;
    private String titulo;
    private Boolean disponible;


public Libro(){

    this.disponible = true;

}
public Libro(String autor, String titulo){
    
    this.autor = autor;
    this.titulo = titulo;
    this.disponible = true;

}
public Libro(String autor, String titulo, Boolean disponible){

    this.autor = autor;
    this.titulo = titulo;
    this.disponible = disponible;

}

public String getAutor(){

    return  autor;
}

public void setAutor(String autor){

    this.autor = autor;
}

public String getTitulo(){

    return titulo;
}

public void setTitulo(String titulo){
    
    if(titulo != null && !titulo.isEmpty()){

    this.titulo = titulo;
} else {
    System.out.println("ERROR: El titulo no puede estar vacio.");
}
}

public boolean isDisponible(){
    return this.disponible;
}

public void setDisponible(Boolean disponible){
    this.disponible = disponible;
}

public void mostrarInfo(){
    System.out.println("----Libro----");
    System.out.println("Titulo : " + titulo);
    System.out.println("Titulo : " + autor);
    System.out.println("Disponible : " + (disponible ? "Si" : "No"));
}

public boolean prestar(){
    if (disponible){
        disponible = false;
        System.out.println("El libro \"" + titulo + "\"fue prestado.");
        return true;
    } else{
        System.out.println("El libro \"" + titulo + "\"ya esta prestado.");
        return false;
    }
}

public void devolver(){
    disponible = true;
    System.out.println("El libro \"" + titulo + "\"fue devuelto.");
}

}