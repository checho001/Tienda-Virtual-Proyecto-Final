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
import java.util.HashMap;
import javax.swing.JOptionPane;
import tienda.virtual.Usuario;

/**
 *
 * @author CLARA
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
import tienda.virtual.Vendedor;
import tienda.virtual.Usuario;

public class VendedorDao {
    File file = new File("VENDEDOR.txt");
    public Vendedor recibirdatosusuariov(String nick, String pass, String marca, int membrecia)throws FileNotFoundException{
     Vendedor vendedorn = new Vendedor (membrecia, nick, marca, pass);
     return vendedorn;
    }
    public void guardarusuariov(Vendedor vendedor)throws FileNotFoundException{
    PrintWriter pu = new PrintWriter(new FileOutputStream(this.file,true));
    pu.write(vendedor.getNick()+",");
    pu.write(vendedor.getPass()+",");
    pu.write(vendedor.getMarca()+",");
    pu.write(vendedor.Membrecia()+",");
    pu.flush();
    pu.close();
    }
    public  HashMap<Integer,Vendedor> lecturausuariov()throws FileNotFoundException{
        HashMap<Integer,Vendedor> vendedor = new HashMap<>();
    Scanner su = new Scanner(this.file);
    su.useDelimiter(",");
   while(su.hasNext()){
       String nick = su.next();
       String pass = su.next();
        String marca = su.next();
        int membrecia = su.nextInt();
       Vendedor vendedorn = new Vendedor(membrecia, nick, marca, pass);
      vendedor.put(membrecia, vendedorn);
     
   }
   su.close();
           return vendedor;
    }
    
    
}
