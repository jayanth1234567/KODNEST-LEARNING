package Linked_List;

public class LL {
	private Node head;
	private Node tail;
	private int size; 
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value=value;
		}
		public Node(int value, Node next ) {
			this.value=value;
			this.next=next;
		}
	}
	public void minsert(int value,int index) {
		if(index==0) {
			add(value);
			return;
		}
		if(index==size) {
			insert(value);
			return;
		}
		
	}
	
	public void insert(int data) {
		if(tail==null) {
			add(data);
			return;
		}
		Node node=new Node(data);
		tail.next=node;
		tail=node;
		
	}
	
	public void add(int data) {
		Node node=new Node(data);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size +=1;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value +" -> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
}
