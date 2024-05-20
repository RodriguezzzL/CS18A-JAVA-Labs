import java.util.Scanner;
class Guess2 {
public static void main(String args[]) throws java.io.IOException { 
Scanner sc = new Scanner(System.in);
System.out.println("How old are you? ");
int age = Integer.parseInt(sc.nextLine());
System.out.println("You wrote: " + age);
if(age >= 21) System.out.println("You are 21 or over!");
else System.out.println("Your are under 21");
}
}