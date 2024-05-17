//https://leetcode.com/problems/snail-traversal/
/**
 * @param {number} rowsCount
 * @param {number} colsCount
 * @return {Array<Array<number>>}
 */
Array.prototype.snail = function (rowsCount, colsCount) {
    const result = [];

    if (this.length !== (rowsCount * colsCount))
        return [];

    for (let i = 0; i < rowsCount; i++) {
        result.push(new Array());
    }

    let reverseOrder = false;
    let index = 0;

    for (let j = 0; j < colsCount; j++) {
        if (!reverseOrder) {
            for (let i = 0; i < rowsCount; i++) {
                result[i][j] = this[index++];
            }
        }
        else {
            for (let i = rowsCount - 1; i >= 0; i--) {
                result[i][j] = this[index++];
            }
        }
        reverseOrder = !reverseOrder;
    }
    return result;
}

/**
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */