
public class linkedl {
	class node{
		int data;
		node next;
		node(int x){
			data=x;
			next=null;
		}
	}
	node push(node head,int x) {
		node nn=new node(x);
		if(head==null)
			head=nn;
		else {
			node ptr=head;
			while(ptr.next!=null)
				ptr=ptr.next;
			ptr.next=nn;
		}
		return head;
	}
	void display(node head) {
		node ptr=head;
		while(ptr!=null) {
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
	void midele(node head) {
		node ptr1=head;
		node ptr2=head;
		while(ptr2!=null&&ptr2.next!=null)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
		}
		System.out.println("middlee"+ptr1.data);
	}
	public static void main(String[] args) {
		node head=null;
		linkedl li=new linkedl();
		for(int i=0;i<8;i++)
			head=li.push(head, i);
		li.display(head);
		li.midele(head);
	}

}
