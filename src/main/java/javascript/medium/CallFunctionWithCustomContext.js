//https://leetcode.com/problems/call-function-with-custom-context/

/**
 * @param {Object} context
 * @param {Array} args
 * @return {null|boolean|number|string|Array|Object}
 */
Function.prototype.callPolyfill = function (context, ...args) {
    return this.apply(context, args);
}