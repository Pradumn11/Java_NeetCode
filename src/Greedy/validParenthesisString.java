package Greedy;

public class validParenthesisString {
    public boolean checkValidString(String s) {
        char[]arr=s.toCharArray();
        int c=0;
        int d=0;
        int star=0;
        for(char a:arr){
            if(a=='('){
                c++;
                d++;
            }
            else if(a==')'){
                c--;
                d--;
            }
            else if(a=='*'){
                c++;d--;
            }
            if(c<0)return false;
            d=Math.max(d,0);
        }
        return d==0;

    }
}
