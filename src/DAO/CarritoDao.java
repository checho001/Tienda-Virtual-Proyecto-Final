/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author oscar
 */
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
import tienda.virtual.CarritoDeCompras;
public class CarritoDao {
    File file = new File("CARRITO.txt");
    
    public void guardarcarrito(CarritoDeCompras carrito)throws FileNotFoundException{
    PrintWriter pp = new PrintWriter(new FileOutputStream(this.file,true));
    pp.write(carrito.getDiafecha()+";");
    pp.write(carrito.getMesfecha()+";");
    for(Producto p: carrito.getCompras()){
    pp.write(p.getCodigo()+";");
    }
    pp.flush();
    pp.close();
    }
     public ArrayList<String> lecturacarrito()throws FileNotFoundException{
        ArrayList<String> productos = new ArrayList<>();
    Scanner su = new Scanner(this.file);
    su.useDelimiter(";");
   while(su.hasNext()){
       int dia= su.nextInt();
      int mes = su.nextInt();
      while(!su.hasNextInt()){
          String cod = su.next();
          productos.add(cod);
      }
       CarritoDeCompras carriton = new CarritoDeCompras(dia,mes);
   }su.close();
   return productos;
    }
    
    
}
