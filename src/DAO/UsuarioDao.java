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

public class UsuarioDao {
    File file = new File("USUARIO.txt");
    public Usuario recibirdatosusuario(String nick, String pass)throws FileNotFoundException{
     Usuario usuarion = new Usuario(nick,pass);
     return usuarion;
    }
    public void guardarusuario(Usuario usuario)throws FileNotFoundException{
    PrintWriter pu = new PrintWriter(new FileOutputStream(this.file,true));
    pu.write(usuario.getNick()+",");
    pu.write(usuario.getPass()+",");
    pu.flush();
    pu.close();
    }
    public  HashMap<String,Usuario> lecturausuario()throws FileNotFoundException{
        HashMap<String,Usuario> usuarios = new HashMap<>();
    Scanner su = new Scanner(this.file);
    su.useDelimiter(",");
   while(su.hasNext()){
       String nick = su.next();
       String pass = su.next();
       Usuario usuarion = new Usuario(nick,pass);
      usuarios.put(nick, usuarion);
     
   }
   su.close()
           ;return usuarios;
    }
    
    
}
