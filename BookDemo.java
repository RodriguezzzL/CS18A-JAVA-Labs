package courses;

class course { 
private int cNumber;
private int doc;

book(int x, int d) { 
cNumber = x;
doc = d;

}

void show() { 
System.out.println(cNumber);
System.out.println(doc);
System.out.println();
}
}

class courseDemo {
public static void main (String args[]) { 
course classes[] = new course[5];

classes[0] = new course (1234,2019);

classes[1] = new course (2341,2019);

classes[2] = new course (3412,2019);

classes[3] = new course (4123, 2019);


for (int i = 0; i < books.length; i++) books[i].show();
	}
}
