package Innovators;

public class sort_merge_twoarrays {

	/*public static void main(String[] args) {
		int[] a1 = {11, 34, 66, 75};
	      int n1 = a1.length;
	      int[] a2 = {1, 5, 19, 50, 89, 100};
	      int n2 = a2.length;
	      
	      int n3;
	      if(a1.length<a2.length){
	    	   n3=a2.length;
	      }else if(a1.length== a2.length){
	    	  n3 = a2.length;
	      }else{
	    	  n3 = a1.length;
	      }
	      System.out.println("index of a3 is "+n3);
	      int[] a3 = new int[n3];
	      

	    	  for(int i = 0; i<n1; i++){
		    	  for(int j=0; j<n2; j++){
		    		  for(int k = 0; k<n3; k++){
			    		  if(a1[i]<a2[j]){
			    			  a3[k] = a1[i];
			    			  System.out.println(a3[i]+","+a1[i]);
			    		  }else if(a1[i] == a2[j]){
			    			  a3[k]=a1[i];
			    			  System.out.println(a3[i]+","+a1[i]);
			    		  }else{
			    			  a3[k] = a2[j];
			    			  System.out.println(a3[k]);
			    		  }
			    			  
		    	  }
		      }
	      
	      
	      for(Integer m: a3){
	    	  System.out.println("a3 values "+ m);
	      }
	      
	      
	      
	      
	      
	     /* int[] a = new int[a1.length + a2.length];
	      int i = 0, j = 0, k = 0, x;
	     // System.out.print("Array 1: ");
	      //for (x = 0; x < a1.length; x++)
	        // System.out.print(a1[x] + " ");
	     // System.out.print("\nArray 2: ");
	     // for (x = 0; x < a2.length; x++)
	       //  System.out.print(a2[x] + " ");
	      a3[]
	      try {
	      for ( i=0; i<n1; i++)
	      {
	    	  for ( j=0; j<n2; j++)
	      
	      {
	    		  if(a1[i] < a2[j])
	     {
	    	  a3[k] = a1[i];
	      		k=k+1;
	      		
	      }
	      else {
	    	  a3[k] = a1[j];
	      		k=k+1;
	      		
	      }
	      
	      }
	      }
	       
	      System.out.println(a3[k]);
	      }
	      catch(ArrayIndexOutOfBoundsException e) {
	      
	      }*/
	      
	     /* while (i < a1.length && j < a2.length) {
	         if (a1[i] < a2[j])
	            a3[k++] = a1[i++];
	         else
	            a3[k++] = a2[j++];
	      }
	      while (i < a1.length)
	         a3[k++] = a1[i++];
	      while (j < a2.length)
	         a3[k++] = a2[j++];*/
	     /* System.out.print("\nArray after merging: ");
	      for (x = 0; x < a1.length + a2.length; x++)
	         System.out.print(a3[x] + " ");
*/
	//}

}
