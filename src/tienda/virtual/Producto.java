/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.virtual;

import java.util.*;

/**
 *
 * @author CLARA
 */
public class Producto {
   private String Codigo;
    private int Cantidad;
    private int Cantidadinicial;
    private String Marca;
    private String tipo;
    private int Precio;
    private ArrayList<Integer> CalificacionPonderada;
    private int CalificacionTotal;

    public Producto(String Codigo, int Cantidad, String Marca, String tipo, int Precio) {
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Marca = Marca;
        this.tipo = tipo;
        this.Precio = Precio;
        this.Cantidadinicial= Cantidad;
    }

    
    
public int calificacionneta(){
    for(int i=0; this.CalificacionPonderada.size()>i;i++){
        this.CalificacionTotal+=this.CalificacionPonderada.get(i);
    } 
    return (this.CalificacionTotal/this.CalificacionPonderada.size());
}
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getCantidadinicial() {
        return Cantidadinicial;
    }

    public void setCantidadinicial(int Cantidadinicial) {
        this.Cantidadinicial += Cantidadinicial;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad += Cantidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Integer> getCalificacionPonderada() {
        return CalificacionPonderada;
    }

    public void setCalificacionPonderada(int numestrellas) {
        this.CalificacionPonderada.add(numestrellas);
    }

    public int getCalificacionTotal() {
        return CalificacionTotal;
    }

    public void setCalificacionTotal(int CalificacionTotal) {
        this.CalificacionTotal = CalificacionTotal;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    
    
}
