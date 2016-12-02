
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * .
 * Projeto Food&Health
 * Versão 1.0
 * 21-Out-2016
 */
/**
 *
 * @author 740600935
 */
public class FoodHealth extends javax.swing.JFrame  {    
    
    Jfvenda venda = new Jfvenda();
    JfPedidos pedidos = new JfPedidos();
    JfCadCliente cadClientes = new JfCadCliente();
    JfCadFornecedor cadFornecedor = new JfCadFornecedor();
    JfConsultaCliente consultCliente = new JfConsultaCliente();
    Telentrega entrega = new Telentrega();
    jfSobre sobre = new jfSobre();
    
    public FoodHealth() {
        
        initComponents();
        
        URL url = getClass().getResource("Logotipo Food&healf.jpg");
        ImageIcon imgicon = new ImageIcon(url);
        super.setIconImage(imgicon.getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmArquivo = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        JmClientes = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        ConsultaCliente = new javax.swing.JMenuItem();
        JmVendas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JmPedidos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        JmEstoque = new javax.swing.JMenu();
        JmFornecedores = new javax.swing.JMenu();
        CadastroFornecedor = new javax.swing.JMenuItem();
        JmAjuda = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 480));
        setName("frmFoodHealth"); // NOI18N
        setPreferredSize(new java.awt.Dimension(770, 530));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(760, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(515, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logotipo Food&healf.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 480);

        JmArquivo.setText("Arquivo");

        jMenuItem6.setText("Sair");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        JmArquivo.add(jMenuItem6);

        jMenuBar1.add(JmArquivo);

        JmClientes.setText("Clientes");

        CadCliente.setText("Cadastro");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        JmClientes.add(CadCliente);

        ConsultaCliente.setText("Consulta");
        ConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteActionPerformed(evt);
            }
        });
        JmClientes.add(ConsultaCliente);

        jMenuBar1.add(JmClientes);

        JmVendas.setLabel("Vendas");
        JmVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmVendasMouseClicked(evt);
            }
        });
        JmVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmVendasActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Realizar Venda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JmVendas.add(jMenuItem2);

        jMenuBar1.add(JmVendas);

        JmPedidos.setLabel("Pedidos");

        jMenuItem3.setText("Pedidos Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        JmPedidos.add(jMenuItem3);

        jMenuItem4.setText("Tele-Entrega");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        JmPedidos.add(jMenuItem4);

        jMenuBar1.add(JmPedidos);

        JmEstoque.setLabel("Estoque");
        jMenuBar1.add(JmEstoque);

        JmFornecedores.setLabel("Fornecedores");

        CadastroFornecedor.setText("Cadastro");
        CadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFornecedorActionPerformed(evt);
            }
        });
        JmFornecedores.add(CadastroFornecedor);

        jMenuBar1.add(JmFornecedores);

        JmAjuda.setText("Ajuda");

        jMenuItem5.setText("Sobre");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        JmAjuda.add(jMenuItem5);

        jMenuBar1.add(JmAjuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmVendasMouseClicked
        
      /* ThreadJanela threadJanela = new ThreadJanela("vendas");        
        threadJanela.run();  */     
        
    }//GEN-LAST:event_JmVendasMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.venda);
        this.jLabel1.setVisible(false);
        venda.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JmVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmVendasActionPerformed
        
    }//GEN-LAST:event_JmVendasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.pedidos);
        this.jLabel1.setVisible(false);
        pedidos.setVisible(true);// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.cadClientes);
        this.jLabel1.setVisible(false);
        this.cadClientes.setVisible(true);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void CadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFornecedorActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.cadFornecedor);
        this.jLabel1.setVisible(false);
        this.cadFornecedor.setVisible(true);
    }//GEN-LAST:event_CadastroFornecedorActionPerformed

    private void ConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.consultCliente);
        this.jLabel1.setVisible(false);
        this.consultCliente.setVisible(true);
    }//GEN-LAST:event_ConsultaClienteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.entrega);
        this.jLabel1.setVisible(false);
        this.entrega.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.jPanel1.removeAll();
        this.jPanel1.add(this.sobre);
        this.jLabel1.setVisible(false);
        this.sobre.setVisible(true);
        this.sobre.setLocation((this.getSize().width  - sobre.getSize().width) / 2, (this.getSize().height - sobre.getSize().height) / 2);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
        
        final FoodHealth foodHealth = new FoodHealth();         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                foodHealth.setVisible(true);
                foodHealth.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadastroFornecedor;
    private javax.swing.JMenuItem ConsultaCliente;
    private javax.swing.JMenu JmAjuda;
    private javax.swing.JMenu JmArquivo;
    private javax.swing.JMenu JmClientes;
    private javax.swing.JMenu JmEstoque;
    private javax.swing.JMenu JmFornecedores;
    private javax.swing.JMenu JmPedidos;
    private javax.swing.JMenu JmVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}


