// https://school.programmers.co.kr/learn/courses/30/lessons/120823

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    userInput = Number(input[0]);
    for(let i = 1; i <= userInput; i++) {
        console.log("*".repeat(i));
    }
});