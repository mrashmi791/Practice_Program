package linklist.practice;

public class AlternateNumber {
	Node head;
	
	class Node{
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		
		AlternateNumber l = new AlternateNumber();
		l.add(80);
		l.add(77);
		l.add(55);
		l.add(40);
		l.add(20);
		l.add(11);
		l.display();
		System.out.println();
		l.AlternateEvenOdd();
		System.out.println();
		l.display();

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
}
