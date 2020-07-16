class Solution:
    def search(self, a: List[int], t: int) -> int:
        f = -1
        if t in a:
            f = a.index(t)
        return f