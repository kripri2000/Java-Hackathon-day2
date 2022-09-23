import java.util.LinkedList;

public class JoinTwoLL12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        LinkedList<Integer> merge = new LinkedList<Integer>();
        merge.addAll(l1);
        merge.addAll(l2);
		System.out.println("First LL : "+l1);
		System.out.println("Second LL : "+l2);
		System.out.println("Joined : "+merge);
	}
	

	}


