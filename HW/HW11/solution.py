class Solution:
    def flood_fill_help(image, i, j, prev_c, new_c):
        if i < 0 or i >= len(image) or j < 0 or j >= len(image[0]):
            return
        if image[i][j] != prev_c:
            return
        image[i][j] = new_c
        Solution.flood_fill_help(image, i + 1, j, prev_c, new_c)
        Solution.flood_fill_help(image, i - 1, j, prev_c, new_c)
        Solution.flood_fill_help(image, i, j + 1, prev_c, new_c)
        Solution.flood_fill_help(image, i, j - 1, prev_c, new_c)
    
    def flood_fill(self, image, sr, sc, color):
        color_p = image[sr][sc]
        Solution.flood_fill_help(image, sr, sc, color_p, color)
        return image

    
    def printer(array):
        for row in array:
            for col in row:
                print(col, end=" ")
            print()

# Test cases
if __name__ == "__main__":
    test1 = Solution()
    image = [[0, 0, 0], [0, 0, 0]]
    test1.printer(test1.flood_fill(image, 0, 0, 0))
