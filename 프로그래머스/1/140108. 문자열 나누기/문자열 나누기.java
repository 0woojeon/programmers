class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt = 1;

        char prevChar = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
          
            char currentChar = s.charAt(i);
            
          
            if (cnt == 0) {
                prevChar = currentChar;
                cnt++;
                continue;
            }
            
            if (prevChar == currentChar) {
                cnt++; 
            } else {
                cnt--; 
            }
            
           
            if (cnt == 0) {
                answer++;
            }
        }
        
       
        if (cnt != 0) {
            answer++;
        }
                
        return answer;
    }
}
