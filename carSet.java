import java.util.Scanner;

//created a created a class to show the car wash intro.

public interface carSet {
 void setYear();

}


class car implements carSet {
private int year;
private String brand;
private char license [];





void setYear(int y) {year = y;}
void setBrand(String b) {brand = b;}
int returnYear(){return year;}
String returnBrand(){return brand;}




}

class truck extends car { 
private int wheelHeight;

void setHeight(int a){wheelHeight = a;}
int returnHeight(){return wheelHeight;}

}

class voice { 
// intro for carwash. This intro will be displayed when customers open up the app.



void intro1 () {
System.out.println (" Welcome to Supreme wash! ");
System.out.println (" Supreme wash is the best and simpliest way to wash your car! ");
System.out.println (" using the best tech. to give you the best car wash experience! ");
System.out.println(" Please tell us what kind of vehicle you have");
System.out.println (" Press S if you have a sedan or press T if you have a Truck! ");}




void price(){

System.out.println(" 1 is our advanced wash");
System.out.println(" our Advanced wash is $4.99 & $9.99 for trucks.");

System.out.println(" 2 is our Elite wash");
System.out.println(" Our Elite was is $9.99 & $19.99 for trucks.");

System.out.println(" 3 is our Supreme wash");
System.out.println(" Our Supreme wash is $19.99 & $59.99 for trucks.");}


void userID() {
System.out.println();
System.out.println(" Please create a user ID number.");
System.out.println(" Only seven numbers may be used. ");}

void receipt() 
{
System.out.println(" Your order has now been submitted. ");
System.out.println( " Here is your receipt. ");
System.out.println(" Please input your userID when at the car wash");

}
}

public class project1 {
public static void main (String args[]) throws java.io.IOException {


int d;
char sorT;
char choice;
int sedanYear;
int TruckYear;
String sedanBrand;
String TruckBrand;
double washType = 0;
int height;
double tax = .0875;
int userID[] = new int[7];

car sedan = new car();

truck Truck = new truck();

voice entrance = new voice();


Scanner in = new Scanner(System.in);


entrance.intro1 ();



 // getting customers response.

sorT = (char) System.in.read();

if (sorT == 't') {

System.out.println(" You have a truck!" );
System.out.println(" Please tell us how lifted your truck is in inches." );
System.out.println(" We will use your height to adjust our machines to give you the best car wash!" );

height = in.nextInt();

Truck.setHeight(height);

System.out.println(" Please tell us the year of your vehicle.");

TruckYear = in.nextInt();
Truck.setYear(TruckYear);



System.out.println(" Please tell us the brand of your car ");

TruckBrand = System.console().readLine();
Truck.setBrand(TruckBrand);



System.out.println(" Great you have a " + TruckBrand + "!");
System.out.println();




System.out.println();

// asking the customer which one of our 3 special washes would they like.

System.out.println(" Now which one of our detailed cleaning would you like? ");

System.out.println(" Please select the level of cleaning you would like :  1 - 3 ");

entrance.price();

choice = (char) System.in.read();

switch(choice) {
case '1' :
System.out.println(" This is our advanced wash that you choose.");
washType = 9.99;
break;
case '2' : 
System.out.println(" This is our Elite wash that you choose.");
washType = 19.99;
break;
case '3' :
System.out.println(" This Supreme wash wash that you choose.");
washType = 59.99;
break;}

System.out.println();


entrance.userID();


for (int j = 0; j < 7; j++)
userID[j] = in.nextInt();

entrance.receipt();
System.out.println(" Car Brand: " + Truck.returnBrand());

System.out.println(" Car Year: " + Truck.returnYear());
System.out.println(" We will lift our machines by : " + Truck.returnHeight());
System.out.print(" This is your user ID ");

for(int k = 0; k < 7; k++){
System.out.print(userID[k]);}


washType += washType * tax;
System.out.println();
System.out.print(" Your total is : " + washType ); 
}






else {

//getting the customers car information to provide the best possible car wash for them.

System.out.println(" You have a sedan! ");

System.out.println(" Please tell us the year of your vehicle");

sedanYear = in.nextInt();
sedan.setYear(sedanYear);



System.out.println(" Please tell us the brand of your car ");

sedanBrand = System.console().readLine();
sedan.setBrand(sedanBrand);



System.out.println(" Great you have a " + sedanBrand + "!");
System.out.println();




System.out.println();

// asking the customer which one of our 3 special washes would they like.

System.out.println(" Now which one of our detailed cleaning would you like? ");

System.out.println(" Please select the level of cleaning you would like :  1 - 3 ");

entrance.price();

choice = (char) System.in.read();

switch(choice) {
case '1' :
System.out.println(" This is our advanced wash that you choose");
washType = 4.99;
break;
case '2' : 
System.out.println(" This is our Elite wash that you choose");
washType = 9.99;
break;
case '3' :
System.out.println(" This Supreme wash wash that you choose");
washType = 19.99;
break;}

System.out.println();


entrance.userID();


for (int j = 0; j < 7; j++)
userID[j] = in.nextInt();

entrance.receipt();
System.out.println(" Car Brand: " + sedan.returnBrand());

System.out.println(" Car Year: " + sedan.returnYear());
System.out.print(" This is your user ID ");

for(int k = 0; k < 7; k++){
System.out.print(userID[k]);}


washType += washType * tax;
System.out.println();
System.out.print(" Your total is : " + washType ); 
}


}
}

