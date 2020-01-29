import java.util.*;
import java.lang.*;
class P11
{
public static void main(String []args)
{
try
{
int aa=Integer.parseInt(args[0]);
int i,j;
for (i=1; i<=aa; ++i) 
{
for (j=1; j<=i; ++j)
{ 
System.out.print("* "); 
}
System.out.println();
}
}
catch(Exception e)
{
System.out.println("Please enter an integer number");
}
}
}