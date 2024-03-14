package Ejercicio1;

//Cristopher Vázquez Villa

public class HiloDescendente implements Runnable{

    @Override
    public void run(){
        for (int i = 100; i >= 1; i--) {
            System.out.println("Hilo 2:" + i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin hilo 2");
    }
    
}
