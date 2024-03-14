package Ejercicio1;

//Cristopher Vázquez Villa

public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo1 = new Thread(new HiloAscendente());
        Thread hilo2 = new Thread(new HiloDescendente());

        hilo1.start();
        hilo2.start();
    }
}
