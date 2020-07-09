class Solution:
    def convert(self, s: str, n: int) -> str:
        
        a = []
        b = ""
        for i in range(n):
            a.append(b)
        if(n==1):
            return s
        f = 1
        c = 0
        for i in s:
            if(f==1):
                a[c] = a[c] + i
                if(c+1 == n):
                    f = 0
                    c = c - 1
                else:
                    c = c + 1
            else:
                a[c] = a[c] + i
                if(c-1==-1):
                    f = 1
                    c = c + 1
                else:
                    c = c - 1
        for i in range(n):
            b = b + a[i]
        return b