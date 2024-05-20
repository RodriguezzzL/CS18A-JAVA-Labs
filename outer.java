class outer {
int nums[];
outer(int n[]) {
nums = n;
}
void analyze() {
 inner inOb = new inner();
System.out.println("Minimum: " + inOb.min());
System.out.println("Maximum: " + inOb.max());
System.out.println("Average: " + inOb.avg());
}
class inner {
int min() { 
int m = nums[0];
for(int i= 1; i < nums.length; i++) 
if(nums[i] < m ) m = nums[i];
return m;
}
int max() { 
int m = nums[0];
for(int i = 1; i < nums.length; i++)
if(nums[i] > m) m = nums[i];
return m;
}
int avg() { 
int a = 0;
for(int i = 0; i < nums.length; i++)
a+= nums[i];
return a / nums.length;
} 
}
}
class Nested{
public static void main (String args[]) {
int x[] = {25,49,48,13,16};
outer outOb = new outer(x);
outOb.analyze();
	
}
}