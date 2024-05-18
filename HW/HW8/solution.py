class Solution:
    def longestPalindrome(self, s):
        chars = [0] * 128
        for ch in s:
            chars[ord(ch)] += 1

        res = 0
        for ch in chars:
            res += ch // 2 * 2
            if res % 2 == 0 and ch % 2 == 1:
                res += 1

        return res


# Test cases
test1 = Solution()

#Provided test Cases
print(test1.longestPalindrome("abccccdd"))      
print(test1.longestPalindrome("speediskey"))   
#Hidden Test Cases
print(test1.longestPalindrome("AAfeiejgA"))   
