/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package visual;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Cliente;
import model.Entrega;
import model.Funcionario;
import model.Pedido;
import model.Produto;

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
    
    private JComponent painelCardapio;
    private JComponent painelPedidos;
    private JComponent painelProdutos;
    private JComponent painelEntregas;
    private JComponent painelClientes;
    
    /**
     * Creates new form TelaAdministrador
     */
    public TelaPrincipal(Funcionario funcionario) {
        
        initComponents();
        
        this.funcionarioSessaoAtual = funcionario;
        
        this.painelCardapio = new PainelCardapio(null, this.funcionarioSessaoAtual, this);
        this.painelPedidos = new PainelPedidos();
        this.painelProdutos = new PainelProdutos(this);
        this.painelEntregas = new PainelEntregas();
        this.painelClientes = new PainelCliente(this);
        
        this.tabbedPane.addTab("Cardapio", painelCardapio);
        this.tabbedPane.addTab("Pedidos", painelPedidos);
        this.tabbedPane.addTab("Produtos", painelProdutos);
        this.tabbedPane.addTab("Entregas", painelEntregas);
        this.tabbedPane.addTab("Clientes", painelClientes);
        this.tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                JTabbedPane mytabbedPane = (JTabbedPane) e.getSource();
                switch(mytabbedPane.getSelectedIndex()) {
                    case 0: break;
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                }
            }
        });
        
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.entregas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    /*
    Metodos abaixo para serem chamados pelos paines para atualizar
    registros gerais para todas as abas poderem conversar entre si
    */
    
    public void adicionarProdutoNaLista(Produto produto) {
        this.produtos.add(produto);
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
    
//    public ArrayList<Produto> getProdutos() {
//        return produtos;
//    }
//    
//    public ArrayList<Pedido> getPedidos() {
//        return pedidos;
//    }
//    
//    public ArrayList<Entrega> getEntregas() {
//        return entregas;
//    }
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
