package cloud.cloudvandana.pack;

import java.util.Random;

public class Shuffle {
	public static void main(String[] args) {
	      int[] a= {1,2,3,4,5,6};
	      
	      for(int i=0;i<a.length;i++) {
	    	  int index=new Random().nextInt(a.length-i);
	    	  System.out.println(index);
	    	  int temp=a[i];
	    	  a[i]=a[index];
	    	  a[index]=temp;
	    	  
	      }
	      for(int i=0;i<a.length;i++) {
	    	  System.out.print(a[i]+" ");
	      }
	     
	  
		}
}
