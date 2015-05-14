package task5.task52;

/**
 * Created by Zornitsa Petkova on 5/14/15.
 */
public class Demo2 {
  public static void main(String[] args)throws InterruptedException{
    TimeOutHashTable table = new TimeOutHashTable(3);

    table.put("1");
    System.out.println("Slagame 1");
    Thread.sleep(1000);
    System.out.println(" ");

    table.put("2");
    System.out.println("Slagame 2");
    Thread.sleep(1000);
    System.out.println(" ");

    System.out.println("Prezarejdame 1");
    table.get("1");
    System.out.println(" ");

    table.put("3");
    System.out.println("Slagame 3");
    Thread.sleep(1000);
    System.out.println(" ");

    table.put("4");
    System.out.println("Slagame 4");
    Thread.sleep(1000);
    System.out.println(" ");


    table.put("5");
    System.out.println("Slagame 5");
    Thread.sleep(1000);
    System.out.println(" ");

    table.close();

    System.out.println("The elements in the hashTable are: ");
    table.print();

  }
}
