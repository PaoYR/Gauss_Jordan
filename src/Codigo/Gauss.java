/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gauss extends javax.swing.JFrame {
    
    float[][] matriz;
    
    public Gauss() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        btnMenu1 = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        txtIncognitas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGauss = new javax.swing.JTable();
        btnResolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaResultados = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        btnMenu.setBackground(new java.awt.Color(255, 150, 101));
        btnMenu.setText("Volver al menú ");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Schadow BT", 0, 36)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Gauss Jordan");
        txtTitulo.setAlignmentX(0.5F);
        txtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 269, 40));

        btnMenu1.setBackground(new java.awt.Color(255, 150, 101));
        btnMenu1.setText("Volver al menú ");
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        btnGenerar.setText("Generar");
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        txtIncognitas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIncognitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncognitasActionPerformed(evt);
            }
        });
        getContentPane().add(txtIncognitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 130, 40));

        tblGauss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x"
            }
        ));
        jScrollPane1.setViewportView(tblGauss);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 210));

        btnResolver.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        btnResolver.setText("Resolver");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 140, 40));

        txtaResultados.setEditable(false);
        txtaResultados.setColumns(20);
        txtaResultados.setRows(5);
        jScrollPane2.setViewportView(txtaResultados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 400, 200));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel5.setText("Ingrese cuantas incognitas se vas a resolver:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 420, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 760, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 480));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 20, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Menu menu= new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        // TODO add your handling code here:
        Menu menu= new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void txtIncognitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncognitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncognitasActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
        // TODO add your handling code here:
    try{
    int incog;
    incog= Integer.parseInt(txtIncognitas.getText());
    if(incog>9){//La matriz solo puede tener una dimension de 10x10
    throw new Exception();}
    else{
        if(incog<=1 ){
           throw new Exception();       
        }
        else{
            Object titulo[] = new Object[incog+1];
            for(int i=0; i<incog+1; i++){
                if(i<incog){
                    titulo[i]="x"+(i+1);
                }else{
                    titulo[i]="Resultado";
                }
            }
            DefaultTableModel modelo= new DefaultTableModel();
            modelo = new DefaultTableModel(titulo,incog);
            tblGauss.setModel(modelo);
            
            }
        }
    }
    catch(Exception e){
    
    JOptionPane.showMessageDialog(this,"Ingrese solo numeros enteros menores a 10 y mayores a 1");
     }
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        // TODO add your handling code here:
    int n= Integer.parseInt(txtIncognitas.getText());
    matriz = new float [n][n+1];
    if(tblGauss.isEditing()){
        tblGauss.getCellEditor().stopCellEditing();
    }
    try{
        for(int i=0; i<n;i++){
        for( int j=0;j<n+1;j++){
            if("".equals(tblGauss.getValueAt(i, j))) {
                        throw new Exception("");
                        }
            float value = tblGauss.getValueAt(i,j) != null ? Float.parseFloat(tblGauss.getValueAt(i,j).toString()) : 0;
            matriz [i][j]= value;
        }
    }
    resolver(n);
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "El valor ingresado no es valido");
    }
    
    
    
    }//GEN-LAST:event_btnResolverActionPerformed

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
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gauss().setVisible(true);
            }
        });
    }
    
    public void resolver(int n) {
        int i, j, k = 0, c; 
        for (i = 0; i < n; i++) { 
//            if (matriz[i][i] == 0){ 
//                c = 1; 
//                while (matriz[i + c][i] == 0 && (i + c) < n)  
//                    c++;          
//                if ((i + c) == n)  { 
//                    break; 
//                } 
//                for (j = i, k = 0; k <= n; k++){ 
//                    float temp =matriz[j][k]; 
//                    matriz[j][k] = matriz[j+c][k]; 
//                    matriz[j+c][k] = temp; 
//                } 
//            } 
  
            for (j = 0; j < n; j++){ 
                if (i != j){ 
                    float p = matriz[j][i] / matriz[i][i]; 
                for (k = 0; k <= n; k++)                  
                    matriz[j][k] = matriz[j][k] - (matriz[i][k]) * p;              
                } 
            } 
        }
        
        showMatrix();
        
    }
    
    private void showMatrix(){
        String results = "";
        for (int i = 0; i < tblGauss.getRowCount(); i++ ){
            float id = matriz[i][i];
            for (int j = 0; j < tblGauss.getColumnCount(); j++){
                if(j == tblGauss.getColumnCount() - 1){
                    float val = matriz[i][j] / id;
                    results += "X" + (i+1) + ": ";
                    String formattedStr = String.format("%.2g", val);
                    results += formattedStr;
                }
            }
            results += "\n";
        }
        txtaResultados.setText(results);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGauss;
    private javax.swing.JTextField txtIncognitas;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextArea txtaResultados;
    // End of variables declaration//GEN-END:variables

   
}
