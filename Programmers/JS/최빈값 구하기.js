// https://school.programmers.co.kr/learn/courses/30/lessons/120812

// 문제풀이
function solution(array) {
    const frequency = {};
    array.forEach(num => {
        if (!frequency[num]) frequency[num] = 0;
        frequency[num]++;
    });

    let maxFreq = 0;
    let modes = [];
    for (const num in frequency) {
        const freq = frequency[num];
        if (freq > maxFreq) {
            maxFreq = freq;
            modes = [Number(num)];
        } else if (freq === maxFreq) {
            modes.push(Number(num));
        }
    }

    if (modes.length > 1) return -1;

    return modes[0];
}

// 테스트
console.log(solution([1, 2, 3, 3, 3, 4]));
console.log(solution([1, 1, 2, 2]));
console.log(solution([1]));