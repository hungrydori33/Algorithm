class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            answer = -1;
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}



// import java.util.stream.IntStream;

// class Solution {
//     public int solution(int[] numList) {
//         return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
//     }
// }


