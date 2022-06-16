# frontendautomation

This app made with HTML, CSS, Bootstrap, and JQuery

Simply open the index.html file to load the app or use a local web server.

The login page will take any email and password combination.

After creating package.json run npm install

In WDIO document.querySelector = $
copy -

> npm test wdio.conf.js

ctrl+Shift+P
Open command pallette - @ To see the class members
Find all references - REname symbol - It renames all symbols
Right Click on the filename choose split right
Right click on the filename choose copy path

Ctrl+P- To open a file
JSONtoCode-
Create a json file
ctrl+p to open command pallete

> paste JSON as code
> create & open ts/java/js file
> select top level type name
> Then type as tweet
> The file is created automatically

> http-server

https://w3c.github.io/webdriver/#keyboard-actions
it.skip
it.only

display:none
visiblity:hidden
Then isdisplayed returns false

https://devdocs.magento.com/mftf/docs/guides/selectors.html

----start of testsuite run---

Change specs: ['./tests/login.spec.js'] in wdio.conf.js
Change specs: ['./tests/smoke*.js'] in wdio.conf.js

Then run as npm test wdio.conf.js

if you want to use localhost

Then use >http-server
// baseUrl: 'http://localhost:8080/index.html' in wdio.conf.js

# Test site

https://github.com/glitchIntheSystemJM/superHeroApp
See instructions for running locally

# Installation - npm install

# To run - npm test wdio.conf.js

> git status
> git add .
> git commit -m "First version of test suite"
> git push origin master
> git status
>
> ----End of testsuite run----

------Debug sync start----

click (...)

browser.debug();

press enter key

By default mocha testcase completion

timeout = 10 seconds

https://mochajs.org/

Option 1

mochaOpts: {
ui: 'bdd',
timeout: 60000,
},

Change timeout: 99999999,

> npm test (starts the browser)

Dev tools - Console

> $ (".slop a") - press enter - css selector
> $ (".slop a") - press enter
> $x("/html/div(3)") - press enter - xpath selector

Option 2

var timeout = process.env.DEBUG ? 9999999 : 10000;

mochaOpts: {
ui: 'bdd',
timeout: timeout,
},

> DEBUG=true npm test

https://webdriver.io/docs/debugging/

Copy vscode debug session ( lauch.json)
Press F9 in a file
Click on debug icon
Change in option
Press f5 to start debugging

> ------Debug sync End---

------Debug async start--

3. AutoAttach (async)

Open command pallete

ctrl + shift + P

> autoattach
> always

4. Select Javascript debug terminal (Turn off autoattach) (async)

ctrl + P by selecting (debug - toggle auto attach, always - auto attach to every node.js process)

------Debug async end----
----Start of Todo MVC--
C:\1-2ndRound-From-30-Mar-2020\Git-2022\automation>
git clone https://github.com/tastejs/todomvc.git
C:\1-2ndRound-From-30-Mar-2020\Git-2022\automation\todomvc\examples\react>http-server
http://localhost:8080/
----End of Todo MVC---
-----Start of How to instll new application---

1. download package.json
2. do npm install
   if any problem remove node_modules and package-lock.json

---

1. change specs folder

2. baseUrl: 'http://localhost:8080/index.html'
3. maxinstances : 1 (2 places)

//Should enter values using setvalues
//it('should enter value and then delete it
//it('should enter value and then edit it
//it('should create some todos
https://w3c.github.io/webdriver/#keyboard-actions

browser.pause(3000);
browser.keys(['Control','a']);
browser.pause(3000);
browser.keys(['Control','x']);
browser.pause(3000);
browser.keys(['Control','v']);

browser.pause('Enter');
browser.pause(3000);
TodoPage.todoItem1.moveTo(); // hover.
TodoPage.deleteItem1.click(); // This element is not reachable. if the element is not visible
TodoPage.todoItem1.doubleClick();

TodoPage.createTodo('Buy Foods');
TodoPage.createTodo('Buy Foods');
TodoPage.createTodo('Buy Foods');

for (let i = 0; i < 100; i++){
TodoPage.createTodo('Item: ${i + 1}');
}

let list = ['Item 1', 'Item 2', 'Item 3', 'Item 4'];

for(let i=0; i < list.length; i++)
{
TodoPage.createTodo(list[i]);
}

get deleteItem1(){
return $('body > div.container > header > div.col-md-8 > nav > a:nth-child(3)');
}

createTodo(val) {
this.todoField.setValue(val);
browser.keys(['Enter']);
}

---

Problems:

1. Redundant tests
2. Non-Specific tests
3. False negatives

Dynamic selectors:

$ - query selector

$$
- query selector All

// remove browser.pause for clean up ctivities

jsodc - /** */  Press tab
See my notes from page 21 in the file Front-EndAutomation-I & also in the repo

Run
>npm install chai

const assert = require('assert'); - Brings nodejs assert library.
const assert = require( - Brings chai assert library.

Mocha hooks - Before each tests or before each suite(before all tests)

Before - Clean up activities, BeaforeEach, After, AfterEach

Remove browser.pause(3000).

//ms,reverse, error
element.waitForDisplayed(3000);

---Start of FF---

Browser capabilities - To choose browser version
make a copy and rename to wdio_ff.conf.js
1. comment out path
2. browserName: 'firefox'
3. services: ['selenium-standalone'],

npm test wdio_ff.conf.js

npm install @wdio/selenium-standalone-service --save-dev
---end of FF---

waitForDisplayed(timeoutvalue)
waitForExist(timoutvalue);

Here we can remove timeoutvalue from here and then make read from conf file.

waitForTimeout: 3000,

waitForDisplayed();
waitForExist();

beforeEach(() => {
browser.url('');
});
afterEach(() => {
browser.pause(3000);
});

Instead of
using
assert = require('assert')

we can define in the config file.

before: function() {

assert = require('assert');
global.assert = assert;
}
In .eslintrc.json

declare

"assert" : true

in globals section

----------

Windows size

Deteermining

create a file sizes.txt
iPad = 768 x 1024
iPhone x = 375 x 812
desktop = 2800 x 1346
=widthxheight
Setting

before(() => {
browser.setWindowSize(768, 1024);
});

Since we dont know the user window size

we can use like

before(() => {
browser.maximizeWindow();
});
-----
Environments

Method 1

make a copy and rename to wdio_prod.conf.js

change baseurl to

baseUrl: 'https://glitchitsystem.com/element_status_demo/',

Method 2

Passing enviroment to config

create a file named urls.js
module.exports = {

local: 'file:///D:/index.html',
prod:'https://glitchitsystem.com/element_status_demo/'

};

In wdio.conf.js

const url = require('./urls');
let ENV = process.env.ENV;

if(!ENV) { // if not specified
ENV = url.local;
}else{
ENV = url[process.env.ENV];
}

put ENV in the baseUrl

baseUrl: ENV,

if we pass nothig

>npm test -- wdio.conf.js --suite spec3

For Windows

>set ENV=prod&& npm test -- wdio.conf.js --suite spec3

For Mac

>ENV=prod npm test -- wdio.conf.js --suite spec3

----------

Allure reports

npm install @wdio/allure-reporter --save-dev
npm install -g allure-commandline --save-dev


change reporters: ['spec'], to

 reporters: ['spec',

[
'allure', {
outputDir: 'allure-results',
disableWebdriverStepsReporting: true,
disableWebdriverScreenshotsReporting: true
}
]],

>npm test wdio.conf.js
>allure generate allure-results && allure open

To take screen shot
afterTest: function(test){
if(test.error !== undefined){
browser.takeScreenshot();
}
},
disableWebdriverScreenshotsReporting: false
>allure generate --clean allure-results && allure open

Video generation

In confi file

use
const video = require('wdio-video-reporter');

,

[
video, {
saveAllVideos: false,
videoSlowdownMultiplier: 10
}
]

>allure generate allure-results && allure open


-----End of How to instll new application---
$$

> http-server (to start the server)
> ----Start of WDIO Selenium Nodejs--
> https://www.webdriveruniversity.com/

> npm init
> npm install –-save -dev
> https://www.npmjs.com/package/webdriverio
> npm install –-save –dev webdriverio@5.23.0

Delete node_modules

Run >npm install
To install node_modules folder fresh

package.json will be created.

> npm install –-save –dev webdriverio@5.23.0 selenium-standalone@xxx.x

Go to
$ ./node_modules/.bin/selenium-standalone install
$ ./node_modules/.bin/selenium-standalone start
Runs on 4444
http://127.0.0.1:4444
http://127.0.0.1:4444/wd/hub/static/resource/hub.html

Go to https://webdriver.io/ and copy the sample code

npm test wdio.conf.js or node xxx.js

./node_modules/.bin/wdio

See word doc at page 2

Instead of selenium server manually we can specify to start automatically.

1.specify

services: ['selenium-standalone'],

2. npm install @wdio/selenium-standalone-service --save-dev

3. change test folder as
   "test": "wdio" in package.json

Run >npm test

> npm install –-save –dev mocha@latest

run as admin
netstat -ano | findstr :4444
taskkill /PID 8620 /F

change browserName: 'chrome' in capabilities secion

./node_modules/.bin/wdio

sync = false

var baseUrl = 'http://www.webdriveruniversity.com';

baseUrl: baseUrl,

browser.url('/");

> npm test -- --baseUrl=http://www.google.com

1.  Command line
    > npm test -- --baseUrl=http://www.google.com or
2.  Environment variable
    > SERVER=prod npm test or >npm test
    > var baseUrl;
    > if(process.env.SERVER === 'prod') {
        baseUrl = 'https://www.google.com';
        } else {
        	baseUrl= "http://www.webdriveruniversity.com";
        }

> npm install –-save –dev mocha@latest

> npm test -- --logLevel=verbose
> https://nodejs.org/api/assert.html

var assert = require('assert');
assert.equal(title, 'WebDriverUniversity.com');

var assert = require('chai').assert;
var expect = require('chai').expect;
var should = require('chai').should();

var actual = 1;
var expected = 2;

assert.equal(actual, expected);
expect(actual).to.equal(expected);
actual.should.equal(expected);

centralized assertions - Specify in wdio file
before: function (capabilities, specs) {
expect = require('chai').expect;
should = require('chai').should();
},

> npm test -- --spec=tests/chai.js

---

var timeout = process.env.DEBUG ? 99999999 : 10000;
add timeut to mochaopts in wdio conf file

mochaOpts: {
ui: 'bdd',
timeout: timeout
}

add browser.debug() before browser.click();

---

Ranorex Selocity selector – Chrome extension

it.skip, it.only

Using external data

npm install --save-dev sync-request

npm set registry=https://registry.npmjs.org/

> ----End of WDIO Selenium Nodejs----
