import java.util.*;
public class CloneLL11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList<String> l = new LinkedList<String>();
        // Adding some elements to the LinkedList
        l.add("ram");
        l.add("shyam");
        l.add("gyan");
        l.add("dhyan");
        l.add("vyan");
        // Prints the LinkedList elements
        System.out.println("The elements of LinkedList are: "+l);
        // cloning the same above LinkedList
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: " + clone);
    }
			



	}


