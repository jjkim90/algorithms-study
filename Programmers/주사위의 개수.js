// https://school.programmers.co.kr/learn/courses/30/lessons/120845

// 풀이
function solution(box, n) {
    return box.reduce((acc, cur) => acc * Math.floor(cur / n), 1);
}

// 테스트
console.log(solution([1, 1, 1], 1));
console.log(solution([10, 8, 6], 3));