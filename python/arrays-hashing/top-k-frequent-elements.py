from collections import defaultdict
from typing import List


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums_map = defaultdict(int)

        for num in nums:
            nums_map[num] += 1

        n = len(nums)
        buckets = [[] for _ in range(n + 1)]

        for num, freq in nums_map.items():
            buckets[freq].append(num)

        solutions = []

        for i in range(n, 0, -1):
            for num in buckets[i]:
                solutions.append(num)
                if len(solutions) == k:
                    return solutions

        return []


if __name__ == "__main__":
    sol = Solution()

    nums1 = [1, 2, 2, 3, 3, 3]
    k1 = 2
    print(f"Ex 1: {sol.topKFrequent(nums1, k1)}")

    nums2 = [7, 7]
    k2 = 1
    print(f"Ex 2: {sol.topKFrequent(nums2, k2)}")

    nums2 = [7, 7]
    k2 = 0
    print(f"Ex 2: {sol.topKFrequent(nums2, k2)}")

    nums2 = []
    k2 = 1
    print(f"Ex 2: {sol.topKFrequent(nums2, k2)}")
