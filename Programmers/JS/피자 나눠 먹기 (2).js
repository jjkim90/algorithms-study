// https://school.programmers.co.kr/learn/courses/30/lessons/120815

const solution = (n) => lcm(n, 6) / 6;

function gcd(a, b) {
    if (b === 0) return a;
    return gcd(b, a % b);
  }
  
function lcm(a, b) {
    return (a * b) / gcd(a, b);
}