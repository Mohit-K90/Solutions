class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            map.put(c, map.getOrDefault(c, 0) + 1);

            if (map.get(c) > maxFreq) {
                maxFreq = map.get(c);
            }

            int replacements = (right - left + 1) - maxFreq;

            while (replacements > k) {

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                left++;
                replacements = (right - left + 1) - maxFreq;
            }

            int currmax = right - left + 1;

            if (currmax > max) {
                max = currmax;
            }
        }

        return max;
    }
}