/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaxml;

/**
 *
 * @author wilton
 */
public class libros {
    private String id, nombre, autor, precio;

    public libros() {
    }

    libros(String id, String nombre, String autor, String precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    //getters en insert code
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getPrecio() {
        return precio;
    }

    //setters en insert code
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "libros{" + "id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
    
    
}
