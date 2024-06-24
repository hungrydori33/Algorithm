

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace("A", "X").replace("B", "A").replace("X", "B");
        System.out.println(myString);
        boolean a = myString.contains(pat);
        if(a == true){
            return 1;
        }else{
            return 0;
        }
        // return answer;
    }
}