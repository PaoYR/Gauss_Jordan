package Codigo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Suma extends javax.swing.JFrame {

    public Suma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInfo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        txtTitulo4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatriz2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatriz3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInfo.setFont(new java.awt.Font("Schadow BT", 0, 14)); // NOI18N
        txtInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInfo.setText("Ingresa el No. de filas y de columnas ");
        txtInfo.setAlignmentX(0.5F);
        txtInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 240, 40));

        btnMenu.setBackground(new java.awt.Color(255, 150, 101));
        btnMenu.setText("Volver al menú ");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, -1, -1));

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 460, 200));

        btnGenerar.setText("Aceptar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 140, 50));

        txtTitulo4.setFont(new java.awt.Font("Schadow BT", 0, 36)); // NOI18N
        txtTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo4.setText("Suma");
        txtTitulo4.setAlignmentX(0.5F);
        txtTitulo4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 269, 40));

        tblMatriz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMatriz2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 460, 200));

        tblMatriz3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatriz3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 450, 200));

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 330, 450));

        btnCalcular.setText("CALCULAR");
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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 850, 450));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("*Recuerda que debes de dar enter después de ingresar un valor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 330, 200));

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 850, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        //Regreso al Frame menu 
        Menu menu= new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        int n=0;
        try{
            n= Integer.parseInt(txtNumero.getText());
           if(n>10){//La matriz solo puede tener una dimension de 10x10
             JOptionPane.showMessageDialog(rootPane, "El número ingresado excede la capacidad de la tabla");
             Menu m= new Menu();
             m.setVisible(true);
             this.setVisible(false);}
           else{
                float [][] matriz= new float[10][10];//creo una matriz temporal
                matriz= this.GenerarMatriz1(matriz, n);//Genero la matriz
                this.GenerarMatriz1(matriz, n);//muestro la matriz
                float [][] matriz2= new float[10][10];//creo una matriz temporal
                matriz2= this.GenerarMatriz2(matriz2, n);//Genero la matriz
                this.GenerarMatriz2(matriz2, n);//muestro la matriz
                float [][] matriz3= new float[10][10];//creo una matriz temporal
                matriz3= this.GenerarMatriz3(matriz3, n);//Genero la matriz
                this.GenerarMatriz3(matriz3,n);//muestro la matriz
           }
        }catch(Exception e){
            //Para evitar las letras 
            JOptionPane.showMessageDialog(rootPane, "Solo ingrese números");    
        }           
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
       //Así obtengo los datos de las  tablas
        TableModel tableModel = tblMatriz.getModel();
        TableModel model2= tblMatriz2.getModel();
        int n= Integer.parseInt(txtNumero.getText());
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){   
                    float a,b,suma;
                    a= Float.parseFloat(tableModel.getValueAt(i,j).toString());//hago el casting de string a float para manipular los datos
                    b= Float.parseFloat(model2.getValueAt(i,j).toString());
                    suma= a+b;
                    tblMatriz3.setValueAt(suma, i,j);//Los muestro en la tabla 3 
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Si desea calcular otra matriz debe de volver a introducir\nlas dimensiones de dicha matriz");
    }//GEN-LAST:event_btnCalcularMouseClicked

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
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suma().setVisible(true);
            }
        });
    }
    public float[][] GenerarMatriz1(float matriz[][], int n){
    DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();//Creo el objeto
    model.setRowCount(n); //Adato las filas 
    model.setColumnCount(n);//Adato las columnas
    for(int filas=0;filas<n;filas++){
        for(int columnas=0;columnas<n;columnas++){
            tblMatriz.setValueAt(matriz[filas][columnas], filas, columnas);//creo los espacios necesarios
            
        }
    }
    return matriz;
}
    public float[][] GenerarMatriz2(float matriz[][], int n){
    DefaultTableModel model2 = (DefaultTableModel) tblMatriz2.getModel();//Creo el objeto
    model2.setColumnCount(n);//Adato las columnas
    model2.setRowCount(n);//Adato las filas
    for(int filas=0;filas<n;filas++){
        for(int columnas=0;columnas<n;columnas++){
            tblMatriz2.setValueAt(matriz[filas][columnas], filas, columnas);//creo los espacios necesarios
        }
    }
    return matriz;
}
    public float[][] GenerarMatriz3(float matriz3[][], int n){
    DefaultTableModel model3 = (DefaultTableModel) tblMatriz3.getModel();//Creo el objeto
    model3.setColumnCount(n);//Adato las columnas
    model3.setRowCount(n);//Adato las filas
    for(int filas=0;filas<n;filas++){
        for(int columnas=0;columnas<n;columnas++){
            tblMatriz3.setValueAt(matriz3[filas][columnas], filas, columnas);//creo los espacios necesarios
        }
    }    
    return matriz3;
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblMatriz2;
    private javax.swing.JTable tblMatriz3;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JLabel txtTitulo4;
    // End of variables declaration//GEN-END:variables
}