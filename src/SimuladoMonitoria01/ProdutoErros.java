package SimuladoMonitoria01;

public class ProdutoErros {
    /*
        7	codigo = "A100"	codigo é int, mas "A100" é String
        8	nome = nome	Não altera o atributo; deveria ser this.nome = nome
        13	Acesso a nome em método static	nome pertence ao objeto, não à classe
        17	Alteração de codigo	codigo é final e não pode ser alterado
        20-21	getPreco()	Está como void, mas tenta retornar double
        3	preco static	Faz todos os produtos compartilharem o mesmo preço
        27	p1.codigo = 500	codigo é final e não pode ser alterado
    */
}
