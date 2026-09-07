class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            char c = s2.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0) + 1);

            if (right - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);

                map2.put(leftChar, map2.get(leftChar) - 1);

                if (map2.get(leftChar) == 0) {
                    map2.remove(leftChar);
                }

                left++;
            }

            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}