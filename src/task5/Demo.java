package task5;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/11/15.
 */
public class Demo {
  public static void main(String[] args) {
    Hashtable<String, Object> table = new Hashtable<String, Object>();
    TimeHashTable hashTable = new TimeHashTable(table);
    Integer i;
    String[] value = {"Sisa", "Ivan", "Koko"};
    for (i = 0; i < value.length; i++) {
      hashTable.put(i.toString(), value[i]);
      new Threads(hashTable, System.currentTimeMillis());

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    for (String p : table.keySet()) {
      System.out.print(p + " " + table.get(p)+" ");
    }
    System.out.println("");
    hashTable.get("2");
    for (String p : table.keySet()) {
      System.out.print(p + " " + table.get(p) + " ");
    }
    System.out.println("");
    hashTable.remove("1");
    for (String p : table.keySet()) {
      System.out.print(p + " " + table.get(p) + " ");
    }
    System.out.println("");
  }
}
