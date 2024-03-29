// https://school.programmers.co.kr/learn/courses/30/lessons/120824

function solution(num_list) {
    let answer = [0, 0];
    
    for(let elm of num_list) {
        answer[elm%2]++;
    }
    
    return answer;
}