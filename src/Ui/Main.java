package Ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ob=new Main();
		ob.createArray();
		
	}
	
	
	int binarySearch(int arr[], int lo, int hi, int x) {
        if (hi >= lo && lo < arr.length - 1) {
            int mid = lo + (hi - lo) / 2;
            System.out.println("Entre");
            if (arr[mid] == x) {
            	System.out.println("Entre");
                return mid;
            	}
            if (arr[mid] > x) {
                return binarySearch(arr, lo, mid - 1, x);}
            return binarySearch(arr, mid + 1, hi, x);
        }
        return -1;
    }
	
	public void createArray() {
		int arr[];
		int longg = 0;
		ArrayList<String> Exit = new ArrayList<String>();
		ArrayList<String> Exitt = new ArrayList<String>();
		longg= Integer.parseInt(sc.nextLine());
		arr=new int[longg];
		
		String num=sc.nextLine();
		String[] num1=num.split(" ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(num1[i]);
		}
		int price=0;
		price=Integer.parseInt(sc.nextLine());
	    int n = arr.length;
	    for(int i=0;i<arr.length;i++) {
	    	int x = price-arr[i];
	    	System.out.println(x);
		    int position = binarySearch(arr, 0, n - 1, x);
		    if (position == -1) {
		    	String n1=("Element not found !!!");
		    	Exit.add(n1);
		    }
		    else {
		        String n2=("Element found at index: " + arr[position] + "valor busqueda "+ arr[i] );
		        Exit.add(n2);
		    }
		    int position1 = BinarySearch1( arr, x);
		    if (position1 == -1) {
		    	String n1=("Element not found !!!");
		    	Exitt.add(n1);
		    }
		    else {
		        String n2=("Element found at index: " + arr[position] + "valor busqueda "+ arr[i] );
		        Exitt.add(n2);
		    }
	    }
	    for (int i = 0; i < Exit.size(); i++) {
			System.out.println(i+ "- "+ Exit.get(i));
		}
	    for (int i = 0; i < Exit.size(); i++) {
			System.out.println(i+ "- "+Exitt.get(i));
		}
	}
	public int BinarySearch1(int arr[], int x) {
	   int lo = 0, hi = arr.length - 1;
	   while (lo <= hi) {
		   int mid = lo + (hi - lo) / 2;

	       if (arr[mid] == x)
	    	   return mid;

	       if (arr[mid] < x)
	           lo = mid + 1;

	       else
	           hi = mid - 1;
	       }
	       return -1;
	    }
	
}
