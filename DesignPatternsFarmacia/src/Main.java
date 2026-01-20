
import facade.PedidoFacade;
import model.Produto;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Paracetamol", 10.0);
        Produto p2 = new Produto("Vitamina C", 20.0);

        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.adicionarProduto(p1, 2);
        pedidoFacade.adicionarProduto(p2, 1);

        PagamentoStrategy pagamento = new PagamentoPix();
        pedidoFacade.finalizarPedido(pagamento);
    }
}
