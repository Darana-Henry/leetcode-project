/** https://leetcode.com/problems/function-composition/
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {

    return function (x) {
        for (const fn of functions.reverse()) {
            x = fn(x);
        }
        return x;
    }
};