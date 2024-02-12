// https://school.programmers.co.kr/learn/courses/30/lessons/120808

function solution(numer1, denom1, numer2, denom2) {
    let a = numer1 * denom2 + numer2 * denom1
    let b = denom1 * denom2
    
    let num = gcd(a, b);
    
    return [a / num, b / num]
}

function gcd(a, b){
    return a % b === 0 ? b : gcd(b, a%b);
}

console.log(solution(1, 2, 3, 4));
console.log(solution(9, 2, 1, 3));