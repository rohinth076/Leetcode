class Solution:
    def removeDuplicates(self, a: List[int]) -> int:
        
        b = set(a)
        c = list(b)
        n =len(c)
        c.sort()
        a.clear()
        for i in c:
            a.append(i)
        return n