package task4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Zornitsa Petkova on 5/8/15.
 */
public class Demo {

  public static void main(String[] args) throws InterruptedException {

    BlockingQueue<String> q = new ArrayBlockingQueue<String>(10);
    Object lock = new Object();
    ThreadAdd threadAdd = new ThreadAdd(q,lock);
    ThreadRemove threadRemove = new ThreadRemove(q,lock);
    threadAdd.start();
    threadRemove.start();
    Thread.sleep(1000);
    for(String obj:q){
      System.out.println("element  "+obj);
    }

  }
}
