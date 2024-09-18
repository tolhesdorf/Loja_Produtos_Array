public class Produto {
    String produto;
    double preco;
    int estoque;

    public Produto(String produto, double preco, int estoque) {
        this.produto = produto;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double totalestoque(){
        return preco*estoque;
    }

    @Override
    public String toString() {
        return "Produto: " + produto + "\nValor em estoque: " + totalestoque()+" R$\n";
    }
}

