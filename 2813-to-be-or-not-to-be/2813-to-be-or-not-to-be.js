/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    let object = {
        toBe: function(arg) {
            if(val !== arg) throw new Error('Not Equal');
            else return val == arg;
        },

        notToBe: function(arg) {
            if(val === arg) throw new Error('Equal');
            else return val !== arg;
        }

    };
    return object;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */