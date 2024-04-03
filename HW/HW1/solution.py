def isPalindrome(val):
    if(len(val) == 0 or len(val) == 1):
        return True
    size = len(val) - 1
    if(val[0] == val[size]):
        return isPalindrome(val[1:size])

    return False


print(isPalindrome("test1"))
print(isPalindrome("eye"))
print(isPalindrome("33423"))