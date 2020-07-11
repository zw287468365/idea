package springboot.demo;

import java.util.Arrays;

/**
 * @author wei
 * @date 2020/7/7 0007 -  21:27
 */
public class tes {
    public static void change(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];

                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr={9,8,6,5,4,1};
        System.out.println(Arrays.toString(arr));
        tes.change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
