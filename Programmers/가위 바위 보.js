// https://school.programmers.co.kr/learn/courses/30/lessons/120839

// 풀이
function solution(rsp) {
    const dic = {
        "2": "0",
        "0": "5",
        "5": "2"
    }
    return Array.from(rsp).reduce((acc, cur)=>acc+dic[cur],"");
}

// 테스트
console.log(solution("2"));
console.log(solution("205"));