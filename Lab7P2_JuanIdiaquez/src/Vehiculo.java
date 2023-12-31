
import java.awt.Color;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Vehiculo {
    
    String Marca;
    Color Color; 
    String Modelo;
    String Año;
    double Precio;
    int Id; 

    public String getMarca() {
        return Marca;
    }

    public Color getColor() {
        return Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getAño() {
        return Año;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getId() {
        return Id;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Vehiculo(String Marca, Color Color, String Modelo, String Año, double Precio, int Id) {
        this.Marca = Marca;
        this.Color = Color;
        this.Modelo = Modelo;
        this.Año = Año;
        this.Precio = Precio;
        this.Id = Id;
    }

    @Override
    public String toString() {
        return Marca ;
    }
    
    
    
    
}
