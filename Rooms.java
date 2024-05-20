class TwoDShape { 
double width;
double height;
void showDim() { 
System.out.println("Width and height are " + width + " and " + height);
}
}

class Triangle extends TwoDShape { 
String style;

double area() { 
	return width * height / 2;
} 

void showStyle () { 
System.out.println (" Triangle is " + style);
 }
}
class Rooms { 
public static void main(String args[]) {

Triangle lR = new Triangle();
Triangle mBr = new Triangle();
Triangle k = new Triangle();
Triangle dR = new Triangle();
Triangle Br = new Triangle();
Triangle gR = new Triangle();

//set for living room
lR.width = 18;
lR.height = 20;

//master bedroom
mBr.width = 13;
mBr.height = 18;

//kitchen
k.width = 12;
k.height = 14;

//dinning room

dR.width = 14;
dR.height = 16;

//bathroom 

Br.width = 10;
Br.height = 13;

//guest room
gR.width = 15;
gR.height = 17;
System.out.println("Living Room area : ");
System.out.println(lR.area());
System.out.println("Master BedRoom area : ");
System.out.println(mBr.area());
System.out.println("kitchen area : ");
System.out.println(k.area());
System.out.println("dinning room area : ");
System.out.println(dR.area());
System.out.println("Bathroom area : ");
System.out.println(Br.area());
System.out.println("guest room area : ");
System.out.println(gR.area());
}
}