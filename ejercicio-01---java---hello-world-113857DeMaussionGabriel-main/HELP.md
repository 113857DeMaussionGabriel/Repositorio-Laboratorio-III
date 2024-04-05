# GitHub Classroom Help

Below are the steps we must follow to work with the GitHub classroom assignments.

## 1 - Accept the assignment

We'll copy the assignment URL and paste in our explorer or only make click in the URL assignment. When the student 
navigate to the URL the first step is to find their identifier in the student roster.

![img](/docs/_images/help/help_1.png)

When you accept the subsequent assignment they won't have to do the roster step again. They'll come to this page where 
they can accept their assignment.

![img](/docs/_images/help/help_2.png)

Once our assignment it's ready we receive an url made up with the name of the organization were student code lives, 
the name of the assignment and our GitHub username. We can also see when our assignment is due

![img](/docs/_images/help/help_3.png)

By clicking our URL we'll be taken to our GitHub repository where we can do our work. in this assignment we did not 
add an online ide for the students.

![img](/docs/_images/help/help_4.png)

The students can clone the repository to work on their local machines

## 2 - Clone the repository

To clone the repository we can:

1. Clone with Git Bash console

```
git clone <MY URL TO CLONE>
```

2. Clone with GitHub Desktop IDE

<br/>
<br/>

> :rotating_light: :rotating_light: **IMPORTANT** :rotating_light: :rotating_light: 
> 
> In this type of assignment we are going to work on the **_main_** branch as requested by the GitHub classroom assignment

![img](/docs/_images/help/help_6.png)

## 3 - Open project in our IntelliJ IDE

![img](/docs/_images/help/help_5.png)

The next step it's to open the project in our IDE and do our work. Once the work is done, we need to commit the 
changes and pushed to **_main_** branch.

## 4 - Commit and push to main

To do this you can use this commands in git bash or use the GitHub Desktop IDE

```
git commit -m "My message"
git push origin main
```

## 5 - Check Autograding status

Once the code was pushed to main, you can check the status of your autograding assignment in the 
pull request _"Feddback"_ in the _"Conversation"_ or in the _"Checks"_ tab.

![img](/docs/_images/help/help_7.png)
![img](/docs/_images/help/help_8.png)

