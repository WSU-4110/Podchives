import java.io.*;
import java.util.*;
import java.util.Scanner;
//using factory method
String choice;
public interface Review {
   void choice();
}

    
    public class Read implements Review{
        public void read() {
      System.out.println(“review");
   }

    }
    public class Write implements Review{
     public void write() {
        System.out.print("Type Here: ");
             choice = input.nextLine();
             }
    }
    

