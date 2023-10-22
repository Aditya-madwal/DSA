def rodOffcut(lengths):
    # Write your code here
    arr = []
    while len(lengths) != 0:
        shortest = min(lengths)
        rangee = len(lengths)
        for i in range(rangee):
            if lengths[i] > 0:
                if lengths[i] == shortest:
                    lengths[i] = 0
                else:
                    lengths[i] = lengths[i] - shortest
        new_len = len(lengths)
        arr.append(new_len)

    print(arr)


rodOffcut([5, 4, 4, 2, 2, 8])
