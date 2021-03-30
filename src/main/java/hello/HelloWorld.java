package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    int abc = 1; // Unused

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
