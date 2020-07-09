class Solution:
    def longestPalindrome(self, a: str) -> str:
        
        c = 0
        d = ""
        for i in range(len(a)):
            b = ""
            for j in range(i,len(a)):
                b = b + a[j]
                if(b == b[::-1] and len(b)>c):
                    c = len(b)
                    d = b
            if(c>len(a)/2):
                break
        return d