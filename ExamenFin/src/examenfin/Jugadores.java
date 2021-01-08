package examenfin;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Jugadores implements Serializable {
    
    protected ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Serializacion objjugadores = new Serializacion();

    public Jugadores(){
        jugadores = objjugadores.leer();
    }
    
    //Agregar
    public void agregarJugador(int a){
        if(jugadores.size()==10){
            JOptionPane.showMessageDialog(null,"Solo se pueden almacenar 10 Jugadores  :'(");
        }else{
            
        Jugador ingresar = new Jugador();
        ingresar.IngresarDatos(a);
        jugadores.add(ingresar);
        
        }
        
    }
    //mejor
    public void mejorjugador(){
        int mejorjugador=0;    
        for(int i = 0; i < jugadores.size(); i++){
                
                if(jugadores.get(i).getScore()>mejorjugador){
                mejorjugador=i;
                }
                int ultimojugador=(jugadores.size()-1);
                
                if(i==ultimojugador){
                
                JOptionPane.showMessageDialog(null,
                                           "Nombre: " + jugadores.get(mejorjugador).getNombre()
                                         + "\nEdad: " + jugadores.get(mejorjugador).getEdad()
                                         + "\nPersonas Salvadas: " + jugadores.get(mejorjugador).getScore());
            }
            }
    }
    //marcador
    public void verjugadores(){
        for(int i = 0; i < jugadores.size(); i++){
                
                JOptionPane.showMessageDialog(null,
                                           "Nombre: " + jugadores.get(i).getNombre()
                                         + "\nEdad: " + jugadores.get(i).getEdad()
                                         + "\nPersonas Salvadas: " + jugadores.get(i).getScore());
            
            }
    }
    //Buscar
    public int buscar(){
        int posbuscar = 0;
        String nombreBuscado;        
        nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre buscado");
        posbuscar = Posicion(nombreBuscado);
        JOptionPane.showMessageDialog(null,"Jugador encontrado"
                                         + "\nNombre: " + jugadores.get(posbuscar).getNombre()
                                         + "\nEdad: " + jugadores.get(posbuscar).getEdad()
                                         + "\nPersonas Salvadas: " + jugadores.get(posbuscar).getScore());
        return posbuscar;
               
    }
    //Posicion
    private int Posicion (String nombre){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < jugadores.size(); i++){
            int ultimojugador=(jugadores.size()-1);
                
                if(i==ultimojugador){
            if(nombre.equals(jugadores.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
                JOptionPane.showMessageDialog(null,"Puntuacion no encontrada");
            }
        }}
        if(!existe){
            JOptionPane.showMessageDialog(null,"No existe el registro");
            pos = -1;
        }
        return pos;
    }
    //Eliminar
    public void eliminar(){
        int jugadoraBorrar;
        
        jugadoraBorrar = buscar();
           
        if(jugadoraBorrar<jugadores.size()){
            jugadores.remove(jugadoraBorrar);
            JOptionPane.showMessageDialog(null,"Jugador eliminado");
        } 
        grabar();
    }
    
    //Modificar
    public void modificar(){
        int posmodificar = 0;
        int opcion1;
        String jugadormodificar;
        
        jugadormodificar = JOptionPane.showInputDialog("Ingresa el nombre del jugador a modificar");
        
        posmodificar = Posicion(jugadormodificar);
        if(posmodificar <= 0){
        opcion1 = Integer.parseInt(JOptionPane.showInputDialog("¿Que quiere modificar del jugador?\n"
                                            +"1.-Nombre\n"
                                            +"2.-Edad\n"));              
        switch (opcion1) {
            case 1:
                JOptionPane.showMessageDialog(null,"El Nombre es: " + jugadores.get(posmodificar).getNombre());
                String nuevonombre =JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                jugadores.get(posmodificar).setNombre(nuevonombre);
            break;
                        
            case 2:
                JOptionPane.showMessageDialog(null,"La edad es: " + jugadores.get(posmodificar).getEdad());
                String nuevaedad =JOptionPane.showInputDialog("Ingresa la nueva edad");
                jugadores.get(posmodificar).setEdad(nuevaedad);
            break;           
            }
        
        }          
        
        grabar();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Serializacion getObjJugadores() {
        return objjugadores;
    }
    public void setObjJugadores(Serializacion objjugadores) {
        this.objjugadores = objjugadores;
    }
    
    public void grabar(){
        getObjJugadores().serializar(jugadores);
    }
 
}