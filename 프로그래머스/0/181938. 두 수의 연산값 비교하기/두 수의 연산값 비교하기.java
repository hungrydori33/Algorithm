class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 2 * a * b;
        String convertA = a + "";
        String convertB = b + "";
        String sumAB = convertA + convertB;
        int result = Integer.parseInt(sumAB);
        if(c > result){
            return c;
        }else if(c == result){
            return result;
        }else{
            return result;
        }
        
    }
}