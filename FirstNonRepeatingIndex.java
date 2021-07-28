//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//
//

import java.util.*;
//O(n^2) complexity
//class Solution {
//    public int firstUniqChar(String s) {
//        int f;
//        for(int i=0;i<s.length();i++){
//            f=1;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(j)==s.charAt(i)){
//                    f=0;
//                    break;
//                }
//            }
//            if(f==1)
//                return i;
//        }
//        return -1;
//    }
//}
class Solution {
    public int firstUniqChar(String s) {
        int f;
        char arr[]=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],1);
            else{
                int c=hm.get(arr[i]);
                hm.put(arr[i],c+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1){
                return i;
            }
        }
        return -1;
    }
}
public class FirstNonRepeatingIndex {

	public static void main(String[] args) {
		String s="aaabaadddcccc";
		Solution obj=new Solution();
		System.out.println(obj.firstUniqChar(s));

	}

}
