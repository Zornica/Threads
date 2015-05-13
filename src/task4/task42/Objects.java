package task4.task42;

/**
 * Created by Zornitsa Petkova on 5/13/15.
 */
public class Objects {
  int index = 0;
  private Object[] array;

  /**
   * Constructor
   */
  public Objects(Object[] arr) {
    array = arr;
  }

  /**
   * Adds new element in list
   *
   * @param obj is element which we add
   */
  public synchronized void add(Object obj) {
    while (index >= array.length) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    array[index] = obj;
    index++;
    notify();


  }

  /**
   * Removes element from list
   *
   * @return removed element
   */
  public synchronized void remove() {
    while (array[0] == null) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    index--;
    array[index] = null;
    notify();

  }

  /**
   * Prints all element in list
   */
  public synchronized void printAllElement() {
    for (int i = 0; i < index; i++) {
      System.out.println(array[i] + " ");
    }
  }


}