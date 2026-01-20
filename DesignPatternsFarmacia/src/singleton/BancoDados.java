
package singleton;

import java.util.ArrayList;
import java.util.List;
import model.Pedido;

public class BancoDados {
    private static BancoDados instancia;
    private List<Pedido> pedidos;

    private BancoDados() { pedidos = new ArrayList<>(); }

    public static BancoDados getInstancia() {
        if (instancia == null) { instancia = new BancoDados(); }
        return instancia;
    }

    public void adicionarPedido(Pedido pedido) { pedidos.add(pedido); }
    public List<Pedido> getPedidos() { return pedidos; }
}
