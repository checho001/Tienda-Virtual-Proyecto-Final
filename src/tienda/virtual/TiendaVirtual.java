/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.virtual;

import java.util.*;
import DAO.ProductoDao;
import DAO.VendedorDao;
import DAO.UsuarioDao;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
/**
 *
 * @author CLARA
 */
public class TiendaVirtual {
    
private HashMap<Integer,Vendedor> Vendedor;
  private  HashMap<String,Usuario> Usuarios;
  private ArrayList<Producto> Productos;

    public TiendaVirtual() {
        this.Vendedor = new HashMap<>();
  this.Usuarios = new HashMap<>();
   this.Productos = new ArrayList<>();
    }
    public void cargardatos()throws FileNotFoundException{
        UsuarioDao daou=new UsuarioDao();
        VendedorDao daov=new VendedorDao();
        ProductoDao daop= new ProductoDao();
        this.Vendedor = daov.lecturausuariov();
        this.Usuarios = daou.lecturausuario();
        this.Productos=daop.lecturaproducto();
    }
    public boolean iniciosesion(String nick, String pass)throws FileNotFoundException{
        boolean tf= false;
        for(Usuario us: this.Usuarios.values()){
            if(us.getNick().equals(nick)){
                if(us.getPass().equals(pass)){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion correcto"); 
                    tf=true;
                }else{
                 JOptionPane.showMessageDialog(null, "Nick o Contraseña incorrecta");
                }
            }else {
               
            }
        }
        if(tf==false){
            JOptionPane.showMessageDialog(null, "Usted aun no tiene un usuario registrado"); 
        }
        return tf;
    }
    public boolean iniciosesionv(String nick, String pass)throws FileNotFoundException{
        boolean tf= false;
        for(Vendedor vus: this.Vendedor.values()){
            if(vus.getNick().equals(nick)){
                if(vus.getPass().equals(pass)){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion correcto"); 
                    tf=true;
                }else{
                 JOptionPane.showMessageDialog(null, "Nick o Contraseña incorrecta");   
                }
            }else {
               
            }
        }
        if(tf==false){
            JOptionPane.showMessageDialog(null, "Usted aun no tiene un usuario registrado"); 
        }
        return tf;
    }
    public void RegistrarUsuariov(String nick, String pass, String marca, int membrecia)throws FileNotFoundException{
  VendedorDao dao=new VendedorDao();
  Vendedor vus = dao.recibirdatosusuariov( nick, pass, marca, membrecia);
  dao.guardarusuariov(vus);
  }
 public void RegistrarUsuario(String nick, String pass)throws FileNotFoundException{
  UsuarioDao dao=new UsuarioDao();
  Usuario us = dao.recibirdatosusuario(nick, pass);
  dao.guardarusuario(us);
  }
  public void RegistrarProducto()throws FileNotFoundException{
  ProductoDao dao=new ProductoDao();
  Producto p = dao.recibirdatosproducto();
  dao.guardarproducto(p);
  }
      public double CalcularGananciasV(int membrecia, int diainicial, int mesinicial, int diafinal, int mesfinal){
     String marca = Vendedor.get(membrecia).getMarca();
     double ganancia=0;
     for(Usuario s: this.Usuarios.values() ){
         for(CarritoDeCompras cd: s.getFactura() ){
         if(cd.getMesfecha()>=mesinicial && cd.getMesfecha()<=mesfinal){
             if(cd.getDiafecha()>=diainicial && cd.getDiafecha()<=diafinal){
              for(Producto ps : cd.getCompras()){
                if(ps.getMarca().equals(marca)){
                   ganancia+= ps.getPrecio();
                }
               }
              }
             }
            }
           } return ganancia;
      }
      public ArrayList<Producto> ListarProductosv(int membrecia, int diainicial, int mesinicial, int diafinal, int mesfinal){
     String marca = Vendedor.get(membrecia).getMarca();
     ArrayList <Producto>p=new ArrayList<>();
     for(Usuario s: this.Usuarios.values() ){
         for(CarritoDeCompras cd: s.getFactura() ){
         if(cd.getMesfecha()>=mesinicial && cd.getMesfecha()<=mesfinal){
             if(cd.getDiafecha()>=diainicial && cd.getDiafecha()<=diafinal){
              for(Producto ps : cd.getCompras()){
                if(ps.getMarca().equals(marca)){
                  p.add(ps);
                }
               }
              }
             }
            }
           } return p;
      }
      public TreeMap <Integer ,Usuario> ClientesEspeciales(int membrecia){
     String marca = Vendedor.get(membrecia).getMarca();
     TreeMap <Integer ,Usuario>us=new TreeMap<>();
     int count=0;
     for(Usuario s: this.Usuarios.values() ){
         for(CarritoDeCompras cd: s.getFactura() ){
              for(Producto ps : cd.getCompras()){
                if(ps.getMarca().equals(marca)){
                   count++;
              }
                if(count!=0){
                    us.put(count, s);
                }
             }
            }
           }return us;
      }
public ArrayList<Producto> FiltroListarproductos (String filtro, int precio){
    ArrayList<Producto> ps=new ArrayList<>();
    for(Producto p: this.Productos){
        if(filtro!=null && precio!=0){
       if(p.getCodigo().equals(filtro) || p.getMarca().equals(filtro) || p.getTipo().equals(filtro)){
          
       if(p.getPrecio()>=(precio*(1.3)) && p.getPrecio()<=(precio*(0.7))){
           ps.add(p);
       }
       }
        }
    }return ps;
}
public  TreeMap<Integer,Producto> productosmejorcalificados(){
    TreeMap<Integer,Producto> pmc = new TreeMap<>();
    for(Producto p: this.Productos){
        pmc.put(p.calificacionneta(), p);
    }
    return pmc;
}
public void añadircantidadproducto(String codigo, int cantidad)throws FileNotFoundException{
    for(Producto p: this.Productos){
        if(p.getCodigo().equals(codigo)){
            p.setCantidadinicial(cantidad);
            p.setCantidad(cantidad);
        }
        ProductoDao daop= new ProductoDao();
        Producto pu = daop.recibirdatosproducto();
        daop.guardarproducto(pu);
    }
}
public void ProductosmasVendidos(){
    TreeMap<Integer,Producto> pmv=new TreeMap<>();
    for(Producto p:this.Productos){
       int a = p.getCantidad()-p.getCantidadinicial();
       pmv.put(a, p);
    }
}

public Producto[] Publicidad(){
    Producto[] productos= new Producto[10];
    double[] maximos= new double[5];
    int[] key= new int[5];
    double dato1=0;
    
    for(Producto p:this.Productos){
        dato1=p.getCalificacionTotal();
        
        if(maximos[4]<=dato1){
            maximos[4]=dato1;
            productos[4]=p;
            maximos[3]=maximos[4];
            productos[3]=productos[4];
            maximos[2]=maximos[3];
            productos[2]=productos[3];
            maximos[1]=maximos[2];
            productos[1]=productos[2];
            maximos[0]=maximos[1];
            productos[0]=productos[1];
        }else if(maximos[3]<=dato1){
            maximos[3]=dato1;
            productos[3]=p;
            maximos[2]=maximos[3];
            productos[2]=productos[3];
            maximos[1]=maximos[2];
            productos[1]=productos[2];
            maximos[0]=maximos[1];
            productos[0]=productos[1];

        }else if(maximos[2]<=dato1){
            maximos[2]=dato1;
            productos[2]=p;
            maximos[1]=maximos[2];
            productos[1]=productos[2];
            maximos[0]=maximos[1];
            productos[0]=productos[1];
        }else if(maximos[1]<=dato1){
            maximos[1]=dato1;
            productos[1]=p;
            maximos[0]=maximos[1];
            productos[0]=productos[1];
        }else if(maximos[0]<=dato1){
            maximos[0]=dato1;
            productos[0]=p;
                        
            }
        }
    return productos;
}

public double GananciaTienda(){
    double Total=0;
    Total+=this.Usuarios.size()*100;
    Total+=this.Vendedor.size()*200;
    return Total;
}

    public HashMap<Integer, Vendedor> getVendedor() {
        return Vendedor;
    }

    public void setVendedor(HashMap<Integer, Vendedor> Vendedor) {
        this.Vendedor = Vendedor;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }

}

      
  

