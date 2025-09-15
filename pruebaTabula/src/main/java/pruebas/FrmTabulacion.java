package pruebas;

import implementaciones.Tabula;
import implementaciones.Tabula.Punto;
import java.text.DecimalFormat;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author PC EXPRESS NAVOJOA
 */
public class FrmTabulacion extends javax.swing.JFrame {

    public FrmTabulacion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Tabulacion de Funciones");
    }


 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLI = new javax.swing.JLabel();
        txtXi = new javax.swing.JTextField();
        lblLS = new javax.swing.JLabel();
        txtXf = new javax.swing.JTextField();
        lblICX = new javax.swing.JLabel();
        txtIncX = new javax.swing.JTextField();
        cmbFuncion = new javax.swing.JComboBox<>();
        btnTabular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        lblMinimo = new javax.swing.JLabel();
        lblMaximo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setText("Tabulacion de Funciones");

        lblLI.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        lblLI.setText("Limite inferior (xi):");

        txtXi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblLS.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        lblLS.setText("Limite superior (xf):");

        txtXf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblICX.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        lblICX.setText("Incremento (incx):");

        txtIncX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        cmbFuncion.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        cmbFuncion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "f(x) = 4x³ - 6x² + 7x - 2.3", "g(x) = x * |cos(x)| - 5" }));
        cmbFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionActionPerformed(evt);
            }
        });

        btnTabular.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btnTabular.setText("Tabular");
        btnTabular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabularActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        tblResultados.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "x", "y"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        lblMinimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMinimo.setText("Minimo:");

        lblMaximo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaximo.setText("Maximo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblICX, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblMinimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIncX, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(btnTabular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtXf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addComponent(cmbFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(cmbFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnTabular))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtXi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLS)
                                    .addComponent(txtXf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblICX)
                                    .addComponent(txtIncX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblLI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMinimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMaximo)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionActionPerformed
        
    }//GEN-LAST:event_cmbFuncionActionPerformed

    private void btnTabularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabularActionPerformed
         try {
            double xi = Double.parseDouble(txtXi.getText());
            double xf = Double.parseDouble(txtXf.getText());
            double incx = Double.parseDouble(txtIncX.getText());

            DoubleUnaryOperator funcion;
            if (cmbFuncion.getSelectedIndex() == 0) {
                funcion = (x) -> 4*Math.pow(x, 3) - 6*Math.pow(x, 2) + 7*x - 2.3;
            } else {
                funcion = (x) -> x * Math.abs(Math.cos(x)) - 5;
            }

            List<Punto> resultados = Tabula.tabula(funcion, xi, xf, incx);

            // Encargado de agregar los digitos depues del punto
            DecimalFormat df = new DecimalFormat("0.000000");

            // Encargado de mostrarnos la tabla 
            DefaultTableModel model = new DefaultTableModel(new Object[]{"x", "y"}, 0);
            for (int i = 0; i < resultados.size() - 2; i++) {
                Punto p = resultados.get(i);
                model.addRow(new Object[]{
                    df.format(p.x),
                    df.format(p.y)
                });
            }
            tblResultados.setModel(model);

            Punto max = resultados.get(resultados.size() - 2);
            Punto min = resultados.get(resultados.size() - 1);
            lblMaximo.setText("Maximo: x = " + df.format(max.x) + ", y = " + df.format(max.y));
            lblMinimo.setText("Minimo: x = " + df.format(min.x) + ", y = " + df.format(min.y));

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Verifique valores ingresados");
        }
    
    
    }//GEN-LAST:event_btnTabularActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTabulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTabulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTabulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTabulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTabulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTabular;
    private javax.swing.JComboBox<String> cmbFuncion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblICX;
    private javax.swing.JLabel lblLI;
    private javax.swing.JLabel lblLS;
    private javax.swing.JLabel lblMaximo;
    private javax.swing.JLabel lblMinimo;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtIncX;
    private javax.swing.JTextField txtXf;
    private javax.swing.JTextField txtXi;
    // End of variables declaration//GEN-END:variables
}
