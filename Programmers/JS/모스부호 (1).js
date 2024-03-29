// https://school.programmers.co.kr/learn/courses/30/lessons/120838

// 풀이 1
function solution(letter) {
    const morse = { 
        '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
        '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
        '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
        '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
        '-.--':'y','--..':'z'
    };

    return letter.split(" ").map((e) => morse[e]).join("");
}

// 테스트 1
console.log(solution(".... . .-.. .-.. ---"));
console.log(solution(".--. -.-- - .... --- -."));


// 풀이 2
function solution2(letter) {
    const morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    return letter.split(" ").map((e) => String.fromCharCode('a'.charCodeAt(0) + morse.indexOf(e))).join("");
}

// 테스트 2
console.log(solution(".... . .-.. .-.. ---"));
console.log(solution(".--. -.-- - .... --- -."));