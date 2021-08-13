import java.util.*;
class Fibonacciseries
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("Fibonacci series : ");
for(int i=0;i<n;i++)
{
System.out.print(fibo(i)+" ");
}
}
public static int fibo(int n)
{
if(n==0)
return 0;
if(n<=1)
return n;
return fibo(n-1)+fibo(n-2);
}
}

output:

10
Fibonacci series : 0 1 1 2 3 5 8 13 21 34 