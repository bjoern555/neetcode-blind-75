from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)

        max_sequence_length = 0

        for num in nums:
            if num - 1 not in num_set:
                sequence_length = 1
                while num + 1 in num_set:
                    sequence_length += 1
                    num += 1

                max_sequence_length = max(max_sequence_length, sequence_length)

        return max_sequence_length


if __name__ == "__main__":
    sol = Solution()

    nums1 = [2, 20, 4, 10, 3, 4, 5]
    print(f"Ex 1: {sol.longestConsecutive(nums1)}")

    nums2 = [0, 3, 2, 5, 4, 6, 1, 1]
    print(f"Ex 2: {sol.longestConsecutive(nums2)}")

    nums3 = [0]
    print(f"Ex 3: {sol.longestConsecutive(nums3)}")

    nums4 = []
    print(f"Ex 4: {sol.longestConsecutive(nums4)}")
