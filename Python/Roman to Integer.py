class Solution:
    def romanToInt(self, s: str) -> int:
        
        a = {'M' : 1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5,'I':1}
        
        b = []
        b.append(a[s[0]])
        j =0
        for i in range(1,len(s)):
            if(s[i]==s[i-1]):
                b[j] += a[s[i]]
            else:
                if(b[j]<a[s[i]]):
                    b[j] *= -1
                j += 1
                b.append(a[s[i]])
        l = 0
        for i in range(len(b)):
            l += b[i]
        print(b)
        return l