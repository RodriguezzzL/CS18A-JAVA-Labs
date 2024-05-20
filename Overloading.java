class Overload{
int OverloadDemo(int P){
P= (3 * P ) / (P +  1);
return P;
}
double OverloadDemo(double Q){
Q = (2 * Q) / (Q+1);
return (double) Q;
}
float OverloadDemo(float R){
R = (4*R) / (R+1);
return (float) R;
}
}
class Overloading{
public static void main (String args[]) {
int demo;
double demoD;
float demoF;
Overload ol = new Overload();
demo = ol.OverloadDemo(30);
demoD = ol.OverloadDemo(50.00);
demoF = ol.OverloadDemo(70.5);

System.out.println(demo);
System.out.println(demoD);
System.out.println(demoF);
	}
}
