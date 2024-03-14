package Ejercicio2;

//Cristopher Vázquez Villa

public class Mundo implements Runnable{
    
    @Override
    public void run(){
        while (true) {
            System.out.print("Mundo ");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}
