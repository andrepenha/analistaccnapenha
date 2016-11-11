
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
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
    
    public FoodHealth() {
        initComponents();
        
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
        JmRletorios = new javax.swing.JMenu();
        JmVendas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JmPedidos = new javax.swing.JMenu();
        JmEstoque = new javax.swing.JMenu();
        JmFornecedores = new javax.swing.JMenu();
        JmAjuda = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmFoodHealth"); // NOI18N
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bem-vindo Food&Health");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 400);

        JmArquivo.setText("Arquivo");
        jMenuBar1.add(JmArquivo);

        JmRletorios.setText("Clientes");
        jMenuBar1.add(JmRletorios);

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
        jMenuBar1.add(JmPedidos);

        JmEstoque.setLabel("Estoque");
        jMenuBar1.add(JmEstoque);

        JmFornecedores.setLabel("Fornecedores");
        jMenuBar1.add(JmFornecedores);

        JmAjuda.setText("Ajuda");
        jMenuBar1.add(JmAjuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmVendasMouseClicked
        
      /* ThreadJanela threadJanela = new ThreadJanela("vendas");        
        threadJanela.run();  */     
        
    }//GEN-LAST:event_JmVendasMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jPanel1.add(this.venda);
        this.jLabel1.setText("");
        venda.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JmVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmVendasActionPerformed
        
    }//GEN-LAST:event_JmVendasActionPerformed

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
    private javax.swing.JMenu JmAjuda;
    private javax.swing.JMenu JmArquivo;
    private javax.swing.JMenu JmEstoque;
    private javax.swing.JMenu JmFornecedores;
    private javax.swing.JMenu JmPedidos;
    private javax.swing.JMenu JmRletorios;
    private javax.swing.JMenu JmVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}


