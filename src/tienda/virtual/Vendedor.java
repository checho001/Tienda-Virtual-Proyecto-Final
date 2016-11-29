/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.virtual;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author CLARA
 */
public class Vendedor extends Usuario{
     private double ValorExtra;
    private double Ganancia;
    private int Membrecia;
    private String marca;
    private double valorR; // por insatisfaccion.

    public Vendedor(int Membrecia, String marca, String Nick, String Pass) {
        super(Nick, Pass);
        this.Membrecia = Membrecia;
        this.marca = marca;
        this.valorR = valorR;
    }
    public void enviarpromocion(Usuario usuario, int rebaja, int numclientes){
        int j=0;
       TreeMap<Integer, Usuario> us =  tv.ClientesEspeciales(this.Membrecia);
           for(Usuario s: us.values()){
              if(numclientes>j){ 
                 CarritoDeCompras cdc= s.getFactura().get(s.getFactura().size());
                 cdc.setCostoTotal(cdc.getCostoTotal()*rebaja/100);
           }
      j++; }
    } 

    public double getValorExtra() {
        return ValorExtra;
    }

    public void setValorExtra(double ValorExtra) {
        this.ValorExtra = ValorExtra;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double Ganancia) {
        this.Ganancia = Ganancia;
    }

    public int Membrecia() {
        return Membrecia;
    }

    public void setMembrecia(int Membrecia) {
        this.Membrecia = Membrecia;
    }

    public double getValorR() {
        return valorR;
    }

    public void setValorR(double valorR) {
        this.valorR = valorR;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
