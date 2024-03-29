// https://school.programmers.co.kr/learn/courses/30/lessons/120834?language=javascript

// 나의 풀이
function solution(age) {
    let str = "abcdefghij";
    return Array.from(age.toString()).map((n) => str[n]).join("");
};

// 테스트
console.log(solution(23));
console.log(solution(51));
console.log(solution(100));

// 타인의 풀이1
// function solution(age) {
//     return age.toString().split("").map((elm) => "abcdefghij"[elm]).join("");
// };

// 타인의 풀이2
// function solution(age) {
//     return age.toString().replace(/./g, (x) => "abcdefghij"[x]);
// };