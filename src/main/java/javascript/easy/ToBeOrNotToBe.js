/**--https://leetcode.com/problems/to-be-or-not-to-be/
 * @param {string} val
 * @return {Object}
 */
var expect = function (val) {

    obj = {
        toBe(checkValue) {
            if (val === checkValue)
                return true;
            else
                throw new Error("Not Equal");
        },

        notToBe(checkValue) {
            if (val !== checkValue)
                return true;
            else
                throw new Error("Equal");
        }
    }

    return obj;

};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */