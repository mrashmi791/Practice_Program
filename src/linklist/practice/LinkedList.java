package linklist.practice;

import java.util.Scanner;

public class LinkedList {
	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList l = new LinkedList();
		for(int i = 0; i < n;i++) {
			l.add(sc.nextInt());
		}
//		l.add(80);
//		l.add(77);
//		l.add(55);
//		l.add(40);
//		l.add(20);
//		l.add(11);
		l.display();
		System.out.println();
//		l.AlternateEvenOdd();
//		l.data();
//		head = l.reverse(head);
//		l.print(head);
//		System.out.println();
		l.remove();
		l.display();
//		l.large();
//		l.small();
//		l.sortList();
//		l.display();
//		System.out.println();
//		System.out.println("Enter node from last");
//		int n = sc.nextInt();
//		l.printNode(n);
//		l.middleNode();
//		System.out.println("Before swapping: ");
//		head = l.swapNode(head, 9, 33);
//		l.print(head);
//		System.out.println();
//		System.out.println("Before Moving: ");
//		l.moveToFront();
//		l.display();

	}

	public void add(int d) {

		Node n = new Node(d);
		if (head == null) {
			head = n;
			return;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	void print(Node node) {
		
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}



	public Node reverse(Node head) {
		Node prev = null;
		Node temp = head;
		Node next = null;
		while (temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
		return head;

	}
	public void remove() {
		Node temp = head;
		while(temp != null) {
			Node temp2 = temp;
			while(temp2.next != null) {
				if(temp2.next.data == temp.data) {
					temp2.next = temp2.next.next;
				} else {
					temp2 = temp2.next;
				}
				
			}
			temp = temp.next;
		}
	}
	
	public void large() {
		Node temp = head;
		int data = temp.data;
		while(temp.next != null) {
			if( temp.next.data > data) {
				data = temp.next.data;
			}
			temp = temp.next;
		}
		System.out.println("large : "+data);
	}

	public void small() {
		Node temp = head;
		int data = temp.data;
		while(temp.next != null) {
			if( temp.next.data < data) {
				data = temp.next.data;
			}
			temp = temp.next;
		}
		System.out.println("Small : "+data);
	}

	public void sortList() {
		Node temp = head, index = null;
		int data;
		
		while(temp != null) {
			index = temp.next;
			while (index != null) {
				 if(temp.data > index.data) {  
                     data = temp.data;  
                     temp.data = index.data;  
                     index.data = data;  
                 }  
                 index = index.next;  
			}
			temp = temp.next;
		}
	}
	
	public void printNode(int n) {
		
		int length =0;
		Node temp = head;
		Node temp2 = head;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		if(length <= n) {
			return;
		}
		
		for(int i = 1;i < length-n+1;i++) {
			temp2 = temp2.next;
		}
		System.out.println(temp2.data);
	}
	
	public void middleNode() {
		int l = 0;
		Node temp = head;
		Node temp2 = head;
		while(temp != null) {
			l++;
			temp = temp.next;
		}
		for(int i = 1; i < l/2+1; i++) {
			temp2 = temp2.next;
		}
		System.out.println(temp2.data);
		
	}
	
	
	public int middleNode(Node head) {
		Node temp = head;
        Node temp2 = head;

        while(temp2 != null && temp2.next != null) {
           temp2 = temp2.next.next;
           temp = temp.next;
        }
        return temp.data;
	}
	
	
	
	
	public Node swapNode(Node head, int x, int y) {
		Node temp2 = head;
		
		if(x == y) {
			return null;
		}
		Node a = null, b = null;
		
		while(head.next != null) {
			if((head.next).data == x) {
				a = head;
			}
			else if((head.next).data == y) {
				b = head;
			}
			head = head.next;
		}
		
		 if (a != null &&  b!=null) {  
			    Node temp = a.next;  
			    a.next = b.next;  
			    b.next = temp;      
			    temp = a.next.next;  
			    a.next.next = b.next.next;  
			    b.next.next = temp;  
		 }  
			  return temp2; 
	}
	
	public void moveToFront() {
		Node temp = head;
		Node prev = null;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		temp.next = head;
		head = temp;
	}
	
	public void data() {
		Node evenStart = null; 
        Node evenEnd = null; 
        Node oddStart = null; 
        Node oddEnd = null; 
        Node currentNode = head; 
          
        while(currentNode != null) { 
            int element = currentNode.data; 
              
            if(element % 2 == 0) { 
                  
                if(evenStart == null) { 
                   evenStart = currentNode;
                    evenEnd = evenStart;
                } else { 
                    evenEnd.next = currentNode; 
                    evenEnd = evenEnd.next; 
                } 
                  
            } else { 
                  
                if(oddStart == null) { 
                    oddStart = currentNode; 
                    oddEnd = oddStart; 
                } else { 
                    oddEnd.next = currentNode; 
                    oddEnd = oddEnd.next; 
                } 
            } 
               currentNode = currentNode.next;     
        } 
    
        
        
        if(oddStart == null || evenStart == null) { 
            return; 
        } 
          
        evenEnd.next = oddStart; 
        oddEnd.next = null; 
        head=evenStart; 

		}
	
	public void AlternateEvenOdd() {
		Node tempi = head;
		while(tempi != null) {
			
			Node tempj = tempi.next;
			
			while(tempj != null) {
				
				if((tempi.data % 2 == 0 && tempj.data %2 == 0)|| (tempi.data % 2 != 0 && tempj.data %2 != 0)) {
					tempj = tempj.next;
					continue;
				} else {
					int data = tempj.data;
					tempj.data = tempi.next.data;
					tempi.next.data = data;
					break;
				}
			}
			tempi = tempi.next;
		}
	}
		
}
