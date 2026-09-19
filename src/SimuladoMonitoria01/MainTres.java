package SimuladoMonitoria01;

public class MainTres {
    public static void main(String[] args){
        Autor autor = new Autor("Felipe", "BR");

        Livro livro = new Livro("MEDICINA DOS HORRORES", 133.30, autor);

        livro.exibirDetalhes();
    }
}
