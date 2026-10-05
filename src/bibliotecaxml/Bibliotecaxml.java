/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaxml;

import static bibliotecaxml.Bibliotecaxml.lib;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author wilton
 */
public class Bibliotecaxml {
    
    static ArrayList<libros> lib = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            String menu = "Menú\n"+
            "1/ Ingresar libro\n"+
            "2/ Serializar usuarios\n"+
            "3/ Deserializar usuarios\n"+
            "4/ Vaciar archivo\n"+
            "5/ salir\n";
            String entrada = JOptionPane.showInputDialog(menu);
            
            if (entrada==null){
                opcion=4;
            }else{
                try{
                    opcion=Integer.parseInt(entrada);
                }catch (NumberFormatException e){
                    opcion=0;
                }
            }
            switch(opcion){
                case 1:
                    ingresar();
                    break;
                case 3:
                    deserializar();
                    break;
                case 4:
                    vaciar();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo... ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion inválida");

            }
        }while (opcion!=5);
       
    }
    
    public static void ingresar(){
        String id = JOptionPane.showInputDialog("Cual es el ID?");
        String nombre = JOptionPane.showInputDialog("Cual es el nombre?");
        String autor = JOptionPane.showInputDialog("Quien es el autor?");
        String precio = JOptionPane.showInputDialog("Cuanto vale?");
        
        libros book = new libros(id,nombre, autor, precio);
        lib.add(book);
        
        try {
            FileOutputStream fos = new FileOutputStream("libros.xml");
            XMLEncoder xe = new XMLEncoder(fos);
            xe.writeObject(book);
            xe.close();
        } catch (FileNotFoundException ex) {
            System.getLogger(Bibliotecaxml.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
    }
    
    public static void deserializar(){
        FileInputStream fis;
        try {
            fis = new FileInputStream ("libros.xml");
            XMLDecoder xd = new XMLDecoder (fis);
            libros temp=(libros) xd.readObject();
            xd.close();
            
            
            
            
        } catch (FileNotFoundException ex) {
            System.getLogger(Bibliotecaxml.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
   
}
    

