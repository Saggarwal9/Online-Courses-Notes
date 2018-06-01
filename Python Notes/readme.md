### How to run?
cd to the directory having the python script and enter python<VERSION NUMBER> ____.py (python3.6 test.py) .   
Remember, spacing is **critical** in python.  
### Printing and Commenting:
<pre>
print("Helo world!")
print("This syntax is better than python 2.7") #INSERT COMMENT HERE :)
print(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6)
</pre>

### Variables and String literals
<pre>
cars= 100
space_in_a_car=4.0
total_passengers=500
hairs= ['brown', 'blond' ,'red']
x =f"there are {cars} cars"
passengers_not_in_car=(total_passengers - (cars*space_in_a_car))
print("There are", passengers_not_in_car, "passengers not in a car.") #There are 100.0 passengers not in a car.
print("." * 10) #prints . 10 times.
  
# Using string Literals
my_name = "Shubham Aggarwal"
my_age = 21
my_height = 6 #feet
my_weight = 80 #kgs
my_eyes= "Brownish Black"
my_teeth= "white"
my_hair = "Black"
print(f"Let's talk about {my_name}. He is {my_age} years old.")
print(f"He is {my_height} feet long. He is {my_weight} Kilos.")
print(f"He has {my_eyes} eyes, {my_teeth} colored teeth, {my_hair} colored hair")
print("Hi there {}".format("user")) #Another way of using string literals
</pre>

<pre>
formatter = "{} {} {} {}"
print(formatter.format(1, 2, 3, 4))
print(formatter.format("one", "two", "three", "four"))
print(formatter.format(True, False, False, True))
print(formatter.format(formatter, formatter, formatter, formatter))
print(formatter.format(
"Try your",
"Own text here",
"Maybe a poem",
"Or a song about fear"
))

#Output:
1 2 3 4
one two three four
True False False True
{} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {}
Try your Own text here Maybe a poem Or a song about fear
</pre>

Printing a list on python:
<pre>
fat_cat=""" #""" for a multi-lined string
I'll do a list:
\t* Cat food
\t* Fishies
\t* Catnip \n\t* Grass
"""
print(fat_cat)

#Output 
I’ll do a list:
  * Cat food
  * Fishies
  * Catnip
  * Grass
</pre>

### Some libraries
<pre>
from sys import argv #for arguments
from os.path import exists #Returns true if a file exists, based on its name in a string as an argument. 
</pre>

### Some methods
<pre>
round() #Rounds the Number inside
input() #Takes user input. name = input(), age=int(input()) ,age=input("What's your age") Whats your age will get printed.
len() #Gets the length of the string.

#File methods
open(file_name,flag) - returns a file object of the file opened. flag = "w"/"r"/"a"/"w+"/"r+"/"a+" #+ for reading and writing
Fobject.close – Closes the  le. Like File->Save.. in your editor.
Fobject.read – Reads the contents of the  le. You can assign the result to a variable. 
Fobject.readline – Reads just one line of a text file.
Fobject.truncate – Empties the filele. Watch out if you care about the  le.
Fobject.write('stuff') – Writes ”stuff” to the  le.
Fobject.seek(0) – Move the read/write location to the beginning of the  le.
</pre>

### Parameters, Unpacking, Variables, Reading Files
1) Getting input from Argv
<pre>
from sys import argv
script,first,second,third=argv
file_name= "test.txt"
print("The script is called:",script)
print(f"First variable {first}, Second Variable {second}, Third Variable {third}")
txt = open(file_name) # opens the file
print(txt.read()) #reads the string from the file
</pre>

### Methods
<pre>
def print_two(*args): #tells Python to take all the arguments to the function and then put them in args as a list.
  arg1,arg2=args
  .......
  return arg1 + arg2
#or

def print_two(args1,args2):
  ......
</pre>

### Boolean logic
We use var1 and var2 to do and operation, var1 or var2 to do or operation ,not(var1) for not.  
print(3==4 is True) #Returns true or false depending on 3==4, which should be false.  

### Control flow
<pre>
if var1 < cats:
  .....
elif var2 > cats:
  ......
else:
  .....
  
#For loop
change= [1,"pennies",2,"dimes",3,"quarters"]
for number in change
  print(f"I got {number}")
  
elements=[]
for i in range(0,6): //0-5
  elements.append(i)
  
#While loop
while i<6:
  .....

</pre>
