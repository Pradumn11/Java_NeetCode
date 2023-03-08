package Recursion;

public class Palindrome {

    public static boolean isPalindrome(int x) {

        if(x<0 || (x!=0 && x%10==0)) return false;
        if (x==0)return true;
        int num=(int)Math.log10(x)+1;
        return x==rev(x,num);

    }

    public static int rev(int x, int args){
        if(x/10==0)return x;
        int rem=x%10;
        return rem * (int)Math.pow(10,args-1) + rev(x/10,args-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
