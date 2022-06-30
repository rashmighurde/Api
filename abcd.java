package testclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {29,45,214,34,34,2};
		   ArrayList list=new ArrayList();
		   list.add(29);
		   list.add(45);
		   list.add(214);
		   list.add(34);
		   list.add(34);
		   list.add(2);
		   
		   System.out.println(list);
		   for(Object k:list)
		   {
			   System.out.println(k);
		   }
		   System.out.println("==============================");
		   ArrayList list1=new ArrayList();

		    for(int i=0;i<a.length;i++)
		    {    if(!list1.contains(a[i]))
		         {
		    	for (int j=i+1;j<a.length;j++)
		    	{
		    		if(a[i]==a[j])
		    		{
		    			list1.add(a[i]);
		    		}
		    	}
		         }
		    }
          System.out.println(Arrays.toString(a));
		    System.out.println(list1);
			}

	}


