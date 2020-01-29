import java.util.*;
import java.lang.*;
public class P13
{
public static void main(String []args)
{
try
{
//int aa=Integer.parseInt(args[0]);
int a[][]=new int[2][2];
int k=0;
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(args[k]);
k++;
}
}
int s;
s=a[0][0];
System.out.println("The given array is:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("The reverse of the array is:");
for(int j=0;j<2;j++)
{
for(int i=0;i<2;i++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println();
for(int j=0;j<2;j++)
{
for(int i=0;i<2;i++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
//System.out.println("The biggest number in the given array is "+s);
}
catch(Exception e)
{
System.out.println("Please enter 4 integer numbers");
}
}
}