/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {

    function neededHours(k) {
        let hours = 0;
        for (let pile of piles) {
            hours += Math.ceil(pile / k);
        }
        return hours;
    }   

    let start = 1;
    let end = Math.max(...piles);
    let result = end;

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);

        if (neededHours(mid) <= h) {
            result = mid;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return result;
};