//https://leetcode.com/problems/flatten-deeply-nested-array/
/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    const result = [];

    function miner(arr, depth) {
        for (const val of arr) {
            if (typeof val === 'object' && depth < n)
                miner(val, depth + 1);
            else
                result.push(val);
        }
        return result;
    }
    return miner(arr, 0);
};