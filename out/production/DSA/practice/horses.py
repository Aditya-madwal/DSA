# the diff btw 2 horses should be minimum

def minimumDifference(horses) -> int:
    # min_diff = 0
    diffs = []

    for horse in horses:
        for another_horse in horses:
            if horses.index(horse) == horses.index(another_horse):
                pass
            else:
                current_diff = horse - another_horse
                diffs.append(abs(current_diff))

    # print(diffs)
    return int(min(diffs))


horses = [4, 9, 1, 32, 13]
print(minimumDifference(horses))

# -------------------------optimization-------------------------


def minDiff(horses) -> int:
    diffs = []
    for i in range(len(horses)):
        for j in range(i, len(horses)):
            if i == j:
                pass
            else:
                current_diff = horses[i] - horses[j]
                diffs.append(abs(current_diff))
    return min(diffs)


print(minDiff(horses))
