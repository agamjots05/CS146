def twosum(arr1, target):
    for i in range(0, len(arr1)):
        for j in range(i+1, len(arr1)):
            if(arr1[i] + arr1[j] == target):
                return(i,j)
    
    return -1

print(twosum([1,2,3,4], 2020))
