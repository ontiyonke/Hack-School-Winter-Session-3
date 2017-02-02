# Welcome this is the official repo for project 3
##UCLA ACM HACK

If you've missed the third session, check out the blog post first: http://hackucla.com/blog/session-3-user-interfaces/

##What do I turn in
For beginners you should solve all of the listed short exercises and receive points for completing those. These are unrelated to the project skeleton in this repo. For intermediate/advanced students you can work on the weekly project with your team, and receive points for completing that. You can only get credit for one or the other, but not for both so choose the one most appropriate for your skill level. Please only submit one .zip file per team. Include the contents of your entire android project, and also provide your team access code (Found on Hack School Dashboard) in a text file. Otherwise you will not receive credit! 

##Grading
Submissions will be due 1 week from the session, but we will accept late submissions taking some points for each day it is late. The lateness penalty for an assignment that is submitted between N and N+1 full days late (where N is nonnegative) is 2^N % of the assignment's value. That is, the penalty is 1% for being up to 1 day late, 2% for being from 1 to 2 days late, 4% for being from 2 to 3 days late, and so forth.

##Beginner Exercises

######Exercise 1:
1. Attempt to create the following using relative layout. You don't have to use these particular color choices.
![](https://s3-us-west-1.amazonaws.com/acm-hack-ghost/2017/02/Exercise-week-3-part-2_nexus5x-portrait--1-.png)

######Exercise 2:
1. Attempt to create the following using linear layout. You don't have to use these particular color choices.
![](https://s3-us-west-1.amazonaws.com/acm-hack-ghost/2017/02/Exercise-week-3_nexus5x-portrait.png)

######Exercise 3:
1. Choose two random images on the web
2. Create two ImageButtons using the chosen images
3. Overlay one button above the other using relative layout
4. When screen is pressed one image should fade in and the other should fade out. When pressed again the current image should fade out, and the other should fade in.

Note: Put all of your exercises into the same android project when submitting

##Intermediate/Advanced Project
The project is for intermediate/advanced students. If you are feeling confident you can attempt to 
complete the project without the skeleton, but it will be a lot easier to use it. We will be uploading the project solution later on, so if you haven't cracked it by then look at the solution to learn the correct implementation.

###Instructions
The goal is to build a tic tac toe game with as little guidance as possible, so try to come up with unique solutions when you run into problems. You're being given lots of flexibility so come up with your own implementation: grading will be very generous. You should implement the two functions left blank in Main Activity and finish the xml file to add in the remaining UI. 

######dropIn function 
* This function should be used to drop in image views when pressed
* It should update the game state and active player
* It should determine if somebody has won the game
* If game is over it should display a dialog indicating winner
* It should check for draws
* Optional: Add in cool animation that causes tiles to fly in or fade in

######playAgain function 
* Should reset game to initial state, and update all variables
* It should hide dialog box

###Hints
* Start with the xml layout and add in missing image views for tiles
* Look up creative uses for tags
* Onclicklistener is not needed when the xml has it already defined
* Linear Layouts can also be added using id in the code
* layout.setVisibility(View.INVISIBLE) can set a view to be invisible

###End Product Goal
![](https://s3-us-west-1.amazonaws.com/acm-hack-ghost/2017/02/Tic-Tac-Toe_nexus5x-portrait--1-.png)
