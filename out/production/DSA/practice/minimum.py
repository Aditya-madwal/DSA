sample_array = [1, 4, 2, 5, 8, 7, 56, 20, 10]

for i in range(len(sample_array) - 1):
    if sample_array[i] >= sample_array[i + 1]:
        temp = sample_array[i]
        sample_array[i] = sample_array[i + 1]
        sample_array[i + 1] = temp
        pass
    pass

print(sample_array)

print(f"the minimum is {sample_array[0]}")
