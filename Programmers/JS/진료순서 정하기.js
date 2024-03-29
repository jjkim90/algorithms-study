// https://school.programmers.co.kr/learn/courses/30/lessons/120835

// 나의 풀이
function solution(emergency) {
    const map = emergency.map((value, index) => {value, index});

    map.sort((a, b) => b.value - a.value);

    const order = new Array(emergency.length);
    map.forEach((item, sortedIndex) => {
        order[item.index] = sortedIndex + 1;
    });

    return order;
}

// 테스트
console.log(solution([3, 76, 24]));
console.log(solution([1, 2, 3, 4, 5, 6, 7]));
console.log(solution([30, 10, 23, 6, 100]));

// 다른 풀이
// function solution(emergency) {
//     const rank = [...emergency];
//     rank.sort((a, b) => b - a);
//     return emergency.map(n => rank.indexOf(n) + 1);
// }