sample_array = [1, 5, 6, 7, 8, 6, 2, 1, 1, 1, 1]


def duplicity(arr) -> int:
    done_arr = []
    repeating_elements = []
    for i in arr:
        if i in done_arr:
            if i in repeating_elements:
                pass
            else:
                repeating_elements.append(i)
        else:
            done_arr.append(i)
    return len(repeating_elements)


print(duplicity(sample_array))
