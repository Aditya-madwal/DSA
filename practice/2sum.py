# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]

nums = [2, 7, 11, 15]
target = 9
arr = []
for i in range(len(nums)):
    for j in range(len(nums)):
        if i == j:
            pass
        else:
            if nums[i] + nums[j] == target:
                arr = [j, i]
                pass
            else:
                pass
        pass
print(arr)
