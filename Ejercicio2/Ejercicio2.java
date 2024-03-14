package Ejercicio2;








//Cristopher Vázquez Villa

public class Ejercicio2 {
    
    public static void main(String[] args) throws InterruptedException {

        Thread hiloHola = new Thread(new Hola());
        Thread hiloMundo = new Thread(new Mundo());

        hiloHola.start();
        hiloMundo.start();
    }
}
