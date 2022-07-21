class Addition
{
int x;
int y;
int add(int a,int b)
{
x=a;
y=b;
return x+y;
}
}
public class Lab6RA
{
public static void main(String args[])
{
Addition p=new Addition();
int c=p.add(10,20);
System.out.println(c);
}
}
