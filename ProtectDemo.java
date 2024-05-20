package bookpackext;
class ExtBook extends bookpack.book (String t, String s, int d, String p) { 
super(t,a,d);
publisher = p;
}
public void show() { 
super.show();
System.out.println(publisher);
System.out.println();

public string getPublisher() {return publisher;}
public void setPublisher (string p) { publisher = p; } 

public String getTitle() {return title; }
public void setTitle(string t) {title = t; }
public String getAuthor() { return author; }
public void setAuthor(string a) { author = a; }
public int getPubDate() {return pubDate; } 
public void setPubDate(int d) { pubDate = d; }
}
class ProtectDemo { 
public static void main (String args[]) { 
ExtBook books[] = new ExtBNook[5];

books[0] = new Extbook("java: a beginners guide", "Schildt",2019);
books[1] = new Extbook("java: complete Reference", "Schildt",2019);
books[2] = new Extbook("introducing JavaFx 8 programing", "Schildt",2015);
books[3] = new Extbook("Red Storm Rising", "Clancy",1986,"Putnam");
books[4] = new Extbook("On the Road", "Kerouac",1955,"Viking");

for(int i=0; i < books.length;i++) books[i].show();

System.out.println("Showing all books by Schildt.");
for(int i=0; i < books.length; i++)
if(books[i].getAuthor() == "Schildt")
System.out.println(books[i].getTitle());
	}
}