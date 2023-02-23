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

--Start of Rahul JS---

console.log("hello world")
//there are comments
/\* \*/

> node basics1.js

//var(from es5) (let, const from vs6)
let a = 1
console.log(typeof(a)) // number

//javascript data types - number, string, boolean, null, undefined

var - redeclre . but not in let

const - we cannot reassign

const flag = false
let i =0

while(i<10){
i++
colsole.log(i)
}

do{
i++
}while(i>10);

compare ==

if(i%2 == 0 && i%5 == 0)

var marks = Array(6)
var marks = new Array(20,40,35,12,37,100)

var marks =[20,40,35,12,37,100]
subMarks =marks.slice(2,5)
console.log(subMarks)

console.log(marks[2]) //35
marks[3] = 14
console.log(marks) //[20,40,35,14,37,100]
console.log(marks.length) //6
marks.push(65) // appends elemnt at the end
console.log(marks) //[20,40,35,14,37,100,65]
marks.pop()//[20,40,35,14,37,100] // deletes last element
marks.unshift(12) // appends elemnt at the begining
console.log(marks)
console.log(marks.indexOf(100))
//120 in the array
console.log(marks.includes(120)) // returns false
var sum =0
for(let i =0;i<marks.length;i++)
{
//console.log(marks[i])
sum = sum + marks[i] //32+40
}
console.log(sum)
//reduce filter map
let total =marks.reduce((sum,mark)=>sum+mark,0)
console.log(total)
var scores = [12,13,14,16]
//create new array with even numbers of scores and multiply each value
// with 3 and sum themarray [12,14,16]
var evenScores =[]
for(let i =0;i<scores.length;i++)
{

    if(scores[i] %2 == 0)
    {
        evenScores.push(scores[i])
    }

}
console.log(evenScores)
let newFilterEvenScores =scores.filter(score=>score%2==0)
console.log(newFilterEvenScores) //[ 12, 14, 16 ]=>[36,42,48]

//map
let mappedArray=newFilterEvenScores.map(score=>score\*3)
console.log(mappedArray)
let totalVal=mappedArray.reduce((sum,val)=>sum+val,0)
console.log(totalVal)
var scores1 = [12,13,14,16]

let sumValue=scores1.filter(score=>score%2==0).map(score=>score\*3).reduce((sum,val)=>sum+val,0)
console.log(sumValue)

let fruits =["banana","mango","pomegrante","apple"]

console.log(fruits.sort())
console.log(fruits.reverse())

var scores1 = [12,003,19,16,14] //9
// console.log(scores1.sort())
// scores1.sort(function(a,b){
// return a-b
// })

console.log(scores1.sort((a,b)=> b-a))
---functions---
//block of code
//var - global level/functional
//let global level/block level {}
//const -
//use const for xpath
--End of Rahul JS---

https://developer.mozilla.org/en-US/
https://developer.mozilla.org/en-US/docs/Web/CSS/color_value  
devdocs.io
https://emojipedia.org
seanhalpin.io
https://www.favicon.cc/
cssfontstack.com
fonts.google.com(free for commercial use)
loremipsumgenerator.com
flaticon.com
giphy.com
techcrunch.com
https://www.flaticon.com/
https://css3buttongenerator.com/
codeply.com ‐ check all framework button types

https://getbootstrap.com/docs/4.3/examples/starter‐template/
awwwards.com
ui‐patterns.com
https://dribbble.com/
Wireframe(pencil)‐mockup(photoshop)‐prototype
sneakpeekit.com(basic wireframe)
https://balsamiq.com

## forkify.com

ES5‐ES6/ESNext
create a project folder

> node ‐v
> npm ‐v
> npm init
> (give deails version, description,authur)
> it will create package.json file
> npm install webpack ‐‐save‐dev
> it will add depencies entry in package.json
> npm install jquery –save
> npm install(it will install all packages from packes.json)
> npm unistall jquery –save
> ‐‐‐To install globally because all the files work inside the project
> To make all files avaible outside the project
> npm install live‐server ‐‐global
> live‐server(simply server to see the install packages)
> npm install webpack‐cli
> npm run build
> npm install webpack‐dev‐server –save
> npm run start
> npm install html‐webpack‐plugin –save
> http://babeljs.io/
> npm install babel‐core babel‐preset‐env babel‐loader ‐‐save‐dev
> npm install babel‐polyfill
> npm run dev
> Material.google.com – polymer
> Materialdesignicons.com(opensource)

---

<link 
href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.cs
s" rel="stylesheet"> 
<link rel="stylesheet" href="css/styles.css">

---

fontawesome.com

https://bootsnipp.com/

slice(0,2)
toUpperCase()

https://minifier.org/
https://2022.stateofjs.com/en-US/other-tools/

https://bitcoinaverage.com/
https://any-api.com/
https://httpstatuses.com/

document.querySelector("li a");
document.querySelector("a");
document.querySelector("h1").innerHTML;

git rm --cache -r .

The above lines removed from staging area.

---
