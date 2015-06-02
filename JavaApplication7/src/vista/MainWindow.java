/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bean.ProductoBean;
import datos.ProductoDAO;
import datos.ProductoDAOFileImpl;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author alexis
 */
public class MainWindow extends javax.swing.JFrame {
    
    private ProductoDAO productoDAO;
    private boolean isEditting;
    private DefaultListModel lista_venta;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.setTitle("Applicator v1.0");
        this.productoDAO = new ProductoDAOFileImpl("productos.dat");
        this.lista_venta = new DefaultListModel();
        this.clearTF();
        this.isEditting = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        TF_precio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_productos = new javax.swing.JList();
        B_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_stock = new javax.swing.JTextField();
        TF_codigo = new javax.swing.JTextField();
        TF_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        L_retroalimentacion = new javax.swing.JLabel();
        B_Editar = new javax.swing.JButton();
        B_Eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Spinner_Cantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List_productos_venta = new javax.swing.JList();
        B_Agregar_Producto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List_productos_disponibles = new javax.swing.JList();
        Label_Venta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TF_precio.setToolTipText("");
        TF_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_precioActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        List_productos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(List_productos);

        B_guardar.setText("Guardar");
        B_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_guardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel4.setText("Stock");

        TF_stock.setToolTipText("");
        TF_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_stockActionPerformed(evt);
            }
        });

        TF_codigo.setEditable(false);
        TF_codigo.setToolTipText("");
        TF_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_codigoActionPerformed(evt);
            }
        });

        TF_nombre.setToolTipText("");
        TF_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_nombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio");

        L_retroalimentacion.setText("...");

        B_Editar.setText("Editar");
        B_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_EditarActionPerformed(evt);
            }
        });

        B_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(L_retroalimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(B_guardar)
                                .addGap(29, 29, 29)
                                .addComponent(B_Editar)
                                .addGap(31, 31, 31)
                                .addComponent(B_Eliminar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(TF_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(TF_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(TF_codigo))))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_retroalimentacion)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_guardar)
                            .addComponent(B_Editar)
                            .addComponent(B_Eliminar)))
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24))
        );

        jTabbedPane3.addTab("Producto", jPanel3);

        jButton1.setText("Remover Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Realizar Venta");
        jButton2.setMaximumSize(new java.awt.Dimension(137, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(137, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Cantidad");

        jScrollPane2.setViewportView(List_productos_venta);

        B_Agregar_Producto.setText("Agregar Producto");
        B_Agregar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agregar_ProductoActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(List_productos_disponibles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Spinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(B_Agregar_Producto))
                            .addComponent(Label_Venta))
                        .addGap(0, 190, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(Label_Venta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Agregar_Producto)
                    .addComponent(Spinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane3.addTab("Venta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_codigoActionPerformed

    private void TF_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_nombreActionPerformed

    private void TF_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_precioActionPerformed

    private void TF_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_stockActionPerformed

    private void B_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_guardarActionPerformed
        ProductoBean producto = new ProductoBean();
        producto.setNombre(TF_nombre.getText());
        producto.setCódigo(Integer.valueOf(TF_codigo.getText()));
        producto.setPrecio(Integer.valueOf(TF_precio.getText()));
        producto.setStock(Integer.valueOf(TF_stock.getText()));
        if(this.isEditting){    
            this.productoDAO.modificarProducto(producto);
            L_retroalimentacion.setText("La base de datos ha sido actualizada.");
        }else{
            if(this.productoDAO.agregarProducto(producto)){
                L_retroalimentacion.setText("La base de datos ha sido actualizada.");
            }else{
                L_retroalimentacion.setText("WARNING: ¡La base de datos no ha sido actualizada!");
            }
        }
        this.clearTF();
    }//GEN-LAST:event_B_guardarActionPerformed

    private void B_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_EditarActionPerformed
        String nombreElementoSeleccionado = (String)List_productos.getSelectedValue();
        
        for (ProductoBean bean : this.productoDAO.listarProductos()) {
            if( nombreElementoSeleccionado == bean.getNombre()){
                TF_nombre.setText(bean.getNombre());
                TF_codigo.setText(String.valueOf(bean.getCódigo())) ;
                TF_precio.setText(String.valueOf(bean.getPrecio()));
                TF_stock.setText(String.valueOf(bean.getStock()));
                this.isEditting = true;
            }
                
        }
        
    }//GEN-LAST:event_B_EditarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lista_venta.remove(List_productos_venta.getSelectedIndex());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B_Agregar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agregar_ProductoActionPerformed
        String nombreElementoSeleccionado = (String)List_productos_disponibles.getSelectedValue();
        
        List_productos_venta.setModel(lista_venta);
        
        for (ProductoBean bean : this.productoDAO.listarProductos()) {
            if( nombreElementoSeleccionado == bean.getNombre() ){
                Integer cantidad = (Integer)Spinner_Cantidad.getValue();
                if (bean.getStock() >= cantidad && cantidad != 0){
                    lista_venta.addElement(cantidad + " x " + bean.getNombre());
                }
                else if(cantidad == 0){
                    Label_Venta.setText("La cantidad debe ser mayor a 0");
                }
                else{
                    Label_Venta.setText("No hay stock suficiente");
                }
            }
        }        
    }//GEN-LAST:event_B_Agregar_ProductoActionPerformed

    private void clearTF(){
        TF_nombre.setText("");
        TF_codigo.setText(String.valueOf(this.productoDAO.obtenerCódigoMásAltoDeProducto()+1));
        TF_precio.setText("");
        TF_stock.setText("");
        
        DefaultListModel dlm = new DefaultListModel();
        
        List<ProductoBean> tmp = this.productoDAO.listarProductos();
        for (ProductoBean bean : tmp) {
            dlm.addElement(bean.getNombre());
       }
        List_productos_disponibles.setModel(dlm);
        List_productos.setModel(dlm);
    }
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agregar_Producto;
    private javax.swing.JButton B_Editar;
    private javax.swing.JButton B_Eliminar;
    private javax.swing.JButton B_guardar;
    private javax.swing.JLabel L_retroalimentacion;
    private javax.swing.JLabel Label_Venta;
    private javax.swing.JList List_productos;
    private javax.swing.JList List_productos_disponibles;
    private javax.swing.JList List_productos_venta;
    private javax.swing.JSpinner Spinner_Cantidad;
    private javax.swing.JTextField TF_codigo;
    private javax.swing.JTextField TF_nombre;
    private javax.swing.JTextField TF_precio;
    private javax.swing.JTextField TF_stock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}