public class Produto {

    // Atributos
    private double preco;
    String modelo;

    // Setter
    public void setPreco(double _preco){
//      if(nivelAcesso == 5) {
//          this.preco = _preco;
//      }
    }


    // Método construtor
    Produto(){}
    Produto(double preco){
        this.preco = preco;

    }
    // Mais uma sobrecarga
    Produto(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }



}