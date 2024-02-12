// https://school.programmers.co.kr/learn/courses/30/lessons/120836

// 나의 풀이
function solution(n) {
    let count = 0;
    for(let i = 1; i<= n; i++) {
        if (n % i === 0) count++;
    };
    return count;
}

// 테스트
console.log(solution(20));
console.log(solution(100));