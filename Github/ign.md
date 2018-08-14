Linux System Command

ls
Ls -alh 
Pwd
Whom
touch 
Which shows if a command exist

Steps to have your own Shell commands:
Install shell code from VB
In shell enter “code ~/.bash_profile” without quotes
In bash_profile - use shell scripting to make your command
Example: alias hello=“echo ‘hello world’” (no spaces)
Save, in command prompt use source ~/.bash_profile to load the profile
Then the command is usable.


Git status - shows the current branch you’re in and displays the file that has been changed and not committed 

Git add <file_dir>: adds the file into a staging area 

Git checkout -b <branch name>: creates a branch

Git commit -m “description”
Git pull master - pulls the latest version of the branch.

Git push origin <branch name> - pushes the code to the main repository 

Git diff - shows the difference 

Git checkout -- <file name> - resets the file to the last repo commit

Git checkout master = move to the master branch
-b = create a branch and move to the branch. 

Git reflog - shows the history of commands
Git reset —hard <id from reflog> - goes back to that command
Git stash - Stashes your current changes
Git stash apply - applies the stashed changes to the current branch

Git cherry-pick <commit_id> : only refers to the changes with the commits

Git rebase - shows commit history where you can keep, squash commits.
Git rebase -i <commit id>~1

Git always have one branch - the master branch (starting point). The master branch is the reflection of the stable state of the program. 

After committing, you essentially create a new branch of commits, until you put it in master. 
