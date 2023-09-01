/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Vendedor {
    String Nombre;
    int CantCV;
    double CantD;

    public String getNombre() {
        return Nombre;
    }

    public int getCantCV() {
        return CantCV;
    }

    public double getCantD() {
        return CantD;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantCV(int CantCV) {
        this.CantCV = CantCV;
    }

    public void setCantD(double CantD) {
        this.CantD = CantD;
    }

    public Vendedor(String Nombre, int CantCV, double CantD) {
        this.Nombre = Nombre;
        this.CantCV = CantCV;
        this.CantD = CantD;
    }

   

    @Override
    public String toString() {
        return  Nombre ;
    }
    
    
    
}
