public class Produto {
    String produto;
    double preco;
    int estoque;

    public Produto(String produto, double preco, int estoque) {
        this.produto = produto;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + "\nPreço: " + preco + " R$"+"\nQuantidade: " + estoque+"\n";
    }
}

