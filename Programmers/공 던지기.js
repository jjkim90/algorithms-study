// https://school.programmers.co.kr/learn/courses/30/lessons/120843

// 풀이
function solution(numbers, k) {
    return numbers[((k-1) * 2) % numbers.length];
}

// 테스트
console.log(solution([1, 2, 3, 4], 2)); // 3
console.log(solution([1, 2, 3, 4, 5, 6], 5)); // 3
console.log(solution([1, 2, 3], 3)); // 2