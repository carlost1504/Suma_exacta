package Ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ob=new Main();
		ob.createArray();
		
	}
	
	
	public int binarySearch(int arr[], int lo, int hi, int x) {
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
	
	public void createArray() {
		int arr[];
		int longg = 0;
		ArrayList<String> Exit = new ArrayList<String>();
		ArrayList<String> Exitt = new ArrayList<String>();
		ArrayList<int[]> sum = new ArrayList<int[]>();
		ArrayList<int[]> sum1 = new ArrayList<int[]>();
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
		    	int[] suma= {arr[i],arr[position]};
		    	sum.add(suma);
		        String n2=("Element found at index: " + arr[position] + "valor busqueda "+ arr[i] );
		        Exit.add(n2);
		    }
		    int position1 = BinarySearch1( arr, x);
		    if (position1 == -1) {
		    	String n1=("Element not found !!!");
		    	Exitt.add(n1);
		    }
		    else {
		    	int[] suma= {arr[i],arr[position]};
		    	sum1.add(suma);
		        String n2=("Element found at index: " + arr[position] + "valor busqueda "+ arr[i] );
		        Exitt.add(n2);
		    }
	    }
	    
	    int[] sumados=busqueda( sum);
	    System.out.println(Arrays.toString(sumados));
	    int[] sumados1=busqueda( sum1);
	    for (int i = 0; i < Exit.size(); i++) {
			System.out.println(i+ "- "+ Exit.get(i));
		}
	    for (int i = 0; i < Exit.size(); i++) {
			System.out.println(i+ "- "+Exitt.get(i));
		}
	    //String t=("Peter should buy books whose prices are "+sumados[0]+ "and"+sumados[1]);
	    //String tr=("Peter should buy books whose prices are "+sumados1[0]+ "and"+sumados1[1]);
	    //System.out.println(t);
	    //System.out.println(tr);
	}
	
	
	public int[] busqueda(ArrayList<int[]> num) {
		int[] sum1 = new int[num.size()];
		for(int i=0;i<num.size();i++) {
			int[] n1=num.get(i);
			int sum=n1[1]-n1[0];
			sum1[i]=sum;
		}
		System.out.println(Arrays.toString(sum1));
		int mayor, menor;
        mayor = menor = sum1 [0];
       
        for (int i = 0; i < sum1.length; i++) {
            if(sum1 [i] > mayor) {
                mayor = sum1[i];
            }
            if(sum1[i]<menor) {
                menor = sum1[i];
            }
        }
        int[] nu2=new int[2];
        for (int i = 0; i < sum1.length; i++) {
        	int x= sum1[i]+menor;
        	int validation= BinarySearch1( sum1, x);
        	if(validation !=-1 && validation !=0) {
        		nu2=num.get(i);
        		System.out.println(Arrays.toString(nu2));
        		return nu2;
        	}
        }
		
		return null;
		
	}
	
}
