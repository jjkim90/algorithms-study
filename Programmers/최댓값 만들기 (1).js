// https://school.programmers.co.kr/learn/courses/30/lessons/120847

// 풀이
function solution(numbers) {
    let [a, b] = numbers.sort((a, b) => b - a);
    return a * b;
}

// 테스트
console.log(solution([1, 2, 3, 4, 5]));
console.log(solution([0, 31, 24, 10, 1, 9]));