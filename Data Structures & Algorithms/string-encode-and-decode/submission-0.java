class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String st : strs){
            str.append(st.replace("#","##")).append(" # ");
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();
        String[] arr = str.split(" # ",-1);
        for(int i=0;i<arr.length-1;i++){
            out.add(arr[i].replace("##","#"));
        }
    return out;
    }
    
}
