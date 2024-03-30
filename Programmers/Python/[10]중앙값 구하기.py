def solution(array):
    return sorted(array)[len(array) // 2]

print(solution([1, 2, 7, 10, 11])) #7
print(solution([9, -1, 0])) #0