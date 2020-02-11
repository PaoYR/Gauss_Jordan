package Codigo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Multiplicacion extends javax.swing.JFrame {

    public Multiplicacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatriz2 = new javax.swing.JTable();
        txtDos = new javax.swing.JLabel();
        txtUno1 = new javax.swing.JLabel();
        txtUno2 = new javax.swing.JLabel();
        txtDos1 = new javax.swing.JLabel();
        txtColumnas1 = new javax.swing.JTextField();
        txtColumnas2 = new javax.swing.JTextField();
        txtFilas1 = new javax.swing.JTextField();
        txtFilas2 = new javax.swing.JTextField();
        btnGenerar1 = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatriz3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnGenerar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Schadow BT", 0, 36)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Multiplicación");
        txtTitulo.setAlignmentX(0.5F);
        txtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 269, 40));

        btnMenu.setBackground(new java.awt.Color(255, 150, 101));
        btnMenu.setText("Volver al menú ");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, -1, -1));

        tblMatriz1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 430, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 340, 80));

        tblMatriz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblMatriz2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 430, 190));

        txtDos.setText("Ingresa el número de Filas");
        getContentPane().add(txtDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, 20));

        txtUno1.setText("Ingresa el número de Columnas");
        getContentPane().add(txtUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 20));

        txtUno2.setText("Ingresa el número de Columnas");
        getContentPane().add(txtUno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, 20));

        txtDos1.setText("Ingresa el número de Filas");
        getContentPane().add(txtDos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, 20));

        txtColumnas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnas1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtColumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 130, 40));

        txtColumnas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnas2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtColumnas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 130, 40));

        txtFilas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilas1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 130, 40));

        txtFilas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilas2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtFilas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 130, 40));

        btnGenerar1.setFont(new java.awt.Font("Swis721 Hv BT", 0, 14)); // NOI18N
        btnGenerar1.setText("Generar");
        btnGenerar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerar1MouseClicked(evt);
            }
        });
        btnGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 100, 50));

        btnCalcular.setFont(new java.awt.Font("Swis721 Hv BT", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, -1));

        tblMatriz3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatriz3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 450, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 340, 500));

        btnGenerar2.setFont(new java.awt.Font("Swis721 Hv BT", 0, 14)); // NOI18N
        btnGenerar2.setText("Generar");
        btnGenerar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerar2MouseClicked(evt);
            }
        });
        btnGenerar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 100, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 850, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Menu menu= new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtColumnas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnas1ActionPerformed

    private void txtColumnas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnas2ActionPerformed

    private void txtFilas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilas1ActionPerformed

    private void txtFilas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilas2ActionPerformed

    private void btnGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar1ActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerar1ActionPerformed

    private void btnGenerar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerar1MouseClicked
        // TODO add your handling code here:
     try{
        int fila1, columna1;
        fila1= Integer.parseInt(txtFilas1.getText());
        columna1= Integer.parseInt(txtColumnas1.getText());
        if("".equals(txtFilas1.getText()) || "".equals(txtColumnas1.getText())) {
            //Falta implementar bien esta parte
            throw new Exception("");
        }
                if(fila1>10 || columna1>10 ){//La matriz solo puede tener una dimension de 10x10
                    JOptionPane.showMessageDialog(rootPane, "El número ingresado excede la capacidad de la tabla");}
                else{float [][] matriz= new float[10][10];//creo una matriz temporal
                     matriz= this.Generar1(matriz, fila1, columna1);//Genero la matriz
                     this.Generar1(matriz, fila1,columna1);//muestro la matriz
                     }
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Solo ingrese números Enteros");
            
        }
    }//GEN-LAST:event_btnGenerar1MouseClicked

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        TableModel modelo1 = tblMatriz1.getModel();
        TableModel model2= tblMatriz2.getModel();
        int fila_Res, colum_Res,col, fil;
        float [][] Matriz= new float [10][10];
        col= Integer.parseInt(txtColumnas1.getText());
        fil= Integer.parseInt(txtFilas2.getText());        
    try{
        if("".equals(txtFilas1.getText()) || "".equals(txtColumnas1.getText())) {
            //Falta implementar bien esta parte
            throw new Exception("");
        }
        if( col == fil){
                fila_Res= Integer.parseInt(txtFilas1.getText());
                colum_Res= Integer.parseInt(txtColumnas2.getText());
                Matriz= this.GenerarMatriz3(Matriz, fila_Res, colum_Res);//Genero la matriz
                this.GenerarMatriz3(Matriz, fila_Res, colum_Res);//muestro la matriz 
                    for(int i=0; i<fila_Res; i++) {
                        for(int j=0; j<colum_Res; j++){   
                        float multi=0;
                        for(int k=0; k<col; k++){
                           multi +=  Float.parseFloat(modelo1.getValueAt(i,k).toString())*Float.parseFloat(model2.getValueAt(k,j).toString());
                          JOptionPane.showMessageDialog(rootPane,multi);
                        }
                         tblMatriz3.setValueAt(multi, i,j);//Los muestro en la tabla 3 
                        }
                    }
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Estas matrices no se pueden multiplicar");
                Menu m= new Menu();
                m.setVisible(true);
                this.setVisible(false);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "El valor es invalido");
        }
        
            
          
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnGenerar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerar2MouseClicked
        // TODO add your handling code here:
    try{
        int fila2, columna2;
        fila2= Integer.parseInt(txtFilas2.getText());
        columna2= Integer.parseInt(txtColumnas2.getText());
        if(txtFilas2.getText()== null || txtColumnas2.getText()==null) {
            throw new Exception();
        }
                if(fila2>10 || columna2>10 ){//La matriz solo puede tener una dimension de 10x10
                    JOptionPane.showMessageDialog(rootPane, "El número ingresado excede la capacidad de la tabla");}
                else{//creo una matriz temporal
                     float [][] matriz2= new float[10][10];
                     matriz2=this.Generar2(matriz2, fila2, columna2);
                     this.Generar2(matriz2, fila2, columna2);
                     }
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Solo ingrese números Enteros");
            
        }  
    }//GEN-LAST:event_btnGenerar2MouseClicked

    private void btnGenerar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerar2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multiplicacion().setVisible(true);
            }
        });
    }
    
    public float [][] Generar1 (float matriz1[][], int fila, int columna){
    DefaultTableModel modelo1 = (DefaultTableModel) tblMatriz1.getModel();//Obtengo el modelo de la tabla
    modelo1.setColumnCount(columna);//Adato las columnas
    modelo1.setRowCount(fila);//Adato las filas
    for(int filas=0;filas<fila;filas++){
        for(int columnas=0;columnas<columna;columnas++){
            tblMatriz1.setValueAt(matriz1[filas][columnas], filas, columnas);//creo los espacios necesarios
        }
    }    
    return matriz1;
}
    public float [][] Generar2 (float matriz[][], int fila, int columna){
    DefaultTableModel modelo = (DefaultTableModel) tblMatriz2.getModel();//Obtengo el modelo de la tabla  
    modelo.setColumnCount(columna);//Adato las columnas
    modelo.setRowCount(fila);//Adato las filas
    for(int filas=0;filas<fila;filas++){
        for(int columnas=0;columnas<columna;columnas++){
            tblMatriz2.setValueAt(matriz[filas][columnas], filas, columnas);//creo los espacios necesarios
        }
    }    
    return matriz;
}
    public float[][] GenerarMatriz3(float matriz3[][], int fila, int colu){
    DefaultTableModel model3 = (DefaultTableModel) tblMatriz3.getModel();//Creo el objeto
    model3.setColumnCount(colu);//Adato las columnas
    model3.setRowCount(fila);//Adato las filas
    for(int filas=0;filas<fila;filas++){
        for(int columnas=0;columnas<colu;columnas++){
            tblMatriz3.setValueAt(matriz3[filas][columnas], filas, columnas);//creo los espacios necesarios
        }
    }    
    return matriz3;
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGenerar1;
    private javax.swing.JButton btnGenerar2;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMatriz1;
    private javax.swing.JTable tblMatriz2;
    private javax.swing.JTable tblMatriz3;
    private javax.swing.JTextField txtColumnas1;
    private javax.swing.JTextField txtColumnas2;
    private javax.swing.JLabel txtDos;
    private javax.swing.JLabel txtDos1;
    private javax.swing.JTextField txtFilas1;
    private javax.swing.JTextField txtFilas2;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtUno1;
    private javax.swing.JLabel txtUno2;
    // End of variables declaration//GEN-END:variables
}
