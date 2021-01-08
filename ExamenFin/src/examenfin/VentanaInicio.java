package examenfin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;


public class VentanaInicio extends JFrame {
     
    JPanel panel;
    JLabel titulo,cuerda;
    JButton regresar,vjugadores,mejorj,buscar,modificar,eliminar;
    JButton jugar = new JButton();
    JButton registrojugadores = new JButton();
    int puntos=0;
    
    Jugadores jugadores = new Jugadores();
    
    
    public VentanaInicio(){
    setSize(800,600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("El ahorcado");  
    setLocationRelativeTo(null);
    setResizable(false);
    iniciarComponentes();
    }
    protected void iniciarComponentes(){
        colocarpanel();
        colocaretiquetas();
        colocarbotones();
    }

    private void colocarpanel() {
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.black);
    this.getContentPane().add(panel);
    }
    private void colocaretiquetas() {
    //etiqueta
    titulo = new JLabel("El Ahorcado",SwingConstants.CENTER);
    titulo.setBounds(200, 10, 400, 60);
    titulo.setForeground(Color.white);
    titulo.setVisible(true);
    titulo.setOpaque(true);
    titulo.setBackground(Color.black);
    titulo.setFont(new Font("chiller",3,50));
    panel.add(titulo);
    //imagen
    cuerda =new JLabel();
    cuerda.setIcon(new ImageIcon(getClass().getResource("cuerda.png")));
    cuerda.setBounds(600,0,280,500);
    cuerda.setVisible(true);
    panel.add(cuerda);
    
    }
    private void colocarbotones() {
    //boton JUGAR   
    
    jugar.setText("Jugar");
    jugar.setBounds(200, 200, 400, 60);
    jugar.setFont(new Font("chiller",3,50));
    jugar.setEnabled(true);
    panel.add(jugar);
    //boton JUGADORES
    
    registrojugadores.setText("Jugadores");
    registrojugadores.setBounds(200, 300, 400, 60);
    registrojugadores.setFont(new Font("chiller",3,50));
    registrojugadores.setEnabled(true);
    panel.add(registrojugadores);
    ActionListener oyente1 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaJuego juego = new VentanaJuego();
            juego.setVisible(true);
            juego.iniciarComponentes2(puntos);
            cerrarestaventana();
            JOptionPane.showMessageDialog(null, "                                                                                                                                                                    -----REGLAS-----"
                    + "\nJugadores: 2 (1 adivinador y 1 moderador)"
                    + "\nObjetivo: Descubrir la palabra o frase incógnita."
                    + "\nPreparación:"
                    + "\n-Al inicio el moderador pensará en una palabra o frase y dibujará en una hoja una línea por cada letra. Se dibuja la base de la horca (sin el muñeco). El moderador dará una pista al jugador (adivinador)."
                    + "\n-En su turno el jugador puede: Pedir una letra / Adivinar la palabra."
                    + "\n-Pedir una letra: El moderador revisa si la letra pedida se encuentra en la palabra secreta."
                    + "\n-Si la letra está, entonces el moderador la anota sobre la línea que ocupa su lugar en la palabra secreta."
                    + "\n-Si la letra no está, entonces el moderador anotará la letra sobre la horca y dibujará una parte del muñeco."
                    + "\n-Muñeco: El muñeco se dibuja en 6 partes (cabeza, tronco y extremidades), por lo que el adivinador tiene 6 posibilidades de fallar."
                    + "\n-Adivinar la Palabra: El jugador puede intentar adivinar la palabra o frase secreta."
                    + "\n-Si acierta la palabra, entonces el moderador completa la solución en el papel."
                    + "\n-Si no acierta la palabra, entonces el moderador dibujará una parte del muñeco");
        }

      
    
    };
    jugar.addActionListener(oyente1);
    this.setVisible(false);
    ActionListener oyente2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            jugar.setVisible(false);
            registrojugadores.setVisible(false);
            titulo.setVisible(false);
            cuerda.setVisible(false);
            setSize(600,800);
            setLocationRelativeTo(null);
            mostrarcrud();
        }

    };
    registrojugadores.addActionListener(oyente2);
    }

    private void mostrarcrud() {
    
    //boton regresar   
    regresar = new JButton();
    regresar.setText("Regresar");
    regresar.setBounds(100, 100, 400, 60);
    regresar.setFont(new Font("chiller",3,50));
    regresar.setEnabled(true);
    panel.add(regresar);
    //boton jugadores
    vjugadores = new JButton();
    vjugadores.setText("Ver jugadores");
    vjugadores.setBounds(100, 200, 400, 60);
    vjugadores.setFont(new Font("chiller",3,50));
    vjugadores.setEnabled(true);
    panel.add(vjugadores);
    //boton mejor   
    mejorj = new JButton();
    mejorj.setText("Mejor puntuacion");
    mejorj.setBounds(100, 300, 400, 60);
    mejorj.setFont(new Font("chiller",3,50));
    mejorj.setEnabled(true);
    panel.add(mejorj);
    //boton buscar
    buscar = new JButton();
    buscar.setText("Buscar Jugador");
    buscar.setBounds(100, 400, 400, 60);
    buscar.setFont(new Font("chiller",3,50));
    buscar.setEnabled(true);
    panel.add(buscar);
    //boton modificar
    modificar = new JButton();
    modificar.setText("Modificar jugador");
    modificar.setBounds(100, 500, 400, 60);
    modificar.setFont(new Font("chiller",3,50));
    modificar.setEnabled(true);
    panel.add(modificar);
    //boton eliminar
    eliminar = new JButton();
    eliminar.setText("Eliminar Jugador");
    eliminar.setBounds(100, 600, 400, 60);
    eliminar.setFont(new Font("chiller",3,50));
    eliminar.setEnabled(true);
    panel.add(eliminar);
    ActionListener oyenteregresar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        regresar.setVisible(false);
        mejorj.setVisible(false);
        vjugadores.setVisible(false);
        buscar.setVisible(false);
        modificar.setVisible(false);
        eliminar.setVisible(false);
        
        setSize(800,600);
        
        setLocationRelativeTo(null);
            jugar.setVisible(true);
            registrojugadores.setVisible(true);
            titulo.setVisible(true);
            cuerda.setVisible(true);
            setResizable(false);
       
        }
    };
        regresar.addActionListener(oyenteregresar);
    ActionListener oyentever = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        
        if(jugadores.jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay jugadores guardados");
        }else{
            jugadores.verjugadores();
        }
        }
        
        };
        vjugadores.addActionListener(oyentever);
    ActionListener oyentemejorj = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        
        if(jugadores.jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay jugadores guardados");
        }else{
            jugadores.mejorjugador();
        }
        }
        
        };
        mejorj.addActionListener(oyentemejorj);
    
    ActionListener oyentabuscar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(jugadores.jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay jugadores guardados");
        }else{jugadores.buscar();
            }
        }
        };
        buscar.addActionListener(oyentabuscar);
        
    ActionListener oyentemodificar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        
        if(jugadores.jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay jugadores guardados");
        }else{
            jugadores.modificar();
        }
        }
        
        };
        modificar.addActionListener(oyentemodificar);
    
    ActionListener oyenteeliminar = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        
        if(jugadores.jugadores.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay jugadores guardados");
        }else{
            jugadores.eliminar();
        }
        }
        
        };
        eliminar.addActionListener(oyenteeliminar);
    
    }
    
      private void cerrarestaventana() {
          this.setVisible(false);
       }
    
    

    
    
    
}