class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){
                map.computeIfAbsent(sorted,k -> new ArrayList<>()).add(s);
            } else{
                map.get(sorted).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
