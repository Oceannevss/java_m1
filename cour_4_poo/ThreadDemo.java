package cour_4_poo;

public class ThreadDemo {
    public static void setThread(){
        //dans quel thread la fonction est executé
        System.out.println(Thread.currentThread().getName());

        /*for (int i=0; i<10; i++){
            Thread thread = new Thread(new DonwloadFileTask());
            thread.start();
        }*/

        Thread thread = new Thread(new DonwloadFileTask());
        thread.start();
        try {
            //Thread.sleep(5000);
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Download Complete");
    }
}
