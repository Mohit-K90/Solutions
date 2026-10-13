class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        else if (s.length() == t.length() && s.length() == 1) return true;
        else{
              Map m = new HashMap();
              for (Integer i=0; i<s.length(); ++i)
			     if (m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i)) return false;
          return true;  

        }
}
}