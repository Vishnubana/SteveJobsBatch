package com.main;

public class StringOperations {
	public static void main(String[] args) {
		
	String str="Testwedfghm,oiuhygf moijhbgv kjhgfdc vnmkjhgfcd nmkjhgv ";
	String str1="Testwedfghm,oiuhygf moijhbgv kjhgfdc vnmkjhgfcd nmkjhgv ";
	String str2="TestWedfghm,oiuhygf moijhBgv kjhgfdc vnmkjhgfcd nmkjhgv ";
	
	
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.charAt(6));
	System.out.println(str.codePointAt(48));
	System.out.println(str.codePointBefore(49));
	System.out.println(str.codePointCount(21,43));
	System.out.println(str.compareTo(str1));
	System.out.println(str.compareToIgnoreCase(str2));
	System.out.println(str.concat("Concatinate"));
	System.out.println("Contains::");
	System.out.println(str.contains("nmkjhgv"));
	System.out.println(str.contains("nkmjhgv"));
	System.out.println("Content Equals::");
	System.out.println(str.contentEquals("Testwedfghm,oiuhygf moijhbgv vnmkjhgfcd nmkjhgv "));
	System.out.println(str.contentEquals("Testwedfghm,oiuhygf moijhbgv kjhgfdc vnmkjhgfcd nmkjhgv "));
	System.out.println("Ends With::");
	System.out.println(str.endsWith("nmkjhgv "));
	System.out.println(str.endsWith("nmjhgv "));
	System.out.println("------------");
	
	System.out.println(str.equalsIgnoreCase(str2));
	
	
	
}
}
