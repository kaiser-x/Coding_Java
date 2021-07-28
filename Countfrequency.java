import java.util.*;
public class Countfrequency {
	public int countFreq(int arr[],int n,int k) {
		Map<Integer,Integer>hm=new HashMap<>();
		int c=0;
		for(int i=0;i<n;i++) {
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i], 1);
			else {
				int x=hm.get(arr[i]);
				hm.put(arr[i],x+1);
			}
		}
		 for (Map.Entry<Integer,Integer> m : hm.entrySet())
	        {
	            Integer temp =m.getValue();
	            if (temp > (n/k))
	                c++;
	        }
		
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,3,2};
		Countfrequency cf=new Countfrequency();
		int x=cf.countFreq(arr,4,3);
		System.out.print(x);
	}

}
