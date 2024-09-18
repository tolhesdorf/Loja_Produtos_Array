public class Loja {
    Produto [] loja = new Produto[10];

    public Loja() {
        loja[0] = new Produto("Halls", 4, 13);
        loja[1] = new Produto("Mentos", 5.50, 23);
        loja[2] = new Produto("Paçoca", 1.50, 9);
        loja[3] = new Produto("Pé de Moleque", 1, 5);
        loja[4] = new Produto("Caixa de Bombom", 12.50, 32);
        loja[5] = new Produto("Coca-Cola 2L", 13.50, 10);
        loja[6] = new Produto("Coca-Cola Zero 2L", 13.50, 33);
        loja[7] = new Produto("Barra de Chocolate", 7.80, 7);
        loja[8] = new Produto("Fanta 2L", 10.30, 5);
        loja[9] = new Produto("Energético 300ML", 5.50, 4);
    }

    public double exibirvalorestoque(){
        double soma = 0;
        for(int i = 0; i < 10;i++){
            soma = soma + loja[i].totalestoque();
        }
        return soma;
    }

    public void exibirloja(){
        for(int i = 0; i < 10; i++){
            System.out.println(loja[i]);
        }
        System.out.println("Valor total no estoque da loja: "+exibirvalorestoque()+" R$");
    }
}