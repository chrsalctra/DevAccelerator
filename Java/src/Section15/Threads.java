package Section15;

public class Threads implements Runnable{
    @Override
        public synchronized void run() {
              //utilizing normal flow (no wait)
//            for (int i = 0; i < 3; i++) {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//                System.out.println("Thread is " + Thread.currentThread().getName() + ", value is : " + i);
//            }


            //utilizing our wait method. notifies other threads to continue/unwait:
            try {
                System.out.println("Thread is now sleep: " + Thread.currentThread().getName());
                Thread.sleep(5000); // one 1 second is over, this thread will notify other thrads
                // like main to continue
                synchronized (this) {
                    this.notifyAll();
                }
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void letsWait() {
            //second thread that runs in main method (call)
            synchronized (this) {
                try {
                    wait(); // it will wait until notified to continue
                } catch (InterruptedException e ) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread is  wake up: " + Thread.currentThread().getName());
        }
    public static void main(String[] args) {
        System.out.println("Thread is " + Thread.currentThread().getName());
        Threads obj = new Threads();
        Thread t1 = new Thread(obj);
        t1.setName("a");  
//        Thread t2 = new Thread(obj);
//        t2.setName("b");
//        Thread t3 = new Thread(obj);
//        t3.setName("c");
        t1.start();
        obj.letsWait(); // in main thread
//        t2.start();
//        t3.start();
    }

}
