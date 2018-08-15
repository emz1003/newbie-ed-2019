# How To Clone a GitHub Repository
1. Obtain repository url
2. git clone <repository url>

# How To Commit a File in GitHub
1. git pull - Updates local repository with the one online
2. git status - Lets you see the files that you have changed
3. git add <filename> - Prepares ("stages") files to be committed. Use tag -A instead of the filename to add all files that are untracked
4. git commit -m "<commit message>" - Prepares files to be pushed, add tag -m to add a commit message.
5. git push - Adds the files that you committed to the github repository online

# Making a Branch in GitHub
1. git checkout -b <branch name>: This makes a new branch with the name of whatever you put in, and switches to that branch
2. git push --set-upstream origin <branch name>: This is needed to complete the set up of the branch
3. git checkout <branch name>: This lets you switch branches

# Configuring a Fork in GitHub
1. Fork the repository by clicking on the fork icon at the top right corner of the repository page
2. Clone the fork (see How To Clone a GitHub Repository)
3. git remote -v : list the current configured remote repository for your fork.
origin  <url of your fork> (fetch)
origin  <url of your fork> (push)
4. git remote add upstream <url of original repository>
5. git remote -v: make sure that the upstream url is correct
origin    <url of your fork> (fetch)
origin    <url of your fork> (push)
upstream  <url of original repository> (fetch)
upstream  <url of original repository> (push)

# How To Undo a Mistake
0. How To Undo a Change
    git checkout -- <file>
1. How To Undo an Add
    git reset HEAD <file>
2. How To Undo a Commit
    1. git log : to find the commit id you want to go back to
    2. git revert <the commit id you found>
3. Changed the Case of a File?
    git mv <path of old file name> <path of new file name>
4. How To Remove Upstream
    git remote rm upstream