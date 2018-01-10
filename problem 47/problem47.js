var primes = [2];
addPrimesUpTo(50);
const REQUIRED_NUM = 4;
var counter = 0;
for(var i = 2; i < 10000000; i++) {
    if(Object.keys(primeFactorsOf(i)).length==REQUIRED_NUM) {
        counter++;
        if(counter==REQUIRED_NUM) {
            console.log(i-3);
            break;
        }
    } else {
        counter = 0;
    }
}

function primeFactorsOf(n) {
    primeFactors = {};
    if(isPrime(n)) {
        primeFactors[n]=1;
        return primeFactors;
    }
    if(n>100) {
        addPrimesUpTo(n);
    }
    var workingN = n;
    while(!primes.includes(workingN)) {
        for(var i = 0; primes[i]-1 < workingN/2; i++) {
            if(workingN%primes[i]==0) {
                primeFactors[primes[i]]=1;
                workingN=workingN / primes[i];
                break;
            }
        }
        if(primes.includes(workingN)) {
            primeFactors[workingN] = 1;
            break;
        }
    }

    return primeFactors;
}

function addPrimesUpTo(n) {
    for(var i = primes[primes.length-1]+1; i < n; i++) {
        if(isPrime(i)) {
            primes.push(i);
        }
    }
}

function isPrime(n) {
    if(n==1) return false;
    var counter = 0;
    for(var i = 2; Math.pow(i,2)-1 < n; i++) {
        if(n%i == 0) {
            counter++;
        }
        if(counter > 0) {
            return false;
        }
    }
    return true;
}