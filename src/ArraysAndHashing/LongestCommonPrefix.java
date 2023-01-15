package ArraysAndHashing;

public class LongestCommonPrefix {


    public String longestCommonPrefixSolution(String[] strs) {

        String s=smallest(strs);
        int y= s.length();
        for(int i=0;i<y;i++){
            s=s.substring(0,y-i);
            boolean ans= true;
            for(int j=0;j<strs.length;j++){
                if(!strs[j].startsWith(s)){
                    ans =false;
                    break;
                }
            }
            if(ans==true){
                return s;
            }

        }
        return "";


    }

    public String smallest(String strs[]){
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
            if(s.length()>strs[i].length()){
                s=strs[i];
            }
        }
        return s;

    }
}
