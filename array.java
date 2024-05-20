class Array{
public static void main(String args[]) {
int average = 0;
int total = 0;
int testScores[] = {89,91,76,83,90,79};

for( int i = 0; i < 6; i++) {
total += testScores[i];
average = total / 6;}
System.out.println(" This is the total sum of your test scores : " + total);
System.out.println(" This is the average of your test scores : " + average);

	}
}

