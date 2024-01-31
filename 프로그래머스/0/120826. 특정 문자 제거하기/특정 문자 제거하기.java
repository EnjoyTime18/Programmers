class Solution { //리펙토링해서 다시 풀기.. 다른 사람의 풀이 답안 참고하여...
    public String solution(String my_string, String letter) {
//         char[] cstr = my_string.toCharArray();
    
//         //letter를 제거한 새로운 배열 생성시 배열 크기 값 주기 위한 for문
//         int charindex = 0;
//         for(int i=0; i<cstr.length; i++) {
//             if(cstr[i] != letter.charAt(0)) {
//                 charindex++;
//             }
//         }
        
//         char[] ncstr = new char[charindex];
//         int index = 0; //처음에 인덱스0으로 고정값 주어 문자열값 대입하기 위한 선언.
//         for(int i=0; i<cstr.length; i++) {            
//             if(cstr[i] != letter.charAt(0)) {
//                 ncstr[index] = cstr[i];
//                 index++;
//             }
//         }        
//         return String.valueOf(ncstr);
        
        return my_string.replace(letter,"");
    }
}

// class Solution {
//     public String solution(String my_string, String letter) {
//         String answer = "";
//         for (int i=0; i<my_string.length(); i++) {
//             if (my_string.charAt(i) != letter.charAt(0)) {
//                 answer += my_string.charAt(i);
//             }
//         }
//         return answer;
//     }
// }
// class Solution {
//     public String solution(String my_string, String letter) {
//         String answer = "";
//         char c = letter.charAt(0);
//         for(int i=0; i<my_string.length(); i++){
//             char temp = my_string.charAt(i);
//             if(temp==c) continue;
//             answer+=temp;

//         }

//         return answer;
//     }
// }
