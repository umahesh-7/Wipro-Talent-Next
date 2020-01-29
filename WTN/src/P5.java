import java.util.*;
import java.lang.*;
public class P5
{
public static void main(String []args)
{
try{
int aa,ff=0;
aa=Integer.parseInt(args[0]);
for(int i = 1; i <= aa; ++i)
        {
            if(aa % i == 0)
            {
                ff++;
            }
        }
if(args.length==0)
{
//System.exit(0);
}
else if(aa==1 || aa==0)
{
System.out.println(aa+" is neither prime nor composite");
}
else if(ff==2)
{
System.out.println(aa+" is a prime number");
}
else
{
System.out.println(aa+" is not a prime number");
}
}
catch(Exception e)
{
System.out.println("Please enter an integer number");
//System.exit(0);
}
System.exit(0);
}
}