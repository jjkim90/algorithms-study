// https://school.programmers.co.kr/learn/courses/30/lessons/120830

function solution(n, k) {
    return (n * 12000) + (k * 2000) - (Math.trunc(n / 10) * 2000);
}