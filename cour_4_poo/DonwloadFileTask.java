package cour_4_poo;

public class DonwloadFileTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Downloading file :"+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
