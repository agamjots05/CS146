def threeSum(nums):
    ret =[]
    nums.sort()
    for i in range(0,len(nums) - 2,1):
        if(i == 0 or (i > 0 and nums[i] != nums[i-1])):
            sum = 0-nums[i]
            low = 0
            high = len(nums) -1
            while(low < high):
                if(nums[low] + nums[high] == sum):
                    ret.append([nums[i], nums[low], nums[high]])
                    while(low<high and nums[low+1] == nums[low]):
                        low = low + 1
                    while(low<high and nums[high -1] == nums[high]):
                        high = high - 1
                    low = low + 1
                    high = high -1
                
                elif(nums[low] + nums[high] < sum):
                    low = low + 1
                
                else:
                    high = high -1
    return ret
    
# Test Case Provided
nums1 = [0,1,1]
print(threeSum(nums1))

nums2 = [-5,0,5,10,-10,0]
print(threeSum(nums2))
