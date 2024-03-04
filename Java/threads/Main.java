package CA_java_udemy.threads;
import java.util.Random;
import static java.lang.Thread.sleep;

//Thread object method (standard):

// public class Main {
//     public static void main(String[] args){
//         myCounter counter1 = new myCounter(1);
//         myCounter counter2 = new myCounter(2);
//         long startTime = System.currentTimeMillis();
//         counter1.start();
//         System.out.println("________________________________");
//         counter2.start();
//         long endTime = System.currentTimeMillis();
//         System.out.println("total time: " + (endTime - startTime));

//     }
// }

// class myCounter extends Thread {
//     private int threadNo;

//     public myCounter(int threadNo) {this.threadNo = threadNo;}
//     @Override
//     public void run(){
//         try {
//             countMe();
//         } catch (InterruptedException e) {
//             //try/catch required
//             e.printStackTrace();
//         }
//     }
//     public void countMe() throws InterruptedException{
//         for (int i = 0; i< 10; i++){
//             sleep(50);
//             System.out.println("Thread #:  "+ threadNo + " and iteration #: " + i);
//         }
//     }
// }

//using runnable:

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    try{
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } 
                    System.out.println("thread1__>>" + i);
                }
            }
        }).start();

        //second thread (simultaneous)

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    try{
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } 
                    System.out.println("thread2__>>" + i);
                }
            }
        }).start();
    }
}
 