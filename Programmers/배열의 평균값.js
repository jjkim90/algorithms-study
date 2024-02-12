// https://school.programmers.co.kr/learn/courses/30/lessons/120817

function solution(numbers) {
    let sum = numbers.reduce((a, b) => a+b,0);
    return sum / numbers.length
}