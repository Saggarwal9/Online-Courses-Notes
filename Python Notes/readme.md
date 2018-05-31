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
x =f"there are {cars} cars"
passengers_not_in_car=(total_passengers - (cars*space_in_a_car))
print("There are", passengers_not_in_car, "passengers not in a car.") #There are 100.0 passengers not in a car.
print("." * 10) #prints . 10 times.
  
#Using string Literals
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

### Some methods
<pre>
round() #Rounds the Number inside

</pre>
