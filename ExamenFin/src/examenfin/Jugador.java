
package examenfin;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Jugador implements Serializable{
    
    private String nombre;
    private String edad;
    private int score;
 
    
    public Jugador(){
    
    }

    public Jugador(String nombre, String edad, int score) {
        this.nombre = nombre;
        this.edad = edad;
        this.score = score;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    
    public void IngresarDatos(int a){
        
        nombre = JOptionPane.showInputDialog("Ingresa el nombre ");
        
        edad = JOptionPane.showInputDialog("Ingresa su edad");
        
        score= a;
    }

    
    
}