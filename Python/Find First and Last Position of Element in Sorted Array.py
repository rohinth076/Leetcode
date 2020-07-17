class Solution:
    def searchRange(self, a: List[int], t: int) -> List[int]:
        
        b = []
        f = 0
        for i in range(len(a)):
            if(a[i]==t and f==0):
                b.append(i)
                f = 1
            elif(a[i]==t and f==1):
                b.append(i)
                f = 2
            elif(a[i] == t):
                b[1] = i
        if(f==1):
            b.append(b[0])
        if(f==0):
            return [-1,-1]
        return b