import java.util.*;
public class RemoveFirstLL13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating an LinkedList
        LinkedList<String> list = new LinkedList<String>();
  
        // Use add() method to add elements in the list
        list.add("hello");
        list.add("for");
        list.add("bye");
        list.add("world");
        list.add("cat");
  
        // Displaying the list
        System.out.println("LinkedList:\t" + list);
  
          
        // Remove the head using remove()
        System.out.println("The first element is removed:\t" + list.removeFirst());
  
        System.out.println("Final LinkedList:\t" + list);
    }
}
	


