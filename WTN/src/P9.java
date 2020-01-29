import java.util.*;
import java.lang.*;
public class P9
{
public static void main(String []args)
{
try
{
int aa=Integer.parseInt(args[0]);
int i=1,f=1;
do
    {
        f=f*i;
        i++;
    }while(i<=aa);
System.out.println("The factorial of "+aa+" is "+f);

}
catch(Exception e)
{
System.out.println("Please enter an integer number");
}
}
}