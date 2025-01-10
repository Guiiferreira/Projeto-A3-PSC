
package padaria;

import javax.swing.JOptionPane;


public class Funcionarios extends javax.swing.JFrame {

  
    public Funcionarios() {
        initComponents();
        this.setTitle("Lista de Funcionarios");
        this.refreshTable();
    }
    public void refreshTable(){
         DB db = new DB("padaria.db");
        db.query("SELECT * FROM funcionarios");
        String cols[] = { "ID", "NOME", "CPF", "RUA"};
        String fields[] = { "id", "Nome", "CPF", "Rua" };        
        TableRender.render(Table, cols, fields, db);
        db.closeConnection();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 380, 280));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/sair.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/desfazer.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/excluir.png"))); // NOI18N
        jButton3.setText("Apagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/cadastro.png"))); // NOI18N
        jButton4.setText("Novo Funcionario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/editar.png"))); // NOI18N
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/pesquisar-alt.png"))); // NOI18N
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));
        getContentPane().add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/d2026981db6a74698ae433a660753d56.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 450, 480));

        setSize(new java.awt.Dimension(442, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int linha = Table.getSelectedRow();
        String controle;
        String id = (String) Table.getValueAt(linha, 0);
        
        
        if(linha == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada. Selecione uma linha!");
            return;
        }
        controle = JOptionPane.showInputDialog("Tem certeza que deseja apagar?  " + "Sim "+ "ou "+ "Nâo ");
        char controleCHAR = controle.charAt(0);
   switch(controleCHAR){
       case 's':
            JOptionPane.showMessageDialog(null,"Apagado com sucesso");
             DB db = new DB("padaria.db");
             String query = "DELETE FROM funcionarios WHERE id ="+id;
             db.execQuery(query);
           refreshTable();  
                break;
            case 'n':
           JOptionPane.showMessageDialog(null,"Execução cancelada" );
           break;   
   }
       
                               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int linha = Table.getSelectedRow();
      // System.out.println("Linha selecionada: "+linha);
        if(linha == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada. Selecione uma linha!");
            return;
        }
        String id = (String) Table.getValueAt(linha, 0);
        System.out.println("id :"+id);
        FunCad cadastro = new FunCad(this, Integer.parseInt(id));
        cadastro.setVisible(true);  
         this.dispose();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       FunCad cad = new FunCad(this,-1);
        cad.setVisible(true);
            this.dispose();   
             
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      String nomeBuscar = txtBusca.getText();
        DB db = new DB("padaria.db");
        db.query("SELECT * FROM funcionarios WHERE Nome LIKE '%" + nomeBuscar + "%'");
        String cols[] = { "ID", "NOME", "CPF", "RUA" };
        String fields[] = { "id", "Nome", "CPF", "Rua" };        
        TableRender.render(Table, cols, fields, db);
        db.closeConnection(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
