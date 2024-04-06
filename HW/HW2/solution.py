def isBadVersion(val):
    badVersion = 2
    if(val >= badVersion):
        return True
    else:
        return False
    
def firstBadVersion(arr):
    left = 0
    right = len(arr)

    while(left <= right):
        mid = int((left + right) /2)
        val = isBadVersion(mid)

        if(val and (mid > 0) and not(isBadVersion(mid - 1))):
            return mid
        
        elif(val):
            right = mid -1

        else:
            left = mid +1

arr1 = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
print(firstBadVersion(arr1))

    
