package arrayPractice;

import java.util.Arrays;

public class App extends minMaxElement{
    public static void main(String[] args)
    {
    	minMaxElement referance=new minMaxElement();
        referance.inputArray();
        System.out.println(Arrays.toString(referance.maxElement()));
    }
}