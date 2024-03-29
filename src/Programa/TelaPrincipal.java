package Programa;

import Controle.ControleTelaPrincipal;

/**
 *
 * @author Adryann
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final ControleTelaPrincipal controle;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
     this.controle = new ControleTelaPrincipal(this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuAgendamento = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItemCadastro = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItemFuncionarios = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemVoltar = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemSair = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verde.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-130, -60, 714, 547);

        jMenu4.setText("Agendamentos");

        jMenuAgendamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuAgendamento.setText("Fazer Agendamento");
        jMenuAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendamentoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAgendamento);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Clientes");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItemCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItemCadastro.setSelected(true);
        jRadioButtonMenuItemCadastro.setText("Cadastrar Clientes");
        jRadioButtonMenuItemCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemCadastroActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItemCadastro);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Mais+");

        jRadioButtonMenuItemFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItemFuncionarios.setSelected(true);
        jRadioButtonMenuItemFuncionarios.setText("Funcionários");
        jRadioButtonMenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemFuncionariosActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItemFuncionarios);

        jRadioButtonMenuItemVoltar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItemVoltar.setSelected(true);
        jRadioButtonMenuItemVoltar.setText("Voltar");
        jRadioButtonMenuItemVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemVoltarActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItemVoltar);

        jRadioButtonMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItemSair.setSelected(true);
        jRadioButtonMenuItemSair.setText("Sair");
        jRadioButtonMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemSairActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItemSair);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(516, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemSairActionPerformed
        // Sair do programa
        System.exit(0);
    }//GEN-LAST:event_jRadioButtonMenuItemSairActionPerformed

    private void jRadioButtonMenuItemVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemVoltarActionPerformed
        // Voltar para tela de login
        TelaLogin t = new TelaLogin();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItemVoltarActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
  
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jRadioButtonMenuItemCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemCadastroActionPerformed
        // Ir para tela de Cadastro de Clientes
       this.controle.irParaCadastroCliente();
    }//GEN-LAST:event_jRadioButtonMenuItemCadastroActionPerformed

    private void jRadioButtonMenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemFuncionariosActionPerformed
        //Tela funcionarios
       this.controle.irParaFuncionarios();
    }//GEN-LAST:event_jRadioButtonMenuItemFuncionariosActionPerformed

    private void jMenuAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendamentoActionPerformed
        //Ir para o agendamento
        this.controle.irParaAgendamento();
    }//GEN-LAST:event_jMenuAgendamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAgendamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemCadastro;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemFuncionarios;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemSair;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemVoltar;
    // End of variables declaration//GEN-END:variables
}
