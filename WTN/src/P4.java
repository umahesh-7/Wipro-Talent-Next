import java.util.*;
import java.lang.*;
public class P4
{
public static void main(String []args)
{
try{
int aa,mm=0;
aa=Integer.parseInt(args[0]);
if(args.length==0)
{
System.out.println("yes");
}
else if(aa<0)
{
System.out.println(aa+" is a negative number");
}
else if(aa==0)
{
System.out.println(aa+" is neither negative or positive");
}
else
{
System.out.println(aa+" is a positive number");
}
}
catch(Exception e)
{
System.out.println("An integer number as argument is excepted");
}
}
}