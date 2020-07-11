class Solution:
    def intToRoman(self, n: int) -> str:
        
        s = ""
        if(n>=1000):
            m = n //1000
            s += 'M'*m
            n %= 1000
        if(n>=900):
            s += 'CM'
            n -= 900
        if(n>=500):
            s += 'D'
            n -= 500
        if(n>=400):
            s += 'CD'
            n -= 400
        if(n>=100):
            m = n//100
            s += 'C'*m
            n %= 100
        if(n>=90):
            s += 'XC'
            n -= 90
        if(n>=50):
            s += 'L'
            n -= 50
        if(n>=40):
            s += 'XL'
            n -= 40
        if(n>=10):
            m = n //10
            s += 'X'*m
            n %=10
        if(n>=9):
            s += 'IX'
            n -= 9
        if(n>=5):
            s += 'V'
            n -= 5
        if(n >=4):
            s += 'IV'
            n -= 4
        if(n>=1):
            s +=  'I'*n
        return s
        