nums = [2, 5, 1, 3, 4, 7]
n = 3

nums1 = []

for i in range(len(nums)):
    while i != n-1:
        if i % 2 == 0:
            # even
            nums1.append(i)
        else:
            # odd
            nums1.append(i+n-1)

print(nums1)
