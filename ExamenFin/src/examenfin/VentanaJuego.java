
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
import javax.swing.JOptionPane;

public class VentanaJuego extends JFrame{
    
    JPanel panel;
    JLabel puntuacion,cuerda2,ingpalabra,palabraetiq;
    JLabel cabeza,pecho,brazo,brazos,pierna,cuerpo;
    JTextField letraopalabra = new JTextField();
    String palabrasecreta,letraopalabraingresada,palabraenguiones, palabrapuntos;
    String letra1,letra2,letra3,letra4,letra5,letra6,letra7,letra8,letra9,letra10;
    int puntos=0,errores,intentos=0;
    int coincidencia;
    int letracoincide=0;
    
    VentanaInicio ventana = new VentanaInicio();
    
    public VentanaJuego() {
        setSize(750,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
    }
    protected void iniciarComponentes2(int p){
        colocarpanel();
        IngresarPalabra(p);
    }
    private void colocarpanel() {
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.black);
    this.getContentPane().add(panel);
    }
    private void colocaretiqueta(int p) {
        //dibujo de cuerda
        cuerda2 =new JLabel();
        cuerda2.setIcon(new ImageIcon(getClass().getResource("cuerda2.png")));
        cuerda2.setBounds(0,0,200,400);
        panel.add(cuerda2);
        //etiqueta pedir palabra
        ingpalabra = new JLabel("Ingrese la palabra: ");
        ingpalabra.setBounds(200, 20, 286, 50);
        ingpalabra.setForeground(Color.white);
        ingpalabra.setOpaque(true);
        ingpalabra.setBackground(Color.black);
        ingpalabra.setFont(new Font("chiller",200,50));
        panel.add(ingpalabra);
        //puntuacion
        
        puntuacion = new JLabel("Personas salvadas= "+p);
        puntuacion.setBounds(420, 800, 400, 50);
        puntuacion.setForeground(Color.white);
        puntuacion.setOpaque(true);
        puntuacion.setBackground(Color.black);
        puntuacion.setFont(new Font("chiller",250,50));
        panel.add(puntuacion);
        }
    private void IngresarPalabra(int p){
        colocaretiqueta(p);
        palabra(p);
        
    }

     private void palabra(int p) {
        
        
        //caja de texto para la palabra
        JTextField cajaPalabra = new JTextField();
        cajaPalabra.setBounds(500, 35, 200, 30);
        panel.add(cajaPalabra);
        
        //Boton para guardar la palabra e iniciar el juego
        JButton aceptar = new JButton();
        aceptar.setText("Aceptar");
        aceptar.setBounds(600, 70, 100,50);
        aceptar.setFont(new Font("chiller",3,20));
        aceptar.setEnabled(true);
        panel.add(aceptar);
        
        ActionListener oyente3 = new ActionListener(){
          @Override
        public void actionPerformed(ActionEvent a) {
            palabrasecreta=cajaPalabra.getText();
            if(palabrasecreta.length()==0){
                JOptionPane.showMessageDialog(null,"No ingreso nada");
            }else{
             ingpalabra.setVisible(false);
             cajaPalabra.setVisible(false);
             aceptar.setVisible(false);
             AdivinarPalabra(p);
               palabrasecreta=palabrasecreta.toLowerCase();
               palabraenguiones=palabrasecreta;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               JOptionPane.showMessageDialog(null, "La palabra a adivinar :\n"+palabraenguiones);
               
               
            }
        }


            
        };
        aceptar.addActionListener(oyente3);
        
    }

            
    private void AdivinarPalabra(int p) {
        //etiqueta para el jugador
        palabraetiq = new JLabel("Ingrese una letra o la palabra: ");
        palabraetiq.setBounds(200, 20, 500, 50);
        palabraetiq.setForeground(Color.white);
        palabraetiq.setOpaque(true);
        palabraetiq.setBackground(Color.black);
        palabraetiq.setFont(new Font("chiller",200,50));
        panel.add(palabraetiq); 
        //caja para intentar adivinar
        letraopalabra.setBounds(200, 70, 250, 30);
        panel.add(letraopalabra);
        //boton para revisar lo ingresado
        JButton aceptar1 = new  JButton ();
        aceptar1.setText("Aceptar");
        aceptar1.setBounds(470, 60, 100,50);
        aceptar1.setFont(new Font("chiller",3,20));
        aceptar1.setEnabled(true);
        panel.add(aceptar1);
        
        ActionListener oyentedeljuego = new ActionListener(){
          @Override
        public void actionPerformed(ActionEvent a) {
            letraopalabraingresada =letraopalabra.getText();
           
            if(letraopalabraingresada.length()==0){
                JOptionPane.showMessageDialog(null,"No ingreso nada");
                
            }else{
               if(letraopalabraingresada.length()==1){
               intentos=(intentos+1);
               if(intentos==1){
               analizarletra1(p);
               }else{
               if(intentos==2){
               analizarletra2(p);
               }else{
               if(intentos==3){
               analizarletra3(p);
               }else{
               if(intentos==4){
               analizarletra4(p);
               }else{
               if(intentos==5){
               analizarletra5(p);
               }else{
               if(intentos==6){
               analizarletra6(p);
               }else{
               if(intentos==7){
               analizarletra7(p);
               }else{
               if(intentos==8){
               analizarletra8(p);
               }else{
               if(intentos==9){
               analizarletra9(p);
               }else{
               if(intentos==10){
               analizarletra10(p);
               }else{
                   cabeza(p);
               }
               }
               } 
               }   
               }   
               }    
               }    
               }    
               }    
               }
               
               }else{
               
               analizarpalabra(p);
            }
            }
        }
        };
        aceptar1.addActionListener(oyentedeljuego);
    }
    
