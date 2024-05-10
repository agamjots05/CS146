def fibo(n):
    if (n == 1):
        return 0
    elif(n==2):
        return 1
        
    ret = []
    ret.append(0)
    ret.append(1)
    
    for i in range(2,n,1):
        ret.append(ret[i-2] + ret[i-1])
        
        
    return ret[n-1]
    
    
    
print(fibo(9))
        
