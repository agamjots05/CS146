def isAnagram(s, t):
    if (len(s) != len(t)):
        return False
    

    listS = sorted(list(s))
    listT = sorted(list(t))

    for i in range(0,len(listS)):
        if(listS[i] != listT[i]):
            return False
        
    return True




print(isAnagram("ienfeifne", "tester"))
print(isAnagram("peter", "teerp"))
print(isAnagram("tesner", "tester"))