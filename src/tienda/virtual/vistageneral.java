/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.virtual;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CLARA
 */
public class vistageneral extends javax.swing.JFrame {
TiendaVirtual tiendavirtual = new TiendaVirtual();
    /**
     * Creates new form vistageneral
     */
    public vistageneral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        popupMenu1.setLabel("popupMenu1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Añadir Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calificacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "cantidad", "marca", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jButton4.setText("Productos mejor calificados ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Remover compra");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cargar tabla");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "cantidad", "marca", "tipo", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(49, 49, 49)
                                    .addComponent(jButton4))
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        String nick = JOptionPane.showInputDialog(null, "Ingrese su nick");
       String pass = JOptionPane.showInputDialog(null, "Ingrese su pass");
       int numestrellas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de estrellas con el que desea clalificar el producto"));
        Usuario usuario = new Usuario(nick,pass);
         String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo del producto");
         for(Producto p: tiendavirtual.getProductos() ){
           if(p.getCodigo().equals(codigo)){
               usuario.CalificarProducto(p, numestrellas);
           }
       }
         JOptionPane.showMessageDialog(null, "Calificacion correctamente añadida");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

String filtro = JOptionPane.showInputDialog(null, "Ingrese el flitro (marca, tipo, etc.)");
int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio deseado"));
DefaultTableModel JTable1 = new DefaultTableModel();
       JTable1.setRowCount(0);
for(Producto p : tiendavirtual.FiltroListarproductos(filtro, precio)){
           JTable1.addRow(new Object []{p.getCodigo(),p.getCantidad(),p.getMarca(),p.getTipo(),p.getPrecio() } );
       }
    

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       int diafecha = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia"));
       int mesfecha = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del mes")); 
       CarritoDeCompras carrito = new CarritoDeCompras(diafecha, mesfecha);
       int numerocantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de productos"));
       String codigo= JOptionPane.showInputDialog(null, "Ingrese el codigo del producto");
        try{tiendavirtual.cargardatos();}catch(FileNotFoundException f){}
       try{for(Producto p: tiendavirtual.getProductos() ){
           if(p.getCodigo().equals(codigo)){
               carrito.añadircompra(p,numerocantidad);
               carrito.cargarcarrito(carrito);
           }
       }
       }catch(FileNotFoundException f){}
       DefaultTableModel JTable3 = (DefaultTableModel) jTable3.getModel();
       JTable3.setRowCount(0);
       try{tiendavirtual.cargardatos();}catch(FileNotFoundException f){}
       try{for(String scar : carrito.leercarrito()){
           for(Producto p : tiendavirtual.getProductos()){
               if(p.getCodigo().equals(scar)){
                 JTable3.addRow(new Object []{p.getCodigo(),p.getCantidad(),p.getMarca(),p.getTipo(),p.getPrecio() } );  
               }
           }
}}catch(FileNotFoundException f){}
       jTable3.setModel(JTable3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       DefaultTableModel JTable1 = new DefaultTableModel();
       
       JTable1.setRowCount(0);
       for(Producto p : tiendavirtual.productosmejorcalificados().values()){
           
           JTable1.addRow(new Object []{p.getCodigo(),p.getCantidad(),p.getMarca(),p.getTipo(),p.getPrecio() } );
       }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
           DefaultTableModel JTable1 = (DefaultTableModel) jTable1.getModel();
       JTable1.setRowCount(0);
       try{tiendavirtual.cargardatos();}catch(FileNotFoundException f){}
       for(Producto p : tiendavirtual.getProductos()){
           JTable1.addRow(new Object []{p.getCodigo(),p.getCantidad(),p.getMarca(),p.getTipo(),p.getPrecio() } );
}
       jTable1.setModel(JTable1);
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
       int diafecha = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia"));
       int mesfecha = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del mes"));
       int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero deproductos a remover"));
       String codigo = JOptionPane.showInputDialog(null, "Ingrese el numero del mes");
       DefaultTableModel JTable3 = (DefaultTableModel) jTable3.getModel();
       JTable3.setRowCount(0);
       try{tiendavirtual.cargardatos();}catch(FileNotFoundException f){}
       for(Usuario us : tiendavirtual.getUsuarios().values()){
          for(CarritoDeCompras cd : us.getFactura()){
              if(cd.getDiafecha()==diafecha && cd.getMesfecha()==mesfecha){
                  for(Producto p: tiendavirtual.getProductos()){
                      if(p.getCodigo().equals(codigo)){
                           cd.RemoverProductos(p, cantidad);
       for(Producto pr : cd.getCompras()){
           JTable3.addRow(new Object []{pr.getCodigo(),pr.getCantidad(),pr.getMarca(),pr.getTipo(),pr.getPrecio() } );
}
       }
       }
          }
       }
       }jTable3.setModel(JTable3);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistageneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistageneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistageneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistageneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistageneral().setVisible(true);
                
            }
        });
    }
 public void ajsf (){
           DefaultTableModel JTable1 = (DefaultTableModel) jTable1.getModel();
       
       TiendaVirtual tiendavirtual = new TiendaVirtual();
       JTable1.setRowCount(0);
       for(Producto p : tiendavirtual.getProductos()){
           JTable1.addRow(new Object []{p.getCodigo(),p.getCantidad(),p.getMarca(),p.getTipo(),p.getPrecio() } );
}
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
