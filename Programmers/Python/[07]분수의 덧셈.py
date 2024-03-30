def gcd(a, b):
    while (b):
        a, b = b, a % b
    return a

def solution(numer1, denom1, numer2, denom2):
    numer = numer1 * denom2 + numer2 * denom1
    denom = denom1 * denom2
    gcd_value = gcd(numer, denom)
    return [numer / gcd_value, denom / gcd_value]

print(solution(1, 2, 3, 4)) #[5, 4]
print(solution(9, 2, 1, 3)) #[29, 6]