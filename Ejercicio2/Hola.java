package Ejercicio2;

//Cristopher Vázquez Villa

public class Hola implements Runnable{

    @Override
    public void run(){
        while (true) {
            System.out.print("Hola ");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}
