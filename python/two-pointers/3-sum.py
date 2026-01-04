from collections import defaultdict
from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()

        num_counts = defaultdict(int)
        for num in nums:
            num_counts[num] += 1

        triples = set()

        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                target = -nums[i] - nums[j]

                if target in num_counts:
                    candidate = tuple(sorted([nums[i], nums[j], target]))

                    if candidate not in triples:
                        if target == nums[i] and target == nums[j]:
                            if num_counts[target] > 2:
                                triples.add(candidate)
                        elif target == nums[i] or target == nums[j]:
                            if num_counts[target] > 1:
                                triples.add(candidate)
                        else:
                            triples.add(candidate)

        return [list(triple) for triple in triples]


if __name__ == "__main__":
    sol = Solution()

    nums1 = [-1, 0, 1, 2, -1, -4]
    print(f"Ex 1: {sol.threeSum(nums1)}")

    nums2 = [0, 1, 1]
    print(f"Ex 2: {sol.threeSum(nums2)}")

    nums3 = nums = [
        34,
        55,
        79,
        28,
        46,
        33,
        2,
        48,
        31,
        -3,
        84,
        71,
        52,
        -3,
        93,
        15,
        21,
        -43,
        57,
        -6,
        86,
        56,
        94,
        74,
        83,
        -14,
        28,
        -66,
        46,
        -49,
        62,
        -11,
        43,
        65,
        77,
        12,
        47,
        61,
        26,
        1,
        13,
        29,
        55,
        -82,
        76,
        26,
        15,
        -29,
        36,
        -29,
        10,
        -70,
        69,
        17,
        49,
    ]
    print(f"Ex 3: {sol.threeSum(nums3)}")

    nums4 = [-1, 0, 1, 0]
    print(f"Ex 4: {sol.threeSum(nums4)}")
