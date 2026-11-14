class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }
    
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (i < s.length()) {
                int delim = s.indexOf('#', i);
                int length = Integer.parseInt(s.substring(i, delim));
                i = delim + 1;
                res.add(s.substring(i, i + length));
                i += length;
            }
        }
        return res;
    }
}
