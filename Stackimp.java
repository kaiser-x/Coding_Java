import java.util.*;
public class Stackimp {
	int arr[];
	int top;
	int size;
	Stackimp(int size){
		arr=new int[size];
		top=-1;
		this.size=size;
	}
	public void push(int x) {
		if(top==size-1)
			System.out.printf("overflow\n");
		else {
		arr[++top]=x;
	    }
	}
	public int peek() {
		if(top==-1)
			System.exit(1);
		else
			return arr[top--];
		return -1;
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Underflow");
			System.exit(1);
		}
		return arr[top--];
	}
	boolean isFull() {
		if(top==size-1)
			return true;
		else
			return false;
	}
	boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}

	public void display() {
		if(isEmpty())
			System.out.println("Underflow");
		else {
			while(!isEmpty())
				System.out.printf("%d ",pop());
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Stackimp s=new Stackimp(n);
		for(int i=0;i<s.size;i++)
			s.push(sc.nextInt());
		s.pop();
		s.isEmpty();
		s.isFull();
		s.pop();
		s.display();
		sc.close();
	}	
}
