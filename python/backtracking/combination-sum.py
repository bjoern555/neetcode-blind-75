from typing import List

class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        sol = []

        def backtrack(start_index: int, path: List[int], curr_target: int):
            if curr_target == 0:
                sol.append(path.copy())
                return

            for i in range(start_index, len(nums)):
                if nums[i] <= curr_target:
                    path.append(nums[i])
                    backtrack(i, path, curr_target - nums[i])
                    path.pop()

        backtrack(0, [], target)

        return sol

if __name__ == "__main__":
    sol = Solution()

    nums = [2,5,6,9]
    target = 9
    print(f"Ex 1: {sol.combinationSum(nums, target)}")

    nums = [3,4,5]
    target = 16
    print(f"Ex 2: {sol.combinationSum(nums, target)}")

    nums = [3]
    target = 5
    print(f"Ex 2: {sol.combinationSum(nums, target)}")