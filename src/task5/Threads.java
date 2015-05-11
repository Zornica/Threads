package task5;

/**
 * Created by Zornitsa Petkova on 5/11/15.
 */
public class Threads extends Thread {

  private String key;
  private Long time;
  private TimeHashTable table;

  public Threads(String key, Long time, TimeHashTable table){
    this.time = time;
    this.key=key;
    this.table = table;
  }

  public void  run(){
    if((System.currentTimeMillis()-time)*1000 >= 5*1000){
      table.remove(key);
    }
  }
}
