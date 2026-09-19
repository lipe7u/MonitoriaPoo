package SimuladoMonitoria01;

import java.util.ArrayList;

public class GestaoPedidos {
    private ArrayList<String> pedidos;

    public GestaoPedidos(){
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedidos(String item){
        pedidos.add(item);
    }

    public String proximoPedido(){
        if(pedidos.isEmpty()){
            return "lista vazia";
        }

        return pedidos.remove(0);
    }

    public int quantidadePendentes(){
        return pedidos.size();
    }


    public void listarPedidos(){
        for(String pedido : pedidos){
            System.out.println(pedido);
        }
    }

    public static void main(String[] args){
        GestaoPedidos pedidos = new GestaoPedidos();

        pedidos.adicionarPedidos("Hamburguer");
        pedidos.adicionarPedidos("Pizza");
        pedidos.adicionarPedidos("Macarronada");
        System.out.println(pedidos.quantidadePendentes());
        pedidos.listarPedidos();
        pedidos.proximoPedido();
        System.out.println("----------------");
        System.out.println(pedidos.quantidadePendentes());
        pedidos.listarPedidos();
    }


}
