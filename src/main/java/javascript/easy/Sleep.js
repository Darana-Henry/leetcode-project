//https://leetcode.com/problems/sleep/
/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {

    function callback(resolve) {
        setTimeout(resolve, millis);
    }
    return new Promise(callback);
}

/**
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */