package task4.task42;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class AddThread extends Thread {
  private Objects list;
  Object obj;

  public AddThread(Objects list, Object obj) {
    this.obj = obj;
    this.list = list;
  }

  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      System.out.println("Add");
      list.add(obj);
      list.printAllElement();
      System.out.println(" ");

    }
  }
}
