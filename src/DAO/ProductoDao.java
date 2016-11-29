/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import tienda.virtual.Producto;

/**
 *
 * @author CLARA
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;
import tienda.virtual.Producto;
import tienda.virtual.Usuario;

public class ProductoDao {
    File file = new File("PRODUCTO.txt");
    
    public Producto recibirdatosproducto()throws FileNotFoundException{
     String cod = JOptionPane.showInputDialog(null, "Codigo");
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad"));
    String marca= JOptionPane.showInputDialog(null, "Marca");
    String tipo= JOptionPane.showInputDialog(null, "Tipo");
    int precio= Integer.parseInt(JOptionPane.showInputDialog(null, "Precio"));
    Producto producton = new Producto(cod, cantidad, marca, tipo, precio);
    return producton;
    }
    public void guardarproducto(Producto producto)throws FileNotFoundException{
    PrintWriter pp = new PrintWriter(new FileOutputStream(this.file,true));
    pp.write(producto.getCantidad()+";");
    pp.write(producto.getCodigo()+";");
    pp.write(producto.getMarca()+";");
    pp.write(producto.getTipo()+";");
    int a = (int)Math.floor(producto.getPrecio());
    pp.write(a+";");
    pp.flush();
    pp.close();
    }
     public  ArrayList<Producto> lecturaproducto()throws FileNotFoundException{
        ArrayList<Producto> productos = new ArrayList<>();
    Scanner su = new Scanner(this.file);
    su.useDelimiter(";");
   while(su.hasNext()){
       String cod = su.next();
       int cantidad= su.nextInt();
       String marca = su.next();
       String tipo = su.next();
      int precio = su.nextInt();
       Producto producton = new Producto(cod, cantidad,marca,tipo,precio);
      productos.add(producton);
   }su.close();
   return productos;
    }
    
    
}
