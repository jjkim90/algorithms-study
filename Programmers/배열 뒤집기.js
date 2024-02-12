// https://school.programmers.co.kr/learn/courses/30/lessons/120821

function solution(num_list) {
    var answer = [];
    for(let i = num_list.length; i > 0; i--){
        answer.push(num_list[i-1])
    }
    return answer;
}