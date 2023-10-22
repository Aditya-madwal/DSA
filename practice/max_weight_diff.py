weights = [8, 4, 5, 2, 10]
n = 5
k = 2


def maxWeightDiff(weights, n, k):
    weights.sort()
    child = []
    papa = []
    for i in range(0, k):
        child.append(weights[i])

    for i in range(k, len(weights)):
        papa.append(weights[i])

    summ_c = 0
    summ_p = 0

    for c in child:
        summ_c = summ_c + c

    for p in papa:
        summ_p = summ_p + p

    return int(summ_p-summ_c)


print(maxWeightDiff(weights, 5, 2))
