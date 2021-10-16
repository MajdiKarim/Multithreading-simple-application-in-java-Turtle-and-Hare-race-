# Multithreading-simple-application-in-java-Turtle-and-Hare-race-
This is a simple example on how to apply threads in java. We implements thread to simulate a race between a Turtle and a Hare (in which the Hare will understimate the turtle and ends up losing the race).
We are going to apply threads to this application, it's a very simple example that helps grasp the concept.
First, this work is done using the Eclipse IDE, therefore at the top of each file, the package name appears and yo will need to update it depending on the your package name.I strongly recommend you to use eclipse IDE.

Problem set :

You are asked to implement the story of the hare
and the turtle.

 The hare and the turtle start the race.
 The hare is sleeping in the middle of the race, thinking he
is too fast than the turtle.
 The turtle continues to move slowly,
without stopping, and wins the race.

I would advise you to try on your own before moving on to the solution.





**SOLUTION**

How to run the java code : 
You will need to run the Main class in which all entities are initialized.

We have tree java classes : 
The turtle and hare are modeled using threads (two programs that are going to run independently and concurrently).
The winner of the race is the candidate who travels 25 units the first. 
Turtle : this class extends threads which means it's a sort of thread that we will customize by overloading the run method. 
This class inherits all the characteristics of Threads, which means we will be able to initialize it using the superclass constructor. 
the turtle thread will run within a loop, and will "advance forward" by units every 8000 ms. The thread ends once it travels 25 units

Hare : this class extends also threads which means it's a sort of thread that we will customize by overloading the run method. 
This class inherits all the characteristics of Threads. The hare will be moving in a much faster face 5000 ms/unit, and once it travel 15 units, will stop advancing
and sleep for some times 100 000 ms, thinking the turtle wouldn't be able to catch up. The thread ends once it travels 25 units

Main :
This is the main thread, that will start both the turtle and hare threads. The main thread will wait for the turtle thread to end, since we already know it in advance,
Once the turtle thread ends, the main thread will kill the hare thread and declares the turtle as winner. 

That's it thank you for consulting this repo, I hope it helps you understand threads. 
I would love to hear feedbacks about this example, and potential improvement ideas to improve it.   
