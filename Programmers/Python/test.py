#프로그래머스 [최빈값 구하기]
#최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

def solution(array):
    # 각 요소의 빈도를 계산
    freq = {}
    for x in array:
        freq[x] = freq.get(x, 0) + 1

    # 최대 빈도값을 찾음
    freq_max_value = max(freq.values())
    
    # 최대 빈도를 가진 요소의 개수를 계산
    max_freq_elements = [key for key, value in freq.items() if value == freq_max_value]
    
    # 최빈값이 여러 개 있으면 -1을 반환
    if len(max_freq_elements) > 1:
        return -1
    # 최빈값을 반환
    else:
        return max_freq_elements[0]
    

# 예시 데이터
print(solution([1, 2, 3, 3, 3, 4])) #출력: 3
print(solution([1, 1, 2, 2])) #출력: -1
print(solution([1])) #출력: 1