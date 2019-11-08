/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Controle.ControleAgenda;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Adryann
 */
public class TelaAgendamento extends javax.swing.JFrame {
    private final ControleAgenda controle;
    /**
     * Creates new form TelaAgendamento
     */
    public TelaAgendamento() {
        initComponents();
        controle = new ControleAgenda(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AIdC = new javax.swing.JLabel();
        Cadeçalho = new javax.swing.JLabel();
        AClienteC = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxservico = new javax.swing.JComboBox<>();
        AId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AValor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AData = new javax.swing.JTextField();
        AValorC = new javax.swing.JLabel();
        AServiçoC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AObservações = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabeladeAgendamentos = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AIdC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AIdC.setText("Id:");
        getContentPane().add(AIdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, 20));

        Cadeçalho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cadeçalho.setText("Agendamentos");
        getContentPane().add(Cadeçalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, 30));

        AClienteC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AClienteC.setText("Cliente:");
        getContentPane().add(AClienteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 170, -1));

        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, -1));

        jComboBoxservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxservicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxservico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, -1));
        getContentPane().add(AId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 50, 20));
        getContentPane().add(AValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Observações:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 120, -1));
        getContentPane().add(AData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 110, -1));

        AValorC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AValorC.setText("Valor R$:");
        getContentPane().add(AValorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        AServiçoC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AServiçoC.setText("Serviço:");
        getContentPane().add(AServiçoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 20));

        AObservações.setColumns(20);
        AObservações.setRows(5);
        jScrollPane1.setViewportView(AObservações);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 300, 120));

        TabeladeAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Observações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabeladeAgendamentos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 630, 170));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 660, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Voltar para o menu principal(tela principal)
        TelaPrincipal t = new TelaPrincipal();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxservicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxservicoActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AClienteC;
    private javax.swing.JTextField AData;
    private javax.swing.JTextField AId;
    private javax.swing.JLabel AIdC;
    private javax.swing.JTextArea AObservações;
    private javax.swing.JLabel AServiçoC;
    private javax.swing.JTextField AValor;
    private javax.swing.JLabel AValorC;
    private javax.swing.JLabel Cadeçalho;
    private javax.swing.JLabel Fundo;
    private javax.swing.JTable TabeladeAgendamentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxservico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    //chamar a tabela atravez do controlador
    private void iniciar() {
     this.controle.atualizaTabela();
     this.controle.atualizaClientes();
     this.controle.atualizaServiços();
    }

    public JTable getTabeladeAgendamentos() {
        return TabeladeAgendamentos;
    }

    public void setTabeladeAgendamentos(JTable TabeladeAgendamentos) {
        this.TabeladeAgendamentos = TabeladeAgendamentos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxservico() {
        return jComboBoxservico;
    }

    public void setjComboBoxservico(JComboBox<String> jComboBoxservico) {
        this.jComboBoxservico = jComboBoxservico;
    }
    
}
