class Solution {
    String[] Phone={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    void bt(List<String>res, String digits,int i,StringBuffer s){
        if(s.length()==digits.length()){
            res.add(s.toString());
            return;
        }
        String letters = Phone[digits.charAt(i)-'0'];
        for(char c: letters.toCharArray()){
            s.append(c);
            bt(res,digits,i+1,s);
              s.deleteCharAt(s.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        bt(res, digits, 0, new StringBuffer());
        return res;
    }
}