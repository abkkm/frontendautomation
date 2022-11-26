SVN Terminology

1. Repository: Location where we will store our files

2. Repo URL: For every repository URL will be available

3. Checkout: Taking files/code from repository to our machine for first time

4. Add: New files we created in machine should be added (making eligible for commit)

Directly we can commit and push

For old files we need to do svn update & commit

5. Commit/Check-in: Pushing files from local machine to repository

6. Verion ID/Revision ID: For every commit version-id will be generated

7. Diff: Comparing working copy with working base

8. Update: Taking latest changes from repository to local system

Note: When we want to commit existing files to repository, alway we have to compare our local file with repository file and take update if required then only commit.

What is conflict and when we will face Conflicts?

When we take update of a file there is a chance of getting Conflict.

If working base and working copy having changes in same line then update operation will give Conflict.

When Conflict occured, temp files will be created and junk characters will be added to our file.

Manually we need to delete temp file and junk characters then we have to commit.

Revert

Reverting changes from current version to previous version.

Usercase: We are working on Bug fix (Bug-120) and made few changes in code and committed those changes. After our commit TL told that bug is invalid please remove your changes.

Lock

When mutliple team members are working there is a chance two developers will try to commit the same file at the same time.

First i will lock the file --> Then i will proceed with my commit

Note: When i acquired lock on a file, until i release the lock you can't commit that file

Branches

In Project, developers will be divided into multiple team

1. On going development team (new requirements development)

2. Bug fix team (on going dev bug fixes)

3. M & O team (Production issues fix)

For every team seperate code base will be maintained in the SVN

trunk (ongoing development)

branches (SIT & UAT env code)

tags (Production code)

While creating the above respositories we need to mention single project

---

Checking out project
Local workspace setup
run app locally

Tortise SVN - diff, update
Tortise SVN - Show log - select revision - compare revision
Revert - revert from current versio to previous version
Tortise SVN - Revert to this version
Tortise SVN - Get lock / release lock
