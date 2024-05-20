
class groceryList{
double nuts, flour, vegetables, grains;
double discountN,discountF,discountV,discountG;

double discounts(){

if (nuts >= 10) {
discountN = nuts * .30;
return (double) discountN;}

else if (flour >= 20) {
discountF = flour * .25;
return (double) discountF;}

else if (vegetables >= 20){
discountV = vegetables * .7;
return (double) discountV;}

else if (grains >= 40){
discountG = flour * .10;
return (double) discountG;}

else return 0;

}
}
class freshFoods { 
public static void main(String args[]){

groceryList Nuts = new groceryList();
groceryList Flour = new groceryList();
groceryList Vegetables = new groceryList();
groceryList Grains = new groceryList();

Nuts.nuts = 20;
Flour.flour = 20;
Vegetables.vegetables = 20;
Grains.grains = 50;

System.out.println("this is the discount for nuts : $ " + Nuts.discounts());
System.out.println("this is the discount for flour : $ " + Flour.discounts());
System.out.println("this is the discount for Vegetables : $ " + Vegetables.discounts());
System.out.println("this is the discount for Grain : $ " + Grains.discounts());
	}
}