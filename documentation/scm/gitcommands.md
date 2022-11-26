git add .
git commit -m "add more files"
git push origin HEAD:master

Git
Create a directory
Git init
Ls –a
Git status
Git add (. To add the files to the staging area)
Git commit –m “commit message”(Present tense)
Git log
git diff chapter3.txt
git checkout chapter3.txt
git remote rm origin

> git remote add origin https://github.com/goodfuture-start/Myrepository.git
> git push -u origin master
> git clone https://github.com/austinzheng/swift2048.git
> git rm --cached -r
> https://github.com/github/gitignore

create a new branvh

> git branch alien
> git branvh
> switch to alien
> git checkout alien
> create a new branvh
> git branch alien
> git branvh
> switch to alien
> git checkout alien
> merge to master
> go to master branch
> git merge alien-plot
> git log
> git push origin master –u
> ----Start of Branch----
> git merge (Merge with local copy)
> git branch -d branchname
> git branch
> git branch new_branch
> git checkout new_branch
> git branch -D branchname (force delete)

> git checkout . ( to go to previous version)

> git commit --amend
> git commit --amend -m "New commit message"

> ----End of Branch----

> git checkout . ( to go to previous version)

> git rm --cache filename.js
> (Moves files to untrack files from staged area)

> git checkout commitid

> git commit -am "Changed Background color"

----Start of diff----

