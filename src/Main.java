public class Main {
    public static void main(String[] args) {

        int contador = 0;

        // laço while
        while(contador < 10){
            System.out.println("Contador = " + contador);
            // Incremento
            contador++; // OU contador = contador + 1
        }

        // Laço for
        for(int x = 0; x < 10; x++){
            System.out.println("Contador = " + x);
        }

        // Laço do while
        int cont = 1;
        do{
            // processo
            System.out.println(cont);
            // incremento
            cont++;

        }while(cont <= 10);

    }
}