package examenfin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Serializacion implements Serializable {
    
    
    ArrayList<Jugador> jugadoresrec = new ArrayList<Jugador>();
    
    public ArrayList<Jugador> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("jugadores.txt"));
            jugadoresrec = (ArrayList<Jugador>)in.readObject();
            in.close();  
        }catch(Exception e){
            System.out.println("Error ... " + e.getMessage());
        }
        return jugadoresrec;
    }
    
    void serializar(ArrayList<Jugador> jugadoresSerializados){
        try{
            FileOutputStream out = new FileOutputStream("jugadores.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(jugadoresSerializados);
            objout.close();  
        }catch(Exception e){
            System.out.println("Error al serializar el archivo" + e.getMessage());
        }
    }
    
}