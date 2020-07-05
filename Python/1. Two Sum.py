class Solution:
    def twoSum(self, a: List[int], t: int) -> List[int]:
        b = []
        
        for i in range(len(a)-1):
            for j in range(i+1,len(a)):
                if(a[i] + a[j] == t):
                    b.append(i)
                    b.append(j)
                    return b