class Solution:
    def isValid(self, s: str) -> bool: 
        s = s.strip()
        a = []
        b ={'(' :')' ,'{' : '}','[':']'}
        for i in range(len(s)):
            if(s[i] =='(' or s[i] =='{' or s[i] =='['):
                a.append(b[s[i]]) 
            elif(len(a)!=0):
                if(a[-1] == s[i]):
                    a.pop()
                else:
                    return 0
            else:
                return 0
        return len(a)==0
        
        
        