package task1;


public class SimpleThread extends Thread {

  private String name;

  public SimpleThread(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(name + " counts " + i);
        break;
      }
    }
  }


}
