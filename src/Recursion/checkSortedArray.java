package Recursion;

public class checkSortedArray {
    public static void main(String[] args) {
       int arr[]={1,2,3,5,2};
        System.out.println(check(arr,0));
    }

    public static boolean check(int a[],int i){
        if (i>=a.length-1){
            return true;
        }
       return a[i]<a[i+1] && check(a, i+1);
    }
}
