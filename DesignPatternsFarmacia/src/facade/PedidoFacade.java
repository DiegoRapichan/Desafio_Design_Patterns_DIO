
package facade;

import model.Pedido;
import model.Produto;
import singleton.BancoDados;
import strategy.PagamentoStrategy;

public class PedidoFacade {
    private Pedido pedido;

    public PedidoFacade() { pedido = new Pedido(); }

    public void adicionarProduto(Produto produto, int quantidade) {
        pedido.adicionarProduto(produto, quantidade);
    }

    public void finalizarPedido(PagamentoStrategy pagamento) {
        double valorTotal = pedido.calcularTotal();
        pagamento.pagar(valorTotal);
        BancoDados.getInstancia().adicionarPedido(pedido);
        System.out.println("Pedido finalizado com sucesso!");
    }
}
