function solution(n, k) {
    const result = [];
    let index = 0;
    const people = Array.from({length:n}, (_, i)=> i + 1);
    while (people.length > 0) {
        index = (index + k - 1) % people.length;
        result.push(people.splice(index, 1)[0]);
    }
    return result;
}

console.log(solution(7, 3));