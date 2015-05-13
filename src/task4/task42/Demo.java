package task4.task42;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class Demo {
  public static void main(String[] args) throws InterruptedException {

    Object[] arr = new Object[5];
    Objects list = new Objects(arr);
    AddThread addThread = new AddThread(list, "Mima");
    RemoveThread removeThread = new RemoveThread(list);
    addThread.start();

    Thread.sleep(100);

    removeThread.start();

    Thread.sleep(10);

    addThread.interrupt();
    removeThread.interrupt();

  }
}
