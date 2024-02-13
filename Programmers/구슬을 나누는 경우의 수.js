// https://school.programmers.co.kr/learn/courses/30/lessons/120840

// 풀이
function solution(balls, share) {
    return factorial(balls) / (factorial(balls-share) * factorial(share));
}

function factorial(num) {
    let answer = 1n;
    for(let i = 1; i<=num; i++) {
        answer *= BigInt(i);
    }
    return answer;
}

console.log(factorial(0));
console.log(solution(3, 2));
console.log(solution(5, 3));