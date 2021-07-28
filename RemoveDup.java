import java.util.*;


public class RemoveDup {
	static void removedup(int arr[],int n) {
		Arrays.sort(arr);
		int i=0;
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j])
				arr[++i]=arr[j];
//			System.out.print(arr[j]+" ");
		}
		for(int j=0;j<=i;j++)
			System.out.print(arr[j]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		removedup(arr,n);
		sc.close();
		
	}

}