    private void analizarpalabra(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una palabra");
        String palabrasecretaminus = palabrasecreta.toLowerCase();
        String palabraingreminus = letraopalabraingresada.toLowerCase();
               
               
               if(palabraingreminus.equals(palabrasecretaminus)){
                   mensajevictoria(p);
               }else{
               JOptionPane.showMessageDialog(null,"Lo siento esa no es la palabra");
               errores=(errores+1);
               letraopalabra.setText("");
               cabeza(p);
               }
               }
    private void analizarletra1(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
            }
      
        
    }  
    protected void analizarletra2(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
       
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
            }
       
    }
    protected void analizarletra3(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        
        letracoincide=0;       
      
                int ultimaletra=palabrasecreta.length();
                ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
            }
      
    }
    protected void analizarletra4(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
            }
      
    }
    protected void analizarletra5(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,letra4,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
        } 
    }
    protected void analizarletra6(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,letra4,letra5,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
        } 
    }
    protected void analizarletra7(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,letra4,letra5,letra6,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
        } 
    }
    protected void analizarletra8(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,letra4,letra5,letra6,letra7,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
        } 
    }
    protected void analizarletra9(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,letra4,letra5,letra6,letra7,letra8,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
        } 
    }
    protected void analizarletra10(int p) {
        JOptionPane.showMessageDialog(null,"Ingreso una letra");
        letracoincide=0;       
        
                   int ultimaletra=palabrasecreta.length();
                   ultimaletra=(ultimaletra-1);
            for (int i = 0; i < palabrasecreta.length(); i++) {
            if ((palabraenguiones.charAt(i)=='_')&&(palabrasecreta.charAt(i)==letraopalabraingresada.charAt(0))){
                   
                coincidencia(letra1,letra2,letra3,letra4,letra5,letra6,letra7,letra8,letra9,p);
                letracoincide=(letracoincide+1);
                letraopalabraingresada="0";
            }else{
               
                if((i==ultimaletra)&&(letracoincide==0)){
                intentos=(intentos-1);
                errores=(errores+1);
                letraopalabra.setText("");
                JOptionPane.showMessageDialog(null,"No hay coincidencias");  
                cabeza(p);
                
                }
            }
        } 
    }
    protected void coincidencia(int p) {
        
               letra1=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letraopalabraingresada, "1");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
        
    }
    protected void coincidencia(String letra1,int p) {
        
               letra2=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
        
    }
    protected void coincidencia(String letra1,String letra2,int p) {
        
               letra3=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,int p) {
        
               letra4=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,String letra4,int p) {
        
               letra5=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabrapuntos=palabrapuntos.replaceAll(letra5, "5");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               palabraenguiones=palabraenguiones.replaceAll("5",letra5);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,String letra4,String letra5,int p) {
        
               letra6=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabrapuntos=palabrapuntos.replaceAll(letra5, "5");
               palabrapuntos=palabrapuntos.replaceAll(letra6, "6");
               
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               palabraenguiones=palabraenguiones.replaceAll("5",letra5);
               palabraenguiones=palabraenguiones.replaceAll("6",letra6);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,String letra4,String letra5,String letra6,int p) {
        
               letra7=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabrapuntos=palabrapuntos.replaceAll(letra5, "5");
               palabrapuntos=palabrapuntos.replaceAll(letra6, "6");
               palabrapuntos=palabrapuntos.replaceAll(letra7, "7");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               palabraenguiones=palabraenguiones.replaceAll("5",letra5);
               palabraenguiones=palabraenguiones.replaceAll("6",letra6);
               palabraenguiones=palabraenguiones.replaceAll("7",letra7);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,String letra4,String letra5,String letra6,String letra7,int p) {
        
               letra8=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabrapuntos=palabrapuntos.replaceAll(letra5, "5");
               palabrapuntos=palabrapuntos.replaceAll(letra6, "6");
               palabrapuntos=palabrapuntos.replaceAll(letra7, "7");
               palabrapuntos=palabrapuntos.replaceAll(letra8, "8");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               palabraenguiones=palabraenguiones.replaceAll("5",letra5);
               palabraenguiones=palabraenguiones.replaceAll("6",letra6);
               palabraenguiones=palabraenguiones.replaceAll("7",letra7);
               palabraenguiones=palabraenguiones.replaceAll("8",letra8);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,String letra4,String letra5,String letra6,String letra7,String letra8,int p) {
        
               letra9=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabrapuntos=palabrapuntos.replaceAll(letra5, "5");
               palabrapuntos=palabrapuntos.replaceAll(letra6, "6");
               palabrapuntos=palabrapuntos.replaceAll(letra7, "7");
               palabrapuntos=palabrapuntos.replaceAll(letra8, "8");
               palabrapuntos=palabrapuntos.replaceAll(letra9, "9");
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               palabraenguiones=palabraenguiones.replaceAll("5",letra5);
               palabraenguiones=palabraenguiones.replaceAll("6",letra6);
               palabraenguiones=palabraenguiones.replaceAll("7",letra7);
               palabraenguiones=palabraenguiones.replaceAll("8",letra8);
               palabraenguiones=palabraenguiones.replaceAll("9",letra9);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    protected void coincidencia(String letra1,String letra2,String letra3,String letra4,String letra5,String letra6,String letra7,String letra8,String letra9,int p) {
        
               letra10=letraopalabraingresada.toLowerCase();
               palabrapuntos=palabrasecreta;
               palabrapuntos=palabrapuntos.replaceAll(letra1, "1");
               palabrapuntos=palabrapuntos.replaceAll(letra2, "2");
               palabrapuntos=palabrapuntos.replaceAll(letra3, "3");
               palabrapuntos=palabrapuntos.replaceAll(letra4, "4");
               palabrapuntos=palabrapuntos.replaceAll(letra5, "5");
               palabrapuntos=palabrapuntos.replaceAll(letra6, "6");
               palabrapuntos=palabrapuntos.replaceAll(letra7, "7");
               palabrapuntos=palabrapuntos.replaceAll(letra8, "8");
               palabrapuntos=palabrapuntos.replaceAll(letra9, "9");
               palabrapuntos=palabrapuntos.replaceAll(letra10,"0");
               
               palabraenguiones=palabrapuntos;
              
               palabraenguiones=palabraenguiones.replaceAll("a", "_");
               palabraenguiones=palabraenguiones.replaceAll("b", "_");
               palabraenguiones=palabraenguiones.replaceAll("c", "_");
               palabraenguiones=palabraenguiones.replaceAll("d", "_");
               palabraenguiones=palabraenguiones.replaceAll("e", "_");
               palabraenguiones=palabraenguiones.replaceAll("f", "_");
               palabraenguiones=palabraenguiones.replaceAll("g", "_");
               palabraenguiones=palabraenguiones.replaceAll("h", "_");
               palabraenguiones=palabraenguiones.replaceAll("i", "_");
               palabraenguiones=palabraenguiones.replaceAll("j", "_");
               palabraenguiones=palabraenguiones.replaceAll("k", "_");
               palabraenguiones=palabraenguiones.replaceAll("l", "_");
               palabraenguiones=palabraenguiones.replaceAll("m", "_");
               palabraenguiones=palabraenguiones.replaceAll("n", "_");
               palabraenguiones=palabraenguiones.replaceAll("ñ", "_");
               palabraenguiones=palabraenguiones.replaceAll("o", "_");
               palabraenguiones=palabraenguiones.replaceAll("p", "_");
               palabraenguiones=palabraenguiones.replaceAll("q", "_");
               palabraenguiones=palabraenguiones.replaceAll("r", "_");
               palabraenguiones=palabraenguiones.replaceAll("s", "_");
               palabraenguiones=palabraenguiones.replaceAll("t", "_");
               palabraenguiones=palabraenguiones.replaceAll("u", "_");
               palabraenguiones=palabraenguiones.replaceAll("v", "_");
               palabraenguiones=palabraenguiones.replaceAll("w", "_");
               palabraenguiones=palabraenguiones.replaceAll("x", "_");
               palabraenguiones=palabraenguiones.replaceAll("y", "_");
               palabraenguiones=palabraenguiones.replaceAll("z", "_");
               
               palabraenguiones=palabraenguiones.replaceAll("1",letra1);
               palabraenguiones=palabraenguiones.replaceAll("2",letra2);
               palabraenguiones=palabraenguiones.replaceAll("3",letra3);
               palabraenguiones=palabraenguiones.replaceAll("4",letra4);
               palabraenguiones=palabraenguiones.replaceAll("5",letra5);
               palabraenguiones=palabraenguiones.replaceAll("6",letra6);
               palabraenguiones=palabraenguiones.replaceAll("7",letra7);
               palabraenguiones=palabraenguiones.replaceAll("8",letra8);
               palabraenguiones=palabraenguiones.replaceAll("9",letra9);
               palabraenguiones=palabraenguiones.replaceAll("0",letra10);
               JOptionPane.showMessageDialog(null,palabraenguiones);
               letraopalabra.setText("");
               if(palabraenguiones.equals(palabrasecreta)){
                   mensajevictoria(p);
               
               }
    }
    private void cabeza(int p) {
    if(errores==1){    
    cuerda2.setVisible(false);
    cabeza =new JLabel();
    cabeza.setIcon(new ImageIcon(getClass().getResource("cabeza.png")));
    cabeza.setBounds(0,50,200,700);
    panel.add(cabeza);
    }else{
    pecho(p);
    }
    }
    private void pecho(int p) {
    if(errores==2){ 
    cabeza.setVisible(false);
    pecho =new JLabel();
    pecho.setIcon(new ImageIcon(getClass().getResource("pecho.png")));
    pecho.setBounds(0,50,200,700);
    panel.add(pecho);
    }else{
    brazo(p);
    
    }
    }
    private void brazo(int p) {
    if(errores==3){ 
    pecho.setVisible(false);
    brazo =new JLabel();
    brazo.setIcon(new ImageIcon(getClass().getResource("brazoderecho.png")));
    brazo.setBounds(0,50,200,700);
    panel.add(brazo);
    }else{
    brazos(p);
    
    }
    }
    private void brazos(int p) {
    if(errores==4){ 
    brazo.setVisible(false);
    brazos =new JLabel();
    brazos.setIcon(new ImageIcon(getClass().getResource("brazos.png")));
    brazos.setBounds(0,50,200,700);
    panel.add(brazos);
    }else{
    pierna(p);
    
    }
    }
    private void pierna(int p) {
    if(errores==5){ 
    brazos.setVisible(false);
    pierna =new JLabel();
    pierna.setIcon(new ImageIcon(getClass().getResource("pierna.png")));
    pierna.setBounds(0,50,200,700);
    panel.add(pierna);
    }else{
    cuerpo(p);
    
    }
    }
    private void cuerpo(int p) {
    
    pierna.setVisible(false);
    cuerpo =new JLabel();
    cuerpo.setIcon(new ImageIcon(getClass().getResource("cuerpo.png")));
    cuerpo.setBounds(0,50,200,700);
    panel.add(cuerpo);
    if(p>=1){
            String guardar=JOptionPane.showInputDialog("¿Desea guardar su record?(Si/No)");
            
            if(guardar.equals("Si")||guardar.equals("si")){
            
            Jugadores jugadores = new Jugadores();
            jugadores.agregarJugador(puntos);
            jugadores.grabar();
            JOptionPane.showMessageDialog(null,"Jugador guardado, juego terminado");
            System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null,"Juego terminado"
                + "\nLa palabra era: "+palabrasecreta);
        System.exit(0);
            }
    }else{
        JOptionPane.showMessageDialog(null,"Juego terminado"
                + "\nLa palabra era: "+palabrasecreta);
        System.exit(0);
    }
    }
    

    private void mensajevictoria(int p) {
        
            
            puntos=(p+1);
            ventana.puntos=puntos;
            JOptionPane.showMessageDialog(null,"Felicidades salvaste a una persona");
            
            String guardar=JOptionPane.showInputDialog("¿Desea guardar su record?(Si/No)");
            
            if(guardar.equals("Si")||guardar.equals("si")){
            String advertencia=JOptionPane.showInputDialog("ADVERTENCIA: Al guardar se cerrara el juego"
                                                         + "¿Desea continuar con el guardado?");  
            if(advertencia.equals("Si")||(advertencia.equals("si"))){
            Jugadores jugadores = new Jugadores();
            jugadores.agregarJugador(puntos);
            jugadores.grabar();
            JOptionPane.showMessageDialog(null,"Jugador guardado, juego terminado");
            System.exit(0);
            }else{
            this.setVisible(false);
            ventana.setVisible(true);
            
            }
            }else{
            
            this.setVisible(false);
            ventana.setVisible(true);
            
            
            }
            
    }
}