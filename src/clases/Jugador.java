
package clases;

public class Jugador {
    private String nombreCamiseta;
    private String numeroCamiseta;
    private int edad;
    private String posicion;

    public Jugador() {
    }

    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    public Jugador(String nombreCamiseta, String numeroCamiseta, int edad, String posicion) {
        this.nombreCamiseta = nombreCamiseta;
        this.numeroCamiseta = numeroCamiseta;
        this.edad = edad;
        this.posicion = posicion;
    }
    

    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombreCamiseta=" + nombreCamiseta + ", numeroCamiseta=" + numeroCamiseta + ", edad=" + edad + ", posicion=" + posicion + '}';
    }
    
}
