package solutions;

public class LC942_DIStringMatch {
    public int[] diStringMatch(String s) {
        int n=s.length();

        int [] result = new int [n+1];
        int low=0;

        int high=n;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                result[i]=low++;
            }else{
                result[i]=high--;
            }
        }

        result[n]=high;

        return result;
    }
}
