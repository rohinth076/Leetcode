class Solution:
    def countAndSay(self, n: int) -> str:
        
        a = [1]
        b = []
        
        for i in range(1,n):
            c = 1
            m = len(a)
            for j in range(len(a)):
                if(j+1 == m):
                    b.append(c)
                    b.append(a[j])
                elif(a[j]==a[j+1]):
                    c = c+1
                else:
                    b.append(c)
                    b.append(a[j])
                    c = 1
            a.clear()
            a = b.copy()
            b.clear()
        s = 0
        for i in range(len(a)):
            s = s*10 + a[i]
        s =str(s)
        return s