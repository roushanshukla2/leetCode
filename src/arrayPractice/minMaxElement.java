package arrayPractice;


import java.util.Arrays;

import java.util .Scanner;

public class minMaxElement {
	private 
	int array[];
    int min = Integer.MAX_VALUE;
    int max =Integer.MIN_VALUE;
    int size;

    
    void inputArray()
    {
        System.out.println("Enter number of element in array");
        @SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
        size=input.nextInt();
        System.out.println("Enter element in the array");
        array=new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=input.nextInt();
        }
        
    }
    protected int[] maxElement()
    {
    	for(int i=0;i<size;i++)
    	{
    		if(array[i]>max)
    		{
    			max=array[i];
    		}
    		if(array[i]<min)
    		{
    			min=array[i];
    		}
    	}
    	return new int[]{max,min};
    }

    public static void main(String args[])
    {
        minMaxElement referance=new minMaxElement();
        referance.inputArray();
        System.out.println(Arrays.toString(referance.maxElement()));
    }
}