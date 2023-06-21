
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Pessoa();
        Pessoa qualquer = new Pessoa();
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
        Pessoa rainha = new Pessoa();
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        rainha.falar();
        rainha.comer();


        // Criar produtos
        Produto p1 = new Produto(1300.00);
        Produto p2 = new Produto();
        // p2.preco = 233.00;
        p2.setPreco(233.00);
        Produto p3;
        p3 = new Produto("Placa Vídeo", 1300.00);
        p3 = new Produto("Placa Mãe", 2500.00);

        p2.setPreco(1.00);


    }
}
