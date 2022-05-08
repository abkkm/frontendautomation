Summing an Array of Numbers

function sum(arr) {
let sum = 0;
for (const val of arr) {
sum += val;
}
return sum;
}

sum([1, 3, 5, 7]); // 16

---

function sum(arr) {
const reducer = (sum, val) => sum + val;
const initialValue = 0;
return arr.reduce(reducer, initialValue);
}

sum([1, 3, 5, 7]); // 16

The reduce() function's first 2 parameters are a function reducer() and an arbitrary initialValue. JavaScript then calls the reducer() on each element of the array with the accumulator value as the first parameter. The accumulator starts as initialValue, and then JavaScript uses the return value of each reduce() call as the new accumulator.

---

Summing an Array of Numeric Properties

const lineItems = [
{ description: 'Eggs (Dozen)', quantity: 1, price: 3, total: 3 },
{ description: 'Cheese', quantity: 0.5, price: 5, total: 2.5 },
{ description: 'Butter', quantity: 2, price: 6, total: 12 }
];

lineItems.reduce((sum, li) => sum + li.total, 0); // 17.5
lineItems.map(li => li.total).reduce((sum, val) => sum + val, 0);

// Sum the totals
lineItems.map(li => li.total).reduce(sumReducer, 0);

// Sum the quantities using the same reducer
lineItems.map(li => li.quantity).reduce(sumReducer, 0);

function sumReducer(sum, val) {
return sum + val;
}

---

const { round } = require('lodash');

function sumReducer(sum, val) {
// Round to 2 decimal places.
return \_.round(sum + val, 2);
}

---

Find the Maximum Value

const dates = [
'2019/06/01',
'2018/06/01',
'2019/09/01', // This is the most recent date, but how to find it?
'2018/09/01'
].map(v => new Date(v));

// This works because you can compare JavaScript dates using `>` and `<`.
// So `a > b` if and only if `a` is after `b`.
const maxDate = dates.reduce((max, d) => d > max ? d : max, dates[0]);

---

Grouping Values
Given an array of objects with an age property:

const characters = [
{ name: 'Jean-Luc Picard', age: 59 },
{ name: 'Will Riker', age: 29 },
{ name: 'Deanna Troi', age: 29 }
];
How do you return a map that contains how many characters have a given age? For example, the correct output on the above array would be { 29: 2, 59: 1 }.

Here's how you can do that with reduce().

// Start with an empty object, increment `map[age]` for each element
// of the array.
const reducer = (map, val) => {
if (map[val] == null) {
map[val] = 1;
} else {
++map[val];
}
return map;
};
characters.map(char => char.age).reduce(reducer, {});

---

Promise Chaining
Suppose you have an array of async functions that you want to execute in series. There is a non-standard promise.series function for this, but you can also do this with reduce().

const functions = [
async function() { return 1; },
async function() { return 2; },
async function() { return 3; }
];

// Chain the function calls in order, starting with an empty promise.
// In the end, `res` is equivalent to
// `Promise.resolve().then(fn1).then(fn2).then(fn3)`
const res = await functions.
reduce((promise, fn) => promise.then(fn), Promise.resolve());
res; // 3

---
