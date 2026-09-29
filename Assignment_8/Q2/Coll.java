



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sorted implements Comparator<String>{
	public int compare(String s1,String s2) {
		return s1.compareTo(s2);
	}
}
public class Coll {
	
	
	
   public static void main(String[]args) {
	  ArrayList<String> list = new ArrayList<>();
	 Collections.addAll(list,  "Red",
    "Green",
    "Blue",
    "Yellow",
    "Orange",
    "Pink",
    "Purple",
    "Black",
    "White",
    "Gray",
    "Brown",
    "Violet",
    "Indigo",
    "Cyan",
    "Magenta");
	 
	 System.out.println("Before Sorting");
	for(String s:list) {
		System.out.println(s);
	}
	Collections.sort(list,new sorted());
	System.out.println("---------------------------------------");
	System.out.println();
	System.out.println("After Sorting");
	for(String s:list) {
		System.out.println(s);
	}
   }
   
   
}
