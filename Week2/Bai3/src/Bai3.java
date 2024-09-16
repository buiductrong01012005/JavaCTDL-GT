import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        In in = new In("F:\\Jav\\algs4-data\\4Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        int left=0,right=a.length-1;
        while(left<right){
            int sum=a[left]+a[right];
            if(sum<0){
                left++;
            }else if(sum>0){
                right--;
            }else{
                System.out.println(a[left]+" "+a[right]);
                left++;
                right--;
            }
            if(left>0){
                while(a[left]==a[left-1]){
                    left++;
                }
            }
            if(right<a.length-1){
                while(a[right]==a[right+1]){
                    right--;
                }
            }
        }
        // xử lý dữ liệu trong mảng a
        //StdArrayIO.print(a); // in mảng ra màn hình
    }
}