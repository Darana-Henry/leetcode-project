/**https://leetcode.com/problems/array-reduce-transformation/
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function (nums, fn, init) {
    let result = init;

    for (const n of nums) {
        result = fn(result, n)
    }

    return result;
};