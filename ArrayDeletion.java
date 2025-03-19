package concepts;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDeletion {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[20];
	System.out.println("enter a size");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("enter a delete pos");
	int delpos=sc.nextInt();
	for(int mypos=delpos-1;mypos<size;mypos++)
	{
		a[mypos]=a[mypos+1];
	}
	size--;
	System.out.println(Arrays.toString(a));
	sc.close();
}
}
