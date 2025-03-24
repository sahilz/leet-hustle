/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const sz = [];
    for(let i = 0; i < arr.length; i+= size) {
        sz.push(arr.slice(i, i + size));
    }
    return sz;
};
