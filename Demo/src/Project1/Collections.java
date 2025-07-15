package Project1;
import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		//Array list
//		ArrayList obj = new ArrayList();
//		
//		obj.add("Sai");
//		obj.add("Asfaq");
//		obj.add("Bararni");
//		obj.add("vishnu");
//		obj.addFirst("Shree");
//		obj.addLast("Ragul");
////		obj.set(2, "kowshik");
////		obj.remove(0);
//		obj.removeFirst();
//		obj.removeLast();
//		System.out.println(obj);
//		System.out.println(obj.size());
//		System.out.println(obj.get(2));
//		System.out.println(obj.getFirst());
//		System.out.println(obj.getLast());


		int a[]={12,55,3,64,50,14}; 
		
		
		
		   for(int i=0;i<a.length;i++){
			   
		    for(int j=i+1;j<a.length;j++){ 
		    	
		     int b=0; 
		     
		     if(a[i]>a[j]){
		    	 
		      b=a[j]; 
		      a[j]=a[i]; 
		      a[i]=b; 
		       
		     } 
		    } 
		   } 
		   for(int k=0;k<a.length;k++){ 
		    System.out.println(a[k]); 
		     
		   } 
		   System.out.println("The Second maximum number is" + a[a.length-2] 
		);
	}

}
