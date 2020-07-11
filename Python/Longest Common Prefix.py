class Solution:
    def longestCommonPrefix(self, s: List[str]) -> str:
        
        f = 1
        a = ""
        if(len(s)<1):
            return a
        for i in range(len(s[0])):
            for j in range(1,len(s)):
                
                if(len(s[j])>i and s[0][i]==s[j][i]):
                    c = 1
                else:
                    f = 0
                    break
            if(f==1):
                a += s[0][i]
            else:
                break
        return a
        