/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
        let xor = 0;
        let n = nums.length;

        for (let i = 0; i < n; i++) {
            xor = xor ^ nums[i] ^ i;
        }

        xor = xor ^ n;

        return xor;
};