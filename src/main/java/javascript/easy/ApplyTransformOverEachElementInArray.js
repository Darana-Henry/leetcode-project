/**https://leetcode.com/problems/apply-transform-over-each-element-in-array/
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
    const result = new Array(arr.length);

    for (const i in arr) {
        result[i] = fn(arr[i], Number(i));
    }
    return result;
};