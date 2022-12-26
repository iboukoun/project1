package Blessing;

import java.util.HashMap;

public class ThecnicalQ2 {
    //find the lenght og largest subarray with 0 sum
        public static void main(String[] args){
            int[] arr ={15,-2,2,-8,1,7,10,23};
            int len = arr.length;
            System.out.println(maxlent(arr,len));

        }
        public static int maxlent( int[] arra, int n){
           // int maxLen(int arr[],int n)
           HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
            n = arra.length;
           int maxi = 0;
           int sum =0;
           for(int i = 0; i<n; i++) {
               sum += arra[i];
               if (sum == 0) {
                   maxi = i + 1;
               } else {
                   if (mpp.get(sum) != null) //  you can also use if(mpp.containsKey(sum));
                   {
                       maxi = Math.max(maxi, i - mpp.get(sum));
                   } else {
                       mpp.put(sum, i);


                   }
               }
           }
            return maxi; }
}






