import java.util.*;
class prime
{
public static void main(String args[])
{
int c=0,n,r;
Scanner p=new Scanner(System.in);
n=p.nextInt();
for(r=2;r<n;r++)
{
if(n%r==0)
c++;
}
if(c==0)
System.out.print("Prime");
else
System.out.print("Not a Prime");}}
