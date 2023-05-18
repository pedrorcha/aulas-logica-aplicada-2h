public class Main {
    public static void main(String[] args) {

        // Aula introdutória de Orientação à Objetos (OO)
        // Declaração de objeto
        Pessoa adao;
        // Instanciação do objeto
        adao = new Pessoa();

        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();

        //Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));



    }
}