import java.util.*;

public class InputTest {
  public static void main(String[] args){
   Console cons = System.console();
   String username = cons.readLine("username:");
   char[] passwd = cons.readPassword("Password:");



    Scanner in = new Scanner(System.in);
    System.out.print("What is your name?");
    String name = in.nextLine();
    System.out.print("How old are you?");
    int age = in.nextInt();
    System.out.println("Hello, "+name+".Next year, you'll be" +(age+1));
  }
}
