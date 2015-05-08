package task1;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Zornitsa Petkova on 5/7/15.
 */
public class Demo {
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   SimpleThread t= new SimpleThread("Thread ");
    t.start();
     sc.next();
   t.interrupt();



  }
}

