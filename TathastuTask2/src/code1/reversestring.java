package code1;
import java.io.*;
import java.util.Scanner;
public class reversestring {
	    public static void main (String[] args) {
	       
	        String str= "snehal", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("snehal"); 
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	}

