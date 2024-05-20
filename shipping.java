class Shipping {
double weight;
}

class shippingDemo {
public static void main (String args[]) {
 Shipping tv = new Shipping();
 Shipping laptop = new Shipping();
 Shipping gameConsole = new Shipping();

 tv.weight = 15;
 laptop.weight = 7;
 gameConsole.weight = 5;
 
  System.out.println(" Shipping cost for a TV is : " + tv.weight* 1.25);
  System.out.println(" Shipping cost for a laptop is : " + laptop.weight * 1.25);
  System.out.println(" Shipping cost for a Game Console is : " + gameConsole.weight* 1.25);
}
}
