from collections import deque, defaultdict


class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        #so i want to create a hashmap with characters to occurrence to know the character that occurs the most than if max_char + k >= length we okay
        if s == "":
            return 0

        l = 0
        r = 1

        max_sequence_length = 0
        nums_map = defaultdict(int)
        nums_map[s[l]] += 1
        max_char_occurrence = 1

        while l < len(s) and r < len(s):
            nums_map[s[r]] += 1
            if nums_map[s[r]] > max_char_occurrence:
                max_char_occurrence = nums_map[s[r]]

            if r - l + 1 > k + max_char_occurrence:
                nums_map[s[l]] -= 1
                nums_map[s[r]] -= 1
                l = l + 1
            else:
                max_sequence_length = max(max_sequence_length, r - l + 1)
                r = r + 1

        return max_sequence_length


if __name__ == "__main__":
    sol = Solution()

    s1 = "XYYX"
    k1 = 2
    print(f"Ex 1: 4, {sol.characterReplacement(s1, k1)}")

    s2 = "AAABABB"
    k2 = 1
    print(f"Ex 2: 5, {sol.characterReplacement(s2, k2)}")

    s3 = "ABBB"
    k3 = 1
    print(f"Ex 3: 4, {sol.characterReplacement(s3, k3)}")

    s4 = "BABBAABAA"
    k4 = 2
    print(f"Ex 4: 6, {sol.characterReplacement(s4, k4)}")

    s5 = "AAAA"
    k5 = 3
    print(f"Ex 5: 4, {sol.characterReplacement(s5, k5)}")

    s6 = "BAAAA"
    k6 = 2
    print(f"Ex 6: 5, {sol.characterReplacement(s6, k6)}")

    s7 = ""
    k7 = 0
    print(f"Ex 7: 0, {sol.characterReplacement(s7, k7)}")

    s8 = "AAAB"
    k8 = 0
    print(f"Ex 8: 3, {sol.characterReplacement(s8, k8)}")

    s9 = "ABAA"
    k9 = 0
    print(f"Ex 9: 2, {sol.characterReplacement(s9, k9)}")

    s10 = "BAAAB"
    k10 = 2
    print(f"Ex 10: 5, {sol.characterReplacement(s10, k10)}")
