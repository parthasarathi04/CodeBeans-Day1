#CodeBeans-Day1
Day 1 of 5 day Coding Challenge <C{o}deBeans/> 1.0 by CoffeeBeans Consulting

#The Game Show Problem
Assume you're on a game show and you're offered three doors to choose from. A brand new sought after automobile, is parked behind one door, while goats are parked behind the others. They are placed randomly. (Remember Micky Rosa...).The game show host now throws the spotlight on you and asks you to choose any door behind which you think the dream automobile is placed. You pick a door of your choice. Once you have confirmed your choice, the host does NOT open the door. Here is where the trade comes in. The host is aware of what is behind which door. So instead of opening the door that you called out, she makes it interesting and opens a door from the remaining two. And behind this door, stands a bleating goat. 
The host closes the door again, looks at you and asks if you want to continue with your first decision or swap to the one door that has neither been picked nor opened. 

Sample. 
Assume you selected door 1 and the host unlocks door 3, which contains a goat.
"Do you want to switch to Door Number 2?" she asks.
Is it in your best interests to change your mind?

*Note - The player can choose any of the three doors at first (not just door 1), the host will open a different door revealing a goat (not necessarily door 3), and the player will be given a second choice between the two remaining unopened doors.

Run a series of random game simulations to derive and prove your answer to the question above. Simulate atleast a thousand games with three doors and show us with data your chances with either strategy i.e. sticking to your first choice or changing it. or any other strategy you can think of. 


#Requirements
*Java 8+

#Run
`javac TheGameShow.java
java TheGameShow`

#Example outcome
`Number of Test Cases : 1000
Stay : count 354 = 35.4%
Switch : count 646 = 64.6%`
