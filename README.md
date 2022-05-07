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
