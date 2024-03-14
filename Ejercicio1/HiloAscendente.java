package Ejercicio1;

//Cristopher Vázquez Villa

public class HiloAscendente implements Runnable{
    
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hilo 1:" + i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin hilo 1");
    }
}