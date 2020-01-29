import java.util.*;
import java.lang.*;
public class P7
{
public static void main(String []args)
{
try
{
int aa=Integer.parseInt(args[0]);
int mm,zz=0,ss;
mm=aa;
while(mm!=0){
ss=mm%10;
zz=zz+ss;
mm=mm/10;
}
if(args.length==0)
{
System.out.println("enter input");
}
else{
System.out.println("The sum of the digits of "+aa+" is "+zz);
}
}
catch(Exception e)
{
System.out.println("please enter an integer number");
}
}
}