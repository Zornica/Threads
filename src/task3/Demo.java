package task3;


/**
 * Created by Zornitsa Petkova on 5/7/15.
 */
public class Demo {
  public static void main(String[] args) {
    Object lock = new Object();
    Counter T1 = new Counter( "Thread1",1,5,lock);
    Counter T2 = new Counter( "Thread2",10,20,lock);
    T1.start();
    T2.start();

  }
}

