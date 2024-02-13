// https://school.programmers.co.kr/learn/courses/30/lessons/120848

// 풀이
function solution(n) {
    let i = 1;
    let factorial = 1;
    while (factorial <= n) {
        factorial *= i;
        if (factorial > n) break;
        i++;
    }
    return i - 1;
}

// 테스트
console.log(solution(3628800));
console.log(solution(7));