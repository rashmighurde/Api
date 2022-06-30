package testclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftingOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[]= {1,3,5,7,9};
		  int n=2;
		  for(int j=0;j<n;j++)
		  {
       int last=a[a.length-1];
       for(int i=a.length-1;i>0;i--) //1357_
       {
    	   a[i]=a[i-1];
       }
       a[0]=last;
	System.out.println("Right shifting of Array by 2--->"+ Arrays.toString(a));
	}
		  
		  System.out.println("================================================");
		  
		  
		  int b[]= {1,3,5,7,9};
		  
		  int n1=2;
		  for(int j=0;j<n1;j++)
		  {
		  int first=b[0]; 
		  for(int i=0;i<b.length-1;i++) //_3579
		  {
			  b[i]=b[i+1];
		  }
		  b[b.length-1]=first;
		  System.out.println("Left shifting of an array by 2--->"+ Arrays.toString(b));
		  }
		  
	
	String c="abbccc";
	 ArrayList list=new ArrayList();
	     for(int i=0;i<c.length();i++)
		{  int count=0;
		      if(!list.contains(c.charAt(i)))  //
		      {
			 for(int j=i+1; j<c.length();j++)	//i=1,2,3 j=4
				{
				if(c.charAt(i)==c.charAt(j))
				    {
					count++;
					list.add(c.charAt(i));    //bbc
			    	}

				}
	//System.out.println(a.charAt(i)+ "    repeted   " + count + "times" );
  System.out.println(list.toString());
		      }
		}

	}	
}
