package task4.task42;

import task5.Remover;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class RemoveThread extends Thread {
  private Objects list;


  public RemoveThread(Objects list) {
    this.list = list;
  }

  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      System.out.println("Remove");
      list.remove();
      list.printAllElement();
      System.out.println(" ");

    }
  }
}
