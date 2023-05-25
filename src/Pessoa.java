public class Pessoa extends Animal{
    // Atributos da classe
    public String sobrenome;
    // Métodos da classe
    public void falar(){        // void == sem retorno
        System.out.println("falei");
    }
    public String falar(String texto){
        return texto;
    }

    // sobrescrita do método
    public void comer(){
        System.out.println("pessoa comeu");
    }




}
