// https://school.programmers.co.kr/learn/courses/30/lessons/120841

// 풀이
function solution(dot) {
    if (dot[0] > 0 && dot[1] > 0) return 1;
    if (dot[0] < 0 && dot[1] > 0) return 2;
    if (dot[0] < 0 && dot[1] < 0) return 3;
    if (dot[0] > 0 && dot[1] < 0) return 4;
}

// 테스트
console.log(solution([2, 4])); // 1
console.log(solution([-7, 9])); // 2