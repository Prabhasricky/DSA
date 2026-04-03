class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] count = new int[26];

        for(int right = 0; right < s.length(); right++){

            char current = s.charAt(right);

            count[current - 'A']++;

            if(count[current -'A'] > maxFreq){
                maxFreq = count[current - 'A'];
            }

            int windowSize = right - left + 1;
            if(windowSize - maxFreq > k){
                count[s.charAt(left) - 'A'] --;
                left++;
            }

            int currentLength = right - left + 1;
            if(currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}