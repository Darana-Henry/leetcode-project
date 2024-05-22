//https://leetcode.com/problems/nested-array-generator/
/**
 * @param {Array} arr
 * @return {Generator}
 */
var inorderTraversal = function* (arr) {
    for (const n of arr) {
        if (Array.isArray(n))
            yield* inorderTraversal(n);
        else
            yield n;
    }
};