/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package tienda.GestionProducto;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import tienda.Conexion;

/**
 *
 * @author Juan Miguel
 */
public final class ModifyProducts extends java.awt.Dialog {

    Connection con = new Conexion().getConnection();
    PreparedStatement ps;
    ResultSet rs;
    boolean Seleccion_descuento = false;
    double precio_venta = 0;

    public ModifyProducts(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        JlPorcentaje.setVisible(false);
        JlPorcentaje2.setVisible(false);
        JspPorcDescuento.setVisible(false);
        SpinnerNumberModel snm = new SpinnerNumberModel(0, 0, 100, 5);
        SpinnerNumberModel snm2 = new SpinnerNumberModel(0, 0, 100, 5);
        JspPorcGanancia.setModel(snm);
        JspPorcDescuento.setModel(snm2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecio_base = new javax.swing.JTextField();
        txtPrecio_venta = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnCompletar = new javax.swing.JButton();
        JspPorcGanancia = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        JchkPromocion = new javax.swing.JCheckBox();
        JlPorcentaje = new javax.swing.JLabel();
        JspPorcDescuento = new javax.swing.JSpinner();
        JlPorcentaje2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTipoProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar datos de producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel4.setText("Precio base");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel5.setText("Porcentaje de ganancia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel6.setText("Precio de venta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel7.setText("Cantidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 238, -1));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 238, -1));
        jPanel1.add(txtPrecio_base, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 238, -1));

        txtPrecio_venta.setEditable(false);
        jPanel1.add(txtPrecio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 238, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 238, -1));

        btnCompletar.setText("Aceptar");
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 90, -1));

        JspPorcGanancia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JspPorcGananciaStateChanged(evt);
            }
        });
        JspPorcGanancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JspPorcGananciaMouseClicked(evt);
            }
        });
        jPanel1.add(JspPorcGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel8.setText("%");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        JchkPromocion.setText("Promocion");
        JchkPromocion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JchkPromocionItemStateChanged(evt);
            }
        });
        jPanel1.add(JchkPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        JlPorcentaje.setText("Porcentaje de descuento");
        jPanel1.add(JlPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));

        JspPorcDescuento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JspPorcDescuentoStateChanged(evt);
            }
        });
        jPanel1.add(JspPorcDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, 30));

        JlPorcentaje2.setText("%");
        jPanel1.add(JlPorcentaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, -1, -1));

        jLabel9.setText("Tipo producto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));
        jPanel1.add(txtTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 238, -1));

        jLabel10.setText("Descripcion");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 240, -1));

        jLabel11.setText("ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        txtID.setEditable(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        precio_venta = Double.parseDouble(txtPrecio_base.getText()) + (Double.parseDouble(txtPrecio_base.getText()) * ((int) JspPorcGanancia.getValue()) / 100);
        if (JchkPromocion.isSelected()) {
            precio_venta = precio_venta - (precio_venta * ((int) JspPorcDescuento.getValue()) / 100);
        }
        try {

            ps = con.prepareStatement("UPDATE productos SET nombre = ?, marca = ?, precio_base = ?, porcentaje_ganancia = ?, precio_venta = ?, cantidad = ?, promocion = ?, porcentaje_promocion = ?, descripcion = ?, tipo_producto = ? WHERE id = ?");
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtMarca.getText());
            ps.setDouble(3, Double.parseDouble(txtPrecio_base.getText()));
            ps.setDouble(4, (int) JspPorcGanancia.getValue());
            ps.setDouble(5, precio_venta);
            ps.setInt(6, Integer.parseInt(txtCantidad.getText()));
            ps.setBoolean(7, Seleccion_descuento);
            ps.setDouble(8, (int) JspPorcDescuento.getValue());
            ps.setString(9, txtDescripcion.getText());
            ps.setString(10, txtTipoProducto.getText());
            ps.setInt(11, Integer.parseInt(txtID.getText()));
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se guardo la informacion");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar");
            }
            con.close();
        } catch (NumberFormatException | SQLException e) {
            System.out.println("error: " + e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompletarActionPerformed

    private void JspPorcGananciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JspPorcGananciaStateChanged
        precio_venta = Double.parseDouble(txtPrecio_base.getText()) + (Double.parseDouble(txtPrecio_base.getText()) * ((int) JspPorcGanancia.getValue()) / 100);
        txtPrecio_venta.setText(String.valueOf(precio_venta));
        // TODO add your handling code here:
    }//GEN-LAST:event_JspPorcGananciaStateChanged

    private void JspPorcGananciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JspPorcGananciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JspPorcGananciaMouseClicked

    private void JchkPromocionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JchkPromocionItemStateChanged
        if (JchkPromocion.isSelected()) {
            JlPorcentaje.setVisible(true);
            JlPorcentaje2.setVisible(true);
            JspPorcDescuento.setVisible(true);
            Seleccion_descuento = true;
        } else {
            JlPorcentaje.setVisible(false);
            JlPorcentaje2.setVisible(false);
            JspPorcDescuento.setVisible(false);
            Seleccion_descuento = false;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JchkPromocionItemStateChanged

    private void JspPorcDescuentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JspPorcDescuentoStateChanged
        double precio_descuento = precio_venta - (precio_venta * ((int) JspPorcDescuento.getValue()) / 100);
        txtPrecio_venta.setText(String.valueOf(precio_descuento));
        // TODO add your handling code here:
    }//GEN-LAST:event_JspPorcDescuentoStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mostrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    public void mostrar() {
        try {
            ps = con.prepareStatement("SELECT * FROM productos WHERE id = ?");
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            rs = ps.executeQuery();
            rs.next();
            txtNombre.setText(rs.getString("nombre"));
            txtMarca.setText(rs.getString("marca"));
            txtDescripcion.setText(rs.getString("descripcion"));
            txtTipoProducto.setText(rs.getString("tipo_producto"));
            txtPrecio_base.setText(String.valueOf(rs.getDouble("precio_base")));
            JspPorcGanancia.setValue(rs.getInt("porcentaje_ganancia"));
            txtPrecio_venta.setText(String.valueOf(rs.getDouble("precio_venta")));
            txtCantidad.setText(String.valueOf(rs.getInt("cantidad")));
            if (rs.getBoolean("promocion")) {
                JchkPromocion.setEnabled(true);
                JspPorcDescuento.setValue(rs.getInt("porcentaje_promocion"));
                JlPorcentaje.setVisible(true);
                JlPorcentaje2.setVisible(true);
                JspPorcDescuento.setVisible(true);
                Seleccion_descuento = true;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifyProducts dialog = new ModifyProducts(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JchkPromocion;
    private javax.swing.JLabel JlPorcentaje;
    private javax.swing.JLabel JlPorcentaje2;
    private javax.swing.JSpinner JspPorcDescuento;
    private javax.swing.JSpinner JspPorcGanancia;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio_base;
    private javax.swing.JTextField txtPrecio_venta;
    private javax.swing.JTextField txtTipoProducto;
    // End of variables declaration//GEN-END:variables
}