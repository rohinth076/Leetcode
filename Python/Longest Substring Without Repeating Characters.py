class Solution:
    def lengthOfLongestSubstring(self, a: str) -> int:
        
        c = 0
        for i in range(len(a)):
            b = []
            l = 0
            for j in range(i,len(a)):
                if a[j] not in b:
                    b.append(a[j])
                    l = l + 1
                    if(j==len(a)-1 and l > c):
                        c = l
                        
                else:
                    if(l>c):
                        c = l
                    break
        return c