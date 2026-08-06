/**
 * @param {number} n
 * @param {number} t
 * @return {number}
 */
var smallestNumber = function(n, t) {
    let current = n;
    while(true){
        let digProduct = 1;
        const strNum = current.toString();
        
        for (let i = 0; i < strNum.length; i++) {
            digProduct *= parseInt(strNum[i], 10);
        }
        // Check if the product is divisible by t
        if (digProduct % t === 0) {
            return current;
        }
        current++;
    }
};