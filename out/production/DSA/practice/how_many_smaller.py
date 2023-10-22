array = [7, 7, 7, 7, 7]

result = []

for element in array:
    smaller = 0
    for j in array:
        if j < element:
            smaller += 1
            pass
        else:
            pass
    result.append(smaller)

print(result)
