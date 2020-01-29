import java.util.*;
import java.lang.*;
public class P12
{
public static void main(String []args)
{
try
{
int aa=Integer.parseInt(args[0]);
int a[][]=new int[3][3];
int k=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(args[k]);
k++;
}
}
int s;
s=a[0][0];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(s<a[i][j])
s=a[i][j];
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("The biggest number in the given array is "+s);
}
catch(Exception e)
{
System.out.println("Please enter 9 integer numbers");
}
}
}