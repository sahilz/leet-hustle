/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    console.log(this.length);
    return this.length === 0 ? -1 : this[this.length - 1];
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */