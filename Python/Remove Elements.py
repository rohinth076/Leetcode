class Solution:
    def removeElement(self, a: List[int], t: int) -> int:
        
        c = 0
        b = []
        n = len(a)
        i = 0
        while(i < n):
            if(a[i] == t):
                a[i] = a[n-1]
                n = n - 1
            else:
                i = i + 1
        return n
               