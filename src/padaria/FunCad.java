
package padaria;

import javax.swing.JOptionPane;


public class FunCad extends javax.swing.JFrame {

    
    private   Funcionarios janelaFuncionarios;
    public  int id;
    
    public FunCad(Funcionarios janelaFuncionarios, int id){
        initComponents();
        this.janelaFuncionarios = janelaFuncionarios;
        this.id = id;
          if(id != -1) {
          this.setTitle("Editar Funcionario");
            DB db = new DB("padaria.db");
            db.query("SELECT * FROM funcionarios WHERE id ="+id);
            if(db.next()) {
                String nome = db.getString("Nome");
                String celular = db.getString("CPF");
                String rua = db.getString("Rua");
                textNome.setText(nome);
                textCPF.setText(celular);
                textRua.setText(rua);
            }
            db.closeConnection(); 
             this.dispose();
            
        } else {
            this.setTitle("Novo Funcionario");
            this.dispose();
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textCPF = new javax.swing.JTextField();
        textRua = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/sair.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/desfazer.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Nome :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("CPF :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setText("Rua :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, -1));

        textCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCPFActionPerformed(evt);
            }
        });
        getContentPane().add(textCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));
        getContentPane().add(textRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/excluir.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/salvar.png"))); // NOI18N
        jButton4.setText("Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        setSize(new java.awt.Dimension(429, 392));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCPFActionPerformed
       
    }//GEN-LAST:event_textCPFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Funcionarios fun = new Funcionarios();
    fun.setVisible(true); 
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Funcionarios fun = new Funcionarios();
    fun.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (this.textCPF.getText().length() < 8)
        {
            JOptionPane.showMessageDialog(null,"O CPF precisa conter mais de 8 " +
                "caracteres no mínimo");
            
        }
        else if (this.textCPF.getText().length() > 11)
        {
            JOptionPane.showMessageDialog(null,"O CPF não pode conter mais " +
                "que 10 caracteres");
            
        }
        else
        {
     
       
        String nome = textNome.getText();
        String cpf = textCPF.getText();
        String rua = textRua.getText();
        DB db = new DB("padaria.db");
         String query = "";
          if(id == -1){
        
        query = "INSERT INTO funcionarios (Nome, CPF, Rua) ";
        query = query + "VALUES (";
        query = query + "'" + nome + "',";
        query = query + "'" + cpf + "',";
        query = query + "'" + rua + "'";
        query = query + ");";
       
          }else{
             query = "UPDATE funcionarios SET ";
            query = query + "Nome='" + nome + "', ";
            query = query + "CPF='" + cpf + "', ";
            query = query + "Rua='" + rua + "'";
            query = query + " WHERE id="+this.id; 
                }
          db.execQuery(query);
           
      

        janelaFuncionarios.refreshTable();
         JOptionPane.showMessageDialog(null,"Produto Cadastrado com sucesso ");
       Funcionarios fun = new Funcionarios();
      fun.setVisible(true);
         
        this.dispose();
    
    }//GEN-LAST:event_jButton4ActionPerformed

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textRua;
    // End of variables declaration//GEN-END:variables
}
