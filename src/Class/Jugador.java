package Class;


import java.awt.Color;

public class Jugador {
    private Navegador Search;
    private String nombre;
    private Color color;
    private String ficha;

    public Jugador() {
    }
    
    public Jugador(Navegador n) {
        Search = n;
    }

    public Jugador(String nombre, Color color, String ficha) {
        this.nombre = nombre;
        this.color = color;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", color=" + color + ", ficha=" + ficha + '}';
    }
    
    
    
}
