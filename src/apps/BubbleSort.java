package apps;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arry:");
		int size =  sc.nextInt();
		int i,temp = 0;
		int [] arr = new int[size];
		System.out.println("Enter the elemnet");
		for( i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for( i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>0;j--)
			{
				if(arr[i]>arr[j-1])
				
					{	temp= arr[i];
						arr[i]= arr[j-1];
						arr[j]= temp;
					}
				
			}
			
		}
		for(int k=0;k<arr.length;k++)
		{	//System.out.println("The sorted array is :");
			System.out.println(arr[k]);
		}
			
	
	
	}

}
