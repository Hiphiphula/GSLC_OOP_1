package session4;

import java.util.ArrayList;
import java.util.Scanner;

public class gslc {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(20);
		num.add(300);
		
		System.out.println(num.size());
		
		System.out.println("enter the array size:");
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		int[] age = new int[size];
		String[] name = new String[size];
		
		for(int i = 0; i<size;i++)
		{
			Scanner inname= new Scanner(System.in);
			Scanner inage = new Scanner (System.in);
			
			System.out.println("Input name " + (i+1) + ": ");
			name[i] = inname.nextLine();	
			
			System.out.println("Input age " + (i+1) + ": ");
			age[i] = inage.nextInt();
		}
		
		SelectionSort(age, name, size);

		for(int i = 0; i<size;i++)
		{
			System.out.println(name[i] + ' ' + age[i]);
		}
		
		
		
	}
	
	public static void SelectionSort(int age[], String name[], int size)
	{
		int position;
		int tempage;
		
		for (int i = 0;i<size;i++)
		{
			position = i;
			for (int j = i+1; j<size; j++)
			{
				if(age[i] < age[j])
				{
					position = j; 
				}
			}
			
			tempage = age[i];
			age[i] = age[position];
			age[position] = tempage;
			
			String tempname = name[i];
			name[i] = name[position];
			name[position] = tempname;

		}
	}
}