package task5;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Hashtable;

/**
 * Created by Zornitsa Petkova on 5/12/15.
 */
public class Demo {
  public static void main(String[] args)throws InterruptedException{
    TimeHashTable table = new TimeHashTable(3);

    table.put("1");
    System.out.println("Slagame 1");
    Thread.sleep(1000);
    System.out.println(" ");

    table.put("2");
    System.out.println("Slagame 2");
    Thread.sleep(1000);
    System.out.println(" ");

    table.get("1");
    System.out.println("Prezarejdame 1");
    System.out.println(" ");

    table.put("3");
    System.out.println("Slagame 3");
    Thread.sleep(1000);
    System.out.println(" ");

    table.put("4");
    System.out.println("Slagame 4");
    Thread.sleep(1000);
    System.out.println(" ");

    table.put("1");
    System.out.println("Prezarejdame 1");
    System.out.println(" ");

    table.put("5");
    System.out.println("Slagame 5");
    Thread.sleep(1000);
    System.out.println(" ");

    table.close();

    System.out.println("The elements in the hashtable are: ");
    table.print();

  }
}
