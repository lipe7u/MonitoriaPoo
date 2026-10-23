
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClienteVip cliente = new ClienteVip(
                "C01", "João", "60000-000", 10.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto teclado = new ProdutoFisico(
                "F01", "Teclado", 100.0, 5, 0.8);

        Produto ebook = new ProdutoDigital(
                "D01", "E-book Java", 50.0, 999, 12);

        Produto streaming = new Assinatura(
                "S01", "Streaming", 20.0, 999, 6);

        carrinho.adicionar(teclado);
        carrinho.adicionar(ebook);
        carrinho.adicionar(streaming);

        Pedido pedido = new Pedido(cliente, carrinho);

        // Primeira tentativa: Pix
        System.out.println("=== Pagamento via Pix ===");
        pedido.finalizar(new PagamentoPix());

        // Segunda tentativa: cartão em 6 parcelas,
        // com limite baixo para forçar a recusa.
        System.out.println("=== Pagamento via cartão ===");
        pedido.finalizar(new PagamentoCartao(1.0, 6));
    }
}
