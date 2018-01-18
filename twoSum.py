class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        list = ["", ""]
        for i in range(0, len(nums)):
            for j in range(i + 1, len(nums)):
             if target == nums[i] + nums[j]:
                list[0] = i
                list[1] = j
                return list
