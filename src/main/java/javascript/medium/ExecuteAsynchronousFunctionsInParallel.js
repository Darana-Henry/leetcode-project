//https://leetcode.com/problems/execute-asynchronous-functions-in-parallel/description/

/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function (functions) {
    return new Promise((resolve, reject) => {
        let result = Array(functions.length);
        let pendingCalls = functions.length;

        for (let i = 0; i < functions.length; i++) {
            functions[i]().then(
                (output) => {
                    result[i] = output;
                    pendingCalls--;

                    if (pendingCalls === 0)
                        resolve(result);
                }

            ).catch(reject);
        }
    });
};