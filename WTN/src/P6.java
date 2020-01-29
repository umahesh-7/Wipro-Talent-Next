import java.util.*;
import java.lang.*;
public class P6
{
public static void main(String []args)
{
try
{
int aa=Integer.parseInt(args[0]);
int mm,zz=0,ss;
mm=aa;
while(aa!=0){
ss=aa%10;
zz=zz*10+ss;
aa=aa/10;
}
if(args.length==0)
{
System.out.println("enter input");
}
else if(mm==zz){
System.out.println(mm+" is a palindrome");
}
else
{
System.out.println(mm+" is not a palindrome");
}
}
catch(Exception e)
{
System.out.println("please enter an integer number");
}
}
}