package Recursion;

public class SearchElement {

    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,10};
        int var=4;
        System.out.println(check(arr,var,0));
    }

    public static boolean check(int arr[],int tar,int index){
        if (arr.length==index){
            return false;
        }

        return arr[index]==tar || check(arr,tar,index+1);
    }
}
