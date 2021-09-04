package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringTest {

	//String is a final class : if a class is final then we can not extend that class
	//Array is a collection of similar data type
	
	public void method1() {
		String s1 = "Hi";
		System.out.println("s1 = " + s1);
		
		String obj = new String("Hello");
		System.out.println("obj = " + obj);
		
		char c1 = s1.charAt(0);
		System.out.println(c1);
		
		int len = s1.length();
		System.out.println(len);
		
		System.out.println(s1.equals(obj));
		
		//==============================
		//Array is a collection of similar data type
		//Logic
		String s2 = "Selenium";
		String revString = "";
		
		char[] arr1 = s2.toCharArray();
		
		for(int i = s2.length() - 1; i>=0; 	i--) {
			//char c2 = arr1[i];
			Character c2 = arr1[i];
			
			revString = revString + c2;
		}
	
		System.out.println(revString);
	}

	public void method2() {
		
		//int i = 10;
		
		int[] arr1 = new int[45];
		arr1[0] = 101;
		arr1[1] = 105;
		arr1[2] = 102;
		arr1[3] = 109;
		
		//System.out.println(arr1[3]);
		
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//String[] arr2 = new String[4];
		
		String[] arr2 = {"Vipul", "Abhishek", "Amit", "Java"};
		System.out.println(arr2[2]);
		
		System.out.println(arr2[5]);
		
		//collection
		//ArrayList, HashMap, Set
	}
	
	public void method3() {
		//exception is an abnormal condition who terminate program in incorrect way. program doesnt do what is supposed to do.
		//char[] arr1 = {'a', 'v', 'd'};
		/*
		char[] arr1 = new char[5];
		arr1[0] = 'A';
		
		System.out.println("arr1[0] = " + arr1[0]);  //A
		
		System.out.println("arr1[3] = " + arr1[3]);  
		
		
		int[] arr2 = new int[5];
		arr2[0] = 2;
		
		System.out.println(arr2[3]);
		
		String[] arr3 = new String[4];
		arr3[0] = "Java";
		
		System.out.println("arr3[3] = " + arr3[3]);
		*/
		
		int[] arr2 = {3, 4, 1};
		arr2[2] = 2;
		
		//System.out.println(arr2[6]);
		
		try {
			//int t = 10/0;
			//System.out.println(t);
			System.out.println(arr2[10]);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Hi");
		}
		
		catch(Exception e) {
			System.out.println("Hello");
		}
	}

	public void method4() {   //final - Keyword, finally - Block and finalize() - method
		try {
			int t = 10/2;
			System.out.println(t);
		}
		
		finally {
			//code - will get execute always
			System.out.println("will run always");
			//Exception - code - run
		}
	}
	
	public void arrayListTest() {
		//Declare ArrayList - Class
		
		//ArrayList<Integer> myL1 = new ArrayList<Integer>();
		List<Integer> myL1 = new ArrayList<Integer>();
		
		//int[] arr = new int[4];
		
		myL1.add(4);
		myL1.add(5);
		myL1.add(5);
		myL1.add(6);
		myL1.add(9);
		
		//[4, 5, 5, 6, 9]
		
		System.out.println(myL1);
		System.out.println(myL1.size());
		
		System.out.println(myL1.get(0));
		
		if(myL1.contains(5)) {
			System.out.println("Going to add element dynamically");
			
			myL1.add(1111);
			System.out.println(myL1.size());
		}
		
		System.out.println("================");
		System.out.println(myL1);
		
		myL1.add(1, 3322);
		myL1.remove(0);
		System.out.println(myL1);
	}

	public void hashSetTest() {
		//HashSet<String> mySet = new HashSet<String>();
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("B");
		mySet.add("T");
		mySet.add("Y");
		mySet.add("E");
		
		//[A, B, T, E, Y]
		
		System.out.println(mySet);
	}
	
	public static void main(String[] args) {
		StringTest obj = new StringTest();
		obj.hashSetTest();
	}
	
	//Why String class is final?
	//What is the difference between StringBuilder and StringBuffer?
}
