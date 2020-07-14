int divide(int dividend, int divisor){
    
    int i,f,s;
    
    if(dividend== -2147483648 && divisor== -1)
       return 2147483647; 
        
    f=(long)dividend/divisor;
    
    
    return f;
}

