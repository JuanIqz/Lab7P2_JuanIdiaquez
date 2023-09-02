/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Venta {
    
    Vendedor vendedor;
    Cliente cliente;
    double CosT;
    Vehiculo carro;

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCosT() {
        return CosT;
    }

    public void setCosT(double CosT) {
        this.CosT = CosT;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public Venta(Vendedor vendedor, Cliente cliente, double CosT, Vehiculo carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.CosT = CosT;
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", CosT=" + CosT + ", carro=" + carro + '}';
    }
    
    
    
    
}
