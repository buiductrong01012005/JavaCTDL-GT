import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Bai4_3Sum {

    public static void main(String[] args) {

        In in = new In("F:\\Jav\\algs4-data\\4Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();
        int len=a.length;
        a=Arrays.stream(a).sorted().toArray();
        for(int i=0;i<len-2;i++){
            int left=i+1;
            int right=len-1;
            while(left<right){
                int sum=a[i]+a[left]+a[right];
                if(sum<0){
                    left++;
                } else if (sum>0) {
                    right--;
                }else {
                    System.out.println(a[i]+" "+a[left]+" "+a[right]);
                    left++;
                    right--;
                }
                while(a[left]==a[left-1]){
                    left++;
                }
                if(right<len-1){
                    while(a[right]==a[right+1]){
                        right--;
                    }
                }
            }
        }


    }
}