import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n=10,t1=0,t2=1;
	System.out.println("enter "+n+"terms");
	for(int i=1;i<=n;i++)
	{
		System.out.println(t1+"+");
		int sum=t1+t2;
		t1=t2;
		t2=sum;
	}
	}
}
