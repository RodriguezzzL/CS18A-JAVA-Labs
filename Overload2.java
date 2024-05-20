class Overload {
int p = 30;

float r = 70.50f;

double q = 50.00; 


int D (int x) {
System.out.println("This is the int : "+ p + 1/3 * p); 
return p + 1/3 * p;
}
double D (double x) {
System.out.println("This is the Double : " +  q + 1/2 * q); 
return q + 1/2 * q;
}
float D (float x) {
System.out.println("This is the float : " + r + 1/4 * r); 
return r + 1/4 * r;
}
}

class Overload2 {
public static void main (String args[]) { 

Overload test = new Overload();

int p = 30;

float r = 70.50f;

double q = 50.00; 


first = test.D(p);
second = test.D(q);
thirdf = test.D(r);
System.out.println("first overload " + first);
System.out.println("second overload " + second);
System.out.println("third overload " + thirdf);
}
}