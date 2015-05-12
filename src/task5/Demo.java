package task5;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class Demo {
  public static void main(String[] args) {
    Hashtable<String ,Object> hashTable = new Hashtable<String, Object>();
Integer i=1;
    TimeHashTable table1 = new TimeHashTable(hashTable,0);
    table1.put("1","Sisa");
    Remover thread1 = new Remover(table1,"1");
    thread1.start();
    i++;
    TimeHashTable table2 = new TimeHashTable(hashTable,0);
    table2.put("2","Ivan");
    Remover thread2 = new Remover(table2,"2");
    thread2.start();
    i++;
    TimeHashTable table3 = new TimeHashTable(hashTable,0);
    table3.put("3","Koko");
    Remover thread3 = new Remover(table3,"3");
    thread3.start();
    i++;
   // System.out.println(table1.get("1"));
    TimeHashTable table4 = new TimeHashTable(hashTable,0);
    table4.put(i.toString(),"Zuza");
    Remover thread4 = new Remover(table4,i.toString());
    thread4.start();
     for(String p:hashTable.keySet()){
       System.out.println(hashTable.get(p));
     }
  }
}
