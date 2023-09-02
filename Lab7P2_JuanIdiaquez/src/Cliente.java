/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Cliente {
    String Nombre;
    int Edad;
    String Profesion;
    int CantCCom;
    int SueldoD;

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public int getCantCCom() {
        return CantCCom;
    }

    public int getSueldoD() {
        return SueldoD;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public void setCantCCom(int CantCCom) {
        this.CantCCom = CantCCom;
    }

    public void setSueldoD(int SueldoD) {
        this.SueldoD = SueldoD;
    }

    public Cliente(String Nombre, int Edad, String Profesion, int CantCCom, int SueldoD) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesion = Profesion;
        this.CantCCom = CantCCom;
        this.SueldoD = SueldoD;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Profesion=" + Profesion + ", CantCCom=" + CantCCom + ", SueldoD=" + SueldoD + '}';
    }
    

            
}
