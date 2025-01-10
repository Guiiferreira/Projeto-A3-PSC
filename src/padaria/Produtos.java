
package padaria;

import javax.swing.JOptionPane;

public class Produtos extends javax.swing.JFrame {

  
    public Produtos() {
        initComponents();
      this.refreshTable();
    }
    public void refreshTable(){
         DB db = new DB("padaria.db");
        db.query("SELECT * FROM padaria");
        String cols[] = { "CODIGO", "PRODUTOS", "QUANTIDADE", "VALIDADE"};
        String fields[] = { "codigo", "produtos", "quantidade", "validade" };        
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
        txtBusca = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 430, 250));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/sair.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/desfazer.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/excluir.png"))); // NOI18N
        jButton3.setText("Apagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/cadastro.png"))); // NOI18N
        jButton4.setText("Novo Produto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/editar.png"))); // NOI18N
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        txtBusca.setBackground(new java.awt.Color(255, 255, 255));
        txtBusca.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 220, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/pesquisar-alt.png"))); // NOI18N
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padaria/IMG/inicio.jpg"))); // NOI18N
        jLabel1.setText("Buscar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        setSize(new java.awt.Dimension(473, 400));
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
        String codigo = (String) Table.getValueAt(linha, 0);
      
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
        String query = "DELETE FROM padaria WHERE codigo ="+codigo;
        db.execQuery(query);
        refreshTable();     
           break;
           case 'n':
           JOptionPane.showMessageDialog(null,"Execução cancelada" );
           break;
   }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         ProdCad cad = new ProdCad(this,-1);
        cad.setVisible(true);
            this.dispose();   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       int linha = Table.getSelectedRow();

        if(linha == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada. Selecione uma linha!");
            return;
        }
        String codigo = (String) Table.getValueAt(linha, 0);
    
        ProdCad cad = new ProdCad(this, Integer.parseInt(codigo));
        cad.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nomeBuscar = txtBusca.getText();
        System.out.println("texto da busca: "+nomeBuscar);
        DB db = new DB("padaria.db");
        db.query("SELECT * FROM padaria WHERE produtos LIKE '%" + nomeBuscar + "%'");
        String cols[] = { "Codigo", "PRODUTOS", "QUANTIDADE", "VALIDADE" };
        String fields[] = { "codigo", "produtos", "quantidade", "validade" };        
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
