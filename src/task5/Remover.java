package task5;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class Remover <K,T>extends Thread {
  private int countTo;
  private int  count ;
  private K key;


  private TimeHashTable<K,T> table;

  public Remover(TimeHashTable<K,T> table, K key, int countTo ) {
    this.table = table;
    this.key = key;
    this.countTo = countTo;
    }

  public void run() {
    for ( count = 0; count < countTo; count++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
    table.remove(key);
    System.out.println("Mahame " + key);
  }

public Object reset(){
  return count=0;
}
}