> git reset --hard (gitrepo goes to previous version. we can not undo it. so careful.

> git reset --hard commitid(gitrepo goes to previous version).

> git diff ( all files)
> git diff index.html (only specific file)
> git reset --hard (remove all commits)
> git branch
> vi dfd.htm
> git diff
> git commit branch -m "Add"
> git diff master
> (compares local copy with master branch)
> git log
> q to quit if large

To check two commit(take first 6 characters)

> git diff 12121 345345

----End of diff----

---Start of merge----
create a repo
craete a text file with text
commit new file with message
create a experimental branch
made changes to the file
We have pull request in master branch(because we have
a branch file changed that is not refltected in
master branch)
So check the changes click on create pull request
button(which is going to merge)
Give some commit message then press confirm merge
button
Go to insights-network to see in graphical view
---End of merge----

Forking and Pull request
Fork - making copy of another repo

---

Working dir - git add - stagin area - git commit - local rep - git push - remoe repo

git pull - from remote repo - working directory
git checkout -local repo - working directory

---

1. In github
   create a project name WebDriverMaven
   This is a demo GitHub project
   select .public
   then click create repository

---

2. In eclipse create a new maven project in GitWebDriverMaven worspace
   select simple project

group id : com.test
artifact id : webdriverMaven

search for selenium maven dependency
add in pom.xml
same for testng maven dependency

First way

then run LoginTest.java as normal testng test
Results says it is passed

Second way
pom .xml - run as maven test

if the build is sucees only we deploy to maven

generate ssh key
$ssh-keygen -t rsa
saved in /c/Users/HP/.ssh/id_rsa

id_rsa.pub
created the above file is used for remote repository
paste the contents in github-ssh keys(settngs)

> ssh -T git@github.com

We are ready to push the code

Go to C:\Eclipse-workspace\From07082019\Java\selenium\Data-Driven-Framework1\webdriverMaven

> git init(to make our project compatible with Git)
> git add pom.xml
> git add src/
> git commit -m "Initial commit"
> git remote add origin https://github.com/goodfuture-start/WebDriverMaven.git
> git push -u origin master

code changes trigger Jenkin to run a build
after integration testing the code will be deloed to the staging

---

git config --global user.name "abkkm"
git config --global user.email xxxxxxxx.tech@gmail.com

---

git pull origin master(to merge master's changes with our local branch)

git config --global --list (To see our email configured)

:q enter

-------------https://www.jquery-az.com/git-merge-branch-command/-------

Initializing Git command - $ git init
Adding a repository
$ git remote add origin "repo URL"
$ git remote add origin "https://github.com/git-test-jaz/hello-git.git"
Creating a branch command $ git branch_name
$ git checkout branch_name
For creating a new branch and checkout by the single command:
$ git checkout –b branch_name
Removing a branch $ git branch -d <branch-name>
$ git branch –D my_branch (delete not merged branch)
Listing branches $ git branch –a
For only remote branches: $ git branch –r
Adding files command $ git add file_name
$ git add header.php
$ git add folder/file_name
$ git add file1.txt file2.txt header.php footer.php
$ git add . or $ git add –all
git rm file_name
$ git rm footer.php
To keep the file in the file system and just removing it from working tree: $ git rm –cached footer.php
For removing a directory: $ git rm –r folder_name
$ git rm -r images
$ git rm -r --cached images
$ git rm file1.txt demo/file2.txt file-3.txt
$ git commit -m "message for the commit"
$ git commit --amend -m "Provide the new message here"
Adding/committing by single command:
$ git commit -a -m “message for the commit purpose”
For committing hunk of a file, use the –patch flag:
$ git commit –patch
Undo last commit commands
The reset command can be used to undo the last commit:
$ git reset --hard HEAD~1
The above command will move the HEAD back to the previous commit and any changes (file addition, removal, modifications) are undone.
Keep changes and move HEAD to the previous commit
$ git reset --soft HEAD~1

Download content by pull command
For downloading content from the remote repository to your local system and merging, use the git pull command:

$ git pull origin master
Where origin is the name of the remote repository and master is the branch name. You may set the name other than origin as adding the remote repository.
For example:
$ git remote add my_repo https://github.com/git-test-jaz/hello-git.git
In that case, the above pull command will be:
$ git pull my_repo master
Pull command without new merge commit:
$ git pull --no-commit <remote>

The fetch command
The fetch command only downloads the content from the remote repository.

Example:

$ git fetch origin
The merge command
For joining the two or more histories or developments, use the merge command. The pull command is the combination of fetch + merge.
An example of showing the sequence of merge command can be:
$ git checkout master
$ git branch demo-branch
$ git checkout demo-branch
$ git add footer.php
$ git commit –m “added footer component”
$ git checkout master
$ git merge demo-branch

So, we created a new branch based on the master branch. This is followed by adding a new feature – the footer in the demo-branch.
The changes are committed and then we merged this demo-branch feature into the master branch.

Uploading the content by push command
The push is the opposite to the pull command; to upload the content, any changes made to the remote repository.

$ git push origin master
For uploading multiple branches:
$ git push origin --all
If you find merge conflicts as trying push command, you may use the –force flag:
$ git push origin master --force
However, you should this command carefully.

Creating a new branch on the remote server
$ git push origin hello-git-branch

Merging with the master branch
For merging the new changes with the master branch so it is updated, checkout to master branch again:

$ git checkout master
Just for the sake of confirming things, I ran the $ ls command for master branch:
You can see, there is no footer.php file.
Executing the merge command
$ git merge footer-feature
Again running ls command:
$ ls
6.0_5-Git-revert-commit.png footer.php README.md test.php
You see, our new footer component is added in the master branch.

Merging remotely
Run the push command as follows for updating the remote repository:

$ git push origin master
Or, if simple push command does not work, you may run:
$ git push origin master --force
Note: Generally, you should run push with –force option very carefully. Otherwise, this is considered dangerous. Only use –force option if you know what are doing.

Use case – What if master and feature branch conflicts while merging?

As this developer tries to push the work by this command:
$ git push origin master
The git returns an error message as shown below:

This error can easily be resolved by running the pull command and update your local repository with the remote as Developer 1 has added the footer.php file whereas your local repository does not.
$ git pull origin master

As you run this command, Git simply asks to enter a message that why this merge is necessary.

Enter a message in the editor and press: Esc : wq from the keyboard.

The developer 2 local repository should be updated and the local directory should show the footer.php file as well.

Now, if you run the push command again:

$ git push origin master
It should upload the sidebar.php file in the remote repository as shown below:

Scenario # 2 – working on the same file

$ git pull origin master

That is, it resulted in a conflict of code in the footer.php file.
If you open the file from local directory to your editor, you will see code like this:

So, it contains the code of both developers and Git adds markers to distinguish it wherever conflict occurred.

How to resolve this conflict and merge?
One of the ways for resolving this conflict is to open the filer in the editor or within Git. Find out the markers that Git identified as conflict and remove those after carefully looking at the code.

You can see three markers in the above graphic. After removing these, add the file and then commit:

$ git add footer.php

$ git commit -a -m “Their and Our changes are fixed – Commit 3”

After that, run the status command:

$ git status

This should return:

On branch master

nothing to commit, working tree clean

Now, execute the push command for making changes on the remote repo:

$ git push origin master

After the push is successful, check the online repo.

git push origin HEAD:master

How to revert a merge?
After a merge is done by using the git merge command, you may undo this by using the reset command. For example:
1
$ git reset --hard HEAD~1

An example of using git push command

a local repository is created in a directory named push-test. This is empty at this stage.
$ git init
$ git remote add origin https://github.com/git-test-jaz/push-tst.git
$ git pull origin master
$ git push origin master

$ git push origin --all
$ git push origin master --force (others changes will be lost)

The example of using other remote name and branch-command/-------

Until now, we have been using the origin as repository name and master as the branch name. In certain scenarios, you may require using some other repo name and branch in the push command.

In this example, we will look how to push changes on some other branch and with different repository name.

The target command for this example is:

$ git push demo1 feature-br

Where demo1 is the same remote repository on Github that I used in above examples and feature-br is a branch based on master branch.

For that, I have created another local directory and started Git Bash there. In the Git terminal, ran the following commands:

Initialized Git:

$ git init

Adding a repo with the name of demo1:

$ git remote add demo1 https://github.com/git-test-jaz/push-tst.git

So, this is where the name of the repository is set if other than the origin.

Pulling the online repository content

$ git pull demo1 master

After successfully downloading all content by pull command, creating a local branch based on the master branch:

$ git checkout -b feature-br

This command is the shorthand for creating and checking out a branch i.e.

$ git branch feature-br

$ git checkout feature-br

After creating a branch, I added a feature file “footer.php” for demo only:

$ git add footer.php

Committing the file into that feature-br branch:

$ git commit -m “Added footer feature by Dev3”

Finally, to the point of executing our target command;

$ git push demo1 feature-br

This results in creating a new remote branch and a commit ahead of the master branch:

How to undo removal operation of a branch?

$ git branch hello-git-branch 7f5faa4

(The SHA1 7f5faa4 will vary, so take the code from your Git Bash).

This command should create the branch from the same point where this was removed.

The SHA1 code mentioned above can be found immediately after you removed a branch and want to recover the branch. However, if you cleared the screen or restarted the Git Bash then this code won’t be visible.

How to delete branches in Github (remotely)?

See how this branch is removed by this command:
git push origin –delete hello-git-branch

Create the branch remotely

$ git push origin br-tst-1

$ git remote add my_test https://github.com/git-test-jaz/hello-git.git
$ git branch tst_multiple_br
This is followed by checking out this branch:

$ git checkout tst_multiple_br

Now add the text file in that branch locally:

$ git add tst1.txt

Committing the file added:

$ git commit -m “File added for multiple repo test”

And finally pushing this branch and file in our target remote repository i.e. my_test

$ git push my_test tst_multiple_br

---

github.com/coreybutler/nvm-windows/realeases

download nvm-setup.zip

> nvm list available
> nvm install 8.11.4
> nvm use 8.11.4
> nvm list (installed)
> node -v
> npm -v

> rmdir front-end /s

---

Git

> git fetch - Fetches the changes information
> git pull - Fetches the changes information + Pull the information
> First time git checkout - pull the changes

Fork - Make copy of other responsitory(Needs permission to pull/push)

---

// ===================
// Test Configurations
// ===================
// Define all options that are relevant for the WebdriverIO instance here
//
// Level of logging verbosity: trace | debug | info | warn | error | silent
logLevel: 'debug',

const drivers = {
chrome: { version: '99.0.4844.51' }, // https://chromedriver.chromium.org/ '95.0.4638.69'
// firefox: { version: '0.29.1' }, // https://github.com/mozilla/geckodriver/releases
// chromiumedge: { version: '85.0.564.70' }, // https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
};

change id to your id

after running the command it will give your new id

node run --apps=mycart --env=stage --id=63428 --channels=click --browsers=chrome noretry
In wdio-local.js file
change to your browsers version

const drivers = {
chrome: { version: '99.0.4844.51' }, // https://chromedriver.chromium.org/ '95.0.4638.69'
// firefox: { version: '0.29.1' }, // https://github.com/mozilla/geckodriver/releases
// chromiumedge: { version: '85.0.564.70' }, // https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
};

Node version - 12.16.1

---

Ctrl + P - To open a file in visual code
F1- To invoke command line

---

Create a branch under develop branch

> git fetch
> git checkout newlycreatedbranch
> git branch

------Start of Conflits-----
------Start of Method 1-----

Fr -
Keep current(keep current feature branch changes)
Keep incoming(keep main branch changes)

> git fetch
> git branch -r
> git switch bugfix
> git add .
> git commit -m "changes done"
> git push (to bugfix)

I have fixed the bug. Please merge it to main.

This branch has conflicts with main.
[merge bugfix into main]

> git merge main
> git switch main
> git pull
> git switch bugfix
> git merge main
> git switch main
> git remote -v
> git pull

local is with master branch
so need to change main branch

> git pull -u origin main
> git status
> git pull origin main
> git branch --track origin/main
> git status
> git pull
> git switch bugfix
> git merge main
> git status
> git add
> git commit -m "resolve conflicts"
> git push
> git switch main
> git pull
> git status
> git pull origin main
> ------End of Method 1-----
> ------Start of Method 2-----
> From master branch create
> git branch conflictdemo(create branch)
> git checkout conflictdemo
> vi welcome.txt
> git add welcome.txt
> git commit -m 'conflict-demo'
> git branch
> git push origin conflictdemo
> After pushing to to github
> raise PR request(select from our branch conflictdemo)

Immediately conflict message apears in github

We can merge only these conflicts solved.[merge from conflictdemo - master)

So go to conflictdemo and pull the changes from the master

conflictdemo >git pull origin master

> vi welcome.txt
> git add welcome.txt
> git commit -m 'resolved conflicts'
> git push origin conflictdemo

Now conflict message disappears. Then merge request( conflictdemo - master)

------End of Method 2-----
------End of Conflits-----
git push origin HEAD:master

---

----start of stash-----

> git branch
> git branch -D difftest
> git branch dummy
> git checkout dummy
> git checkout master
> git checkout --force master
> git checkout dummy
> git stash save dummy_changes
> git checkout master
> git checkout dummy
> git stash list
> git stash apply
> git stash apply dummy_changes
> git stash apply stash@{0}
> git diff
> git stash pop
> git stash -m "nothing"

> git stash clear
> git stash list
> git status
> git stash drop stash@{1}
> git stash list
> git reflog stash

----End of stash-----
