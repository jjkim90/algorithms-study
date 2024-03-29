// https://school.programmers.co.kr/learn/courses/30/lessons/120818

const solution = (price) => {
    if (price >= 500000) return Math.trunc(price*(1 - 0.2));
    if (price >= 300000) return Math.trunc(price*(1 - 0.1));
    if (price >= 100000) return Math.trunc(price*(1 - 0.05));
    return price;
};
