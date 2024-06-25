class Solution {
    public int solution(int n) {
        int answer = n % 7 != 0 ? (n / 7) + 1 : n / 7 ;
        return answer;
    }
}
//  n      answer
// 1~7       1 = n / 7 + 1
// 8~14      2 = n / 7 + 1
// 15~21     3 
// 22~28     4