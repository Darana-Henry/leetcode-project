//https://leetcode.com/problems/memoize-ii/description/

/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {

    const paramsMap = new Map();
    const cache = new Map();

    const getParamIndex = (value) => {
        if (!paramsMap.has(value))
            paramsMap.set(value, paramsMap.size);

        return paramsMap.get(value);
    }

    return function (...args) {
        const key = [...args].map(getParamIndex).join('-');

        if (!cache.has(key))
            cache.set(key, fn(...args));

        return cache.get(key);
    }
}