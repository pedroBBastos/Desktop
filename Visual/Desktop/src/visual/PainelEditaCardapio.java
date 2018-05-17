/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;


import model.Funcionario;
/**
 *
 * @author ra204481
 */
public class PainelEditaCardapio extends javax.swing.JPanel {
    
    private TelaPrincipal telaPrincipal;
    private Funcionario funcionarioLogado;
    private PainelCardapio painel;

    /**
     * Creates new form PainelEditaCardapio
     */
    public PainelEditaCardapio(TelaPrincipal telaPrincipal, Funcionario funcionario, PainelCardapio painel) {
        this.telaPrincipal = telaPrincipal;
        initComponents();
        funcionarioLogado = funcionario;
        this.painel = painel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        button_novo = new javax.swing.JButton();
        button_alterar = new javax.swing.JButton();
        button_excluir = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        panel_produto = new javax.swing.JPanel();
        label_ingredientes = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        textBox_nome = new javax.swing.JTextField();
        label_tipo = new javax.swing.JLabel();
        formattedTextBox_tipo = new javax.swing.JTextField();
        rdButton_pizza = new javax.swing.JRadioButton();
        rdButton_bebida = new javax.swing.JRadioButton();
        label_tipoItem = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        textBox_id = new javax.swing.JTextField();
        label_preco = new javax.swing.JLabel();
        button_executar = new javax.swing.JButton();
        button_cancelar = new javax.swing.JButton();
        formattedTextBox_preco = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textBox_ingredientes = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        label_resultado = new javax.swing.JLabel();

        button_novo.setText("Novo");
        button_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_novoActionPerformed(evt);
            }
        });

        button_alterar.setText("Alterar");
        button_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_alterarActionPerformed(evt);
            }
        });

        button_excluir.setText("Excluir");

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_titulo.setText("Edição do Cardapio");

        panel_produto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        label_ingredientes.setText("Ingredientes:");

        label_nome.setText("Nome:");

        textBox_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBox_nomeActionPerformed(evt);
            }
        });

        label_tipo.setText("Tipo:");

        rdButton_pizza.setText("Pizza");
        rdButton_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButton_pizzaActionPerformed(evt);
            }
        });

        rdButton_bebida.setText("Bebida");
        rdButton_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButton_bebidaActionPerformed(evt);
            }
        });

        label_tipoItem.setText("Tipo do item:");

        label_id.setText("ID:");

        textBox_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBox_idActionPerformed(evt);
            }
        });

        label_preco.setText("Preço:");

        button_executar.setText("Salvar");

        button_cancelar.setText("Cancelar");
        button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelarActionPerformed(evt);
            }
        });

        try {
            formattedTextBox_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        textBox_ingredientes.setColumns(20);
        textBox_ingredientes.setRows(4);
        jScrollPane1.setViewportView(textBox_ingredientes);

        javax.swing.GroupLayout panel_produtoLayout = new javax.swing.GroupLayout(panel_produto);
        panel_produto.setLayout(panel_produtoLayout);
        panel_produtoLayout.setHorizontalGroup(
            panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_produtoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(button_executar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_cancelar)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_produtoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_ingredientes)
                    .addComponent(label_preco)
                    .addComponent(label_tipoItem)
                    .addComponent(label_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textBox_nome)
                    .addGroup(panel_produtoLayout.createSequentialGroup()
                        .addComponent(rdButton_pizza)
                        .addGap(10, 10, 10)
                        .addComponent(rdButton_bebida)
                        .addGap(12, 12, 12)
                        .addComponent(label_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBox_id))
                    .addGroup(panel_produtoLayout.createSequentialGroup()
                        .addComponent(formattedTextBox_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formattedTextBox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        panel_produtoLayout.setVerticalGroup(
            panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_produtoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(textBox_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipoItem)
                    .addComponent(rdButton_pizza)
                    .addComponent(rdButton_bebida)
                    .addComponent(label_id)
                    .addComponent(textBox_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_preco)
                    .addComponent(label_tipo)
                    .addComponent(formattedTextBox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formattedTextBox_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ingredientes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_executar)
                    .addComponent(button_cancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        label_resultado.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultado)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_alterar)
                            .addComponent(button_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_titulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(button_novo)
                        .addGap(45, 45, 45)
                        .addComponent(button_alterar)
                        .addGap(50, 50, 50)
                        .addComponent(button_excluir))
                    .addComponent(panel_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_novoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_novoActionPerformed

    private void button_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_alterarActionPerformed

    private void rdButton_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButton_pizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButton_pizzaActionPerformed

    private void rdButton_bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButton_bebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButton_bebidaActionPerformed

    private void textBox_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBox_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBox_nomeActionPerformed

    private void button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_cancelarActionPerformed

    private void textBox_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBox_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBox_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_alterar;
    private javax.swing.JButton button_cancelar;
    private javax.swing.JButton button_excluir;
    private javax.swing.JButton button_executar;
    private javax.swing.JButton button_novo;
    private javax.swing.JFormattedTextField formattedTextBox_preco;
    private javax.swing.JTextField formattedTextBox_tipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_ingredientes;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_preco;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JLabel label_tipo;
    private javax.swing.JLabel label_tipoItem;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_produto;
    private javax.swing.JRadioButton rdButton_bebida;
    private javax.swing.JRadioButton rdButton_pizza;
    private javax.swing.JTextField textBox_id;
    private javax.swing.JTextArea textBox_ingredientes;
    private javax.swing.JTextField textBox_nome;
    // End of variables declaration//GEN-END:variables
}
