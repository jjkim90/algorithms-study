import statistics

def solution(array):
    modes = statistics.multimode(array)
    if len(modes) > 1:
        return -1
    return modes[0]

print(solution([1, 2, 3, 3, 3, 4])) #3
print(solution([1, 1, 2, 2])) #-1
print(solution([1])) #1