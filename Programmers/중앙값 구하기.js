// https://school.programmers.co.kr/learn/courses/30/lessons/120811

const solution = (array) => {
    array.sort((a, b) => {
        return a - b;
    });
    return array[Math.floor(array.length / 2)];
};