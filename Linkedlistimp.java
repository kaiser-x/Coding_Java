import java.util.*;
public class Linkedlistimp {
	node head;
		static class node{
			int data;
			node next;
			node(int x){
				data=x;
				next=null;
			}
		}
		public static Linkedlistimp insert_at_begin(Linkedlistimp link,int  x) {
			node nn=new node(x);
			if(link.head==null)
				link.head=nn;
			else {
					nn.next=link.head;
					link.head=nn;
			}
			return link;
		}
		public  static Linkedlistimp insert_at_pos(Linkedlistimp link,int  x,int pos) {
			node nn=new node(x);

			node ptr=link.head;
			for(int i=0;i<pos-1;i++)
				ptr=ptr.next;
			nn.next=ptr.next;
			ptr.next=nn;
			return link;
		}
		public  static Linkedlistimp insert_at_end(Linkedlistimp link,int  x) {
			node nn=new node(x);
			if(link.head==null)
				link.head=nn;
			else {
				node ptr=link.head;
				while(ptr.next!=null)
					ptr=ptr.next;
				ptr.next=nn;
			}
			return link;
		}
		
		public static Linkedlistimp del_at_begin(Linkedlistimp link) {
			if(link.head==null)
				System.out.println("underfflow");
			else {
				link.head=link.head.next;
			}
			return link;
		}
		public static Linkedlistimp del_at_pos(Linkedlistimp link,int pos) {
			if(link.head==null)
				System.out.println("underfflow");
			else {
					node ptr=link.head;
					for(int i=0;i<pos-1;i++)
						ptr=ptr.next;
					ptr.next=ptr.next.next;

			}
			return link;
		}
		public static Linkedlistimp del_at_end(Linkedlistimp link) {
			
			if(link.head==null)
				System.out.println("underfflow");
			else {
				node ptr=link.head;
				while(ptr.next.next!=null)
					ptr=ptr.next;
				ptr.next=null;
			}
			return link;
		}
		public static void display(Linkedlistimp link) {
			if(link.head==null)
				System.exit(1);
			else {
				node ptr=link.head;
				while(ptr!=null) {
				System.out.printf("\n%d ",ptr.data);
				ptr=ptr.next;
				}
			}
			System.out.println();
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			Linkedlistimp link=new Linkedlistimp();
			link.head=null;
			int n=sc.nextInt();
			link=insert_at_end(link,87);
			for(int i=0;i<n;i++)
				link=insert_at_end(link,sc.nextInt());
			link.display(link);
			link=del_at_begin(link);
			link=del_at_pos(link, 4);
			link=del_at_end(link);
			link.display(link);
			sc.close();
		}
		
}
