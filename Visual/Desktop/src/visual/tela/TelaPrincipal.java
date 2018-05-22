/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package visual.tela;

import visual.painel.PainelCliente;
import visual.painel.PainelProdutos;
import visual.painel.PainelPedidos;
import visual.painel.PainelCardapio;
import visual.painel.PainelEditaCardapio;
import visual.painel.PainelEntregas;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.funcionario.Administrador;
import model.cliente.Cliente;
import model.entrega.Entrega;
import model.funcionario.Funcionario;
import model.pedido.Pedido;
import model.produto.Produto;
import model.cardapio.Cardapio;

/**
 *
 * @author pedro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Funcionario funcionarioSessaoAtual;

    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Entrega> entregas;
    private ArrayList<Cliente> clientes;
    private Cardapio cardapio;

    private JComponent painelCardapio;
    private JComponent painelPedidos;
    private JComponent painelProdutos;
    private JComponent painelEntregas;
    private JComponent painelClientes;
    private JComponent painelEditaCardapio;

    /**
     * Creates new form TelaAdministrador
     */
    public TelaPrincipal(Funcionario funcionario) {

        initComponents();
        
        this.produtos = new ArrayList<>();
        this.pedidos  = new ArrayList<>();
        this.entregas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cardapio = new Cardapio(new Produto("Pizza" ,(float) 33.3, 1), new Produto("coca", (float) 66.6, 2), new Produto("coxinha", (float) 99.9, 3));

        this.funcionarioSessaoAtual = funcionario;        

        this.painelCardapio = new PainelCardapio(this.cardapio, this);
        this.painelPedidos = new PainelPedidos(this);
        this.painelProdutos = new PainelProdutos(this);
        this.painelEntregas = new PainelEntregas(this);
        this.painelClientes = new PainelCliente(this);
        this.painelEditaCardapio = new PainelEditaCardapio(this, funcionario, (PainelCardapio) painelCardapio);

        this.tabbedPane.addTab("Cardapio", painelCardapio);
        //se o funcionario for administrador, habilitamos a tab para editar cardapio
        if(this.funcionarioSessaoAtual instanceof Administrador)
            this.tabbedPane.addTab("Editar cardapio", painelEditaCardapio);
        this.tabbedPane.addTab("Pedidos", painelPedidos);
        this.tabbedPane.addTab("Produtos", painelProdutos);
        this.tabbedPane.addTab("Entregas", painelEntregas);
        this.tabbedPane.addTab("Clientes", painelClientes);
        
        this.tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                JTabbedPane mytabbedPane = (JTabbedPane) e.getSource();
                switch(mytabbedPane.getSelectedIndex()) {
                    case 0: ((PainelCardapio) painelCardapio).refresh(); break;
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                }
            }
        });
    }

    /*
    Metodos abaixo para serem chamados pelos paines para atualizar
    registros gerais para todas as abas poderem conversar entre si
    */

    public void adicionarProdutoNaLista(Produto produto) {
        this.produtos.add(produto);
        this.cardapio.adicionarAoCardapio(produto);
    }

    public void adicionarPedidoNaLista(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void adicionarEntregaNaLista(Entrega entrega) {
        this.entregas.add(entrega);
    }

    public void adicionarClienteNaLista(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerProdutoDaLista(int indice) {
        this.produtos.remove(indice);
    }

    public void removerPedidoDaLista(int indice) {
        this.pedidos.remove(indice);
    }

    public void removerEntregaDaLista(int indice) {
        this.entregas.remove(indice);
    }

    public void removerClienteDaLista(int indice) {
        this.clientes.remove(indice);
    }
    
    public Cardapio getCardapio() {
        return this.cardapio;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
//
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
//
    public ArrayList<Entrega> getEntregas() {
       return entregas;
    }
//
//    public ArrayList<Cliente> getClientes() {
//        return clientes;
//    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
