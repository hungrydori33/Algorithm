class Solution {
    public String solution(String cipher, int code) {
        
        String answer = "";
        
        for(int i = 1; i <= cipher.length() / code; i++){
            answer += cipher.charAt(code * (i) -1);
        }
        System.out.println(cipher.charAt(code-1));
        return answer;
    }
}