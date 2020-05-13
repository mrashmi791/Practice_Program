package circularlinklist.practice;



public class CircularLinkedList {
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList();
		
		list.insert(4);
		list.insert(44);
		list.insert(32);
	
//		list.display(head);
		list.print(head);
		
		 list.checkList(head);

		
		

	}

	

	public void insert(int d) {
		Node n = new Node(d);
		if(head == null) {
			head = n;
			head.next = head;
			
		} else {
			n.next = head.next;
			head.next = n;
			
		}
			}
	
	public void print(Node head) {
		Node temp;
		temp = head.next;
		if(head != null) {
			System.out.print(head.data+" ");
			
		}
		
		while (temp != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
	}
	public void display(Node head) { 
	    Node temp; 

	    temp = head.next; 
	    do { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	     
	    } 
	    while(temp != head.next); 
	  
	} 
	
	
	public  void checkList(Node head) {
		boolean flag = false;
		Node fast = head;
		Node slow = head;
		while(fast !=null && slow != null && slow.next != null) {
			fast = fast.next;
			slow = slow.next.next;
			if(fast == slow) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Circular linked list");
		} else {
			System.out.println("Not circular linked list");
		}

		 
	}
}


