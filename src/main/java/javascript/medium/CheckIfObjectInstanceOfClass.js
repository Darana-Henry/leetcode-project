/**https://leetcode.com/problems/check-if-object-instance-of-class/
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function (obj, classFunction) {

    if (obj === null || obj === undefined || typeof classFunction !== 'function')
        return false;

    let currentPrototype = Object.getPrototypeOf(obj);

    while (currentPrototype !== null) {
        if (currentPrototype === classFunction.prototype)
            return true;
        currentPrototype = Object.getPrototypeOf(currentPrototype);
    }
    return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */