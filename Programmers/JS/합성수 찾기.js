// https://school.programmers.co.kr/learn/courses/30/lessons/120846

// 풀이 1
function solution(n) {
    let count = 0;
    for (let i = 4; i <= n; i++) {
        if (isComposite(i)) {
            count++;
        }
    }
    return count;
}

function isComposite(number) {
    let divisorCount = 0;
    for (let i = 1; i <= number; i++) {
        if (number % i === 0) {
            divisorCount++;
        }
    }
    return divisorCount > 2;
}

// 테스트1
console.log(solution(10)); // 5
console.log(solution(15)); // 8

// 풀이 2
function solution2(n) {
    let compositeFlags = Array(n+1).fill(1)
    for(let i = 2 ; i <= n ; i++){
        if(compositeFlags[i]){
            for(let j = 2 ; i*j <= n ; j++){
                compositeFlags[i*j] = 0
            }
        }
    }
    return compositeFlags.filter(el => el === 0).length
}

// 테스트2
console.log(solution2(10)); // 5
console.log(solution2(15)); // 8