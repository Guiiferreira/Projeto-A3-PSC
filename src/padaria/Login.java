
package padaria;

import javax.swing.JOptionPane;

//import org.sqlite.SQLiteException;

public class Login extends javax.swing.JFrame {
   
       

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Padaria-Sextou");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("USUARIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 20));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SENHA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 20));

        TxtSenha.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/entrar.png"))); // NOI18N
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 140, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/sair.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/cadastro.png"))); // NOI18N
        jButton3.setText("CADASTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, 30));

        jLabel6.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Login");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 170, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/d2026981db6a74698ae433a660753d56.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        setSize(new java.awt.Dimension(449, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         String user = txtUsuario.getText().trim();
//        String senha = String.valueOf(TxtSenha.getPassword());
//        
//            DB db = new DB("padaria.db");
//            
//            String sql = "SELECT padaria, senha FROM usuarios WHERE usuario = '" + txtUsuario.getText() + "' AND senha = '" + TxtSenha.getText() + "'";
//
//          db.query(sql);
//           if(db.next())
          
     String usuario = txtUsuario.getText();
        String senha = String.valueOf(TxtSenha.getPassword());
        DB db = new DB("padaria.db");
        db.query("SELECT * FROM usuario WHERE usuario='"+ usuario +"'"); 
        if(db.next()) {
            String senhaBanco = db.getString("senha");
            if(senhaBanco.equals(senha)) {
               JOptionPane.showMessageDialog(null,"BEM-VINDO "+usuario);
               db.closeConnection();
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto");
        }
//       
//        DB db = new DB("padaria.db");
//        db.query("SELECT * FROM usuario"); 
//        if(TxtUsuario.getText().equals("sextou") && new String( TxtSenha.getPassword()).equals("123")){
//      JOptionPane.showMessageDialog(null,"BEM-VINDO ");
//      Inicio inicio = new Inicio();
//      inicio.setVisible(true);
//      this.dispose();
//    
//           }else {
//    JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto");
//   
//    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 CadUsuario cadaUsuario = new CadUsuario();
        cadaUsuario.setVisible(true);     
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
