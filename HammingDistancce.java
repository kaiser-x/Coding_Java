
public class HammingDistancce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given two integers, the task is to find the hamming distance between two integers. Hamming Distance between two integers is the number of bits that are different at the same position in both numbers. 
//		Examples: 
//		Input: n1 = 9, n2 = 14
//		Output: 3
//		9 = 1001, 14 = 1110
//		No. of Different bits = 3
//		Input: n1 = 4, n2 = 8
//		Output: 2
		int a=10,b=20,count=0;
		int n=a^b;
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		System.out.println(count);
	}

}
