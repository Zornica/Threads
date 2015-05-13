package task5;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class Remover extends Thread {
  private int countTo;
 private String key;

  private TimeHashTable table;

  public Remover(TimeHashTable table, String key, int countTo) {
    this.table = table;
    this.key = key;
    this.countTo = countTo;

  }

  public void run(){

   for(int i =0; i< countTo; i++){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
   table.remove(key);
    System.out.println("Mahame " + key);
}
}
