public class persona {
    String nombre;
    String genero;
    double estatura;
    int peso;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void imprimir(){
        System.out.println("=====================================================================");
        System.out.println("Su nombre es: " + getNombre());
        System.out.println("Su genero es: "+getGenero());
        System.out.println("Su peso es: " + getPeso());
        System.out.println("Su estatura es: "+getEstatura());
    }
    
}
