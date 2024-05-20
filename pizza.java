class pizza{
public static void main(String args[]) {
double disTotal = 0;
double pizTotal = 0;
int pizzaDis[][] = { 
{2,2,}, 
{5,4},
{10,8},
{12,10},
{15,12}};
for (int i = 0; i < 5; i++){
	disTotal += pizzaDis[i][0];}
	System.out.println("Your total discounts are : " + disTotal);
for (int j = 0; j < 5; j++){
	pizTotal += pizzaDis[j][1];}
	System.out.println("Your total for the pizzas are : " + pizTotal);	
	System.out.println("Total avaerage discount per pizza is : " + disTotal / pizTotal);  
	}
}