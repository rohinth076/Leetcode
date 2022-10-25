class Solution {
    String fun(String[] a){
        StringBuilder ans = new StringBuilder("");
        for(String i:a)
            ans.append(i);
        return ans.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return fun(word1).equals(fun(word2));
    }
}