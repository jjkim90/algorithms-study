// https://school.programmers.co.kr/learn/courses/30/lessons/120842

// 풀이 1
function solution(num_list, n) {
    const answer = num_list.reduce((acc, cur, idx, arr) => {
        if (idx % n === 0) acc.push(arr.slice(idx, idx + n));
        return acc;
    }, []);
    return answer;
}

// 테스트 1
console.log(solution([1, 2, 3, 4, 5, 6, 7, 8], 2)); // [[1, 2], [3, 4], [5, 6], [7, 8]]
console.log(solution([100, 95, 2, 4, 5, 6, 18, 33, 948], 3)); // [[100, 95, 2], [4, 5, 6], [18, 33, 948]]

// 풀이 2
function solution2(num_list, n) {
    const answer = [];
    for (let i = 0; i < num_list.length; i = i + n) {
        answer.push(num_list.slice(i, i + n));
    }
    return answer;
}

// 테스트 2
console.log(solution2([1, 2, 3, 4, 5, 6, 7, 8], 2)); // [[1, 2], [3, 4], [5, 6], [7, 8]]
console.log(solution2([100, 95, 2, 4, 5, 6, 18, 33, 948], 3)); // [[100, 95, 2], [4, 5, 6], [18, 33, 948]]