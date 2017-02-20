# Teaching-Java

**Lesson 1:**

Start without IDE (Notepad++ instead) first. Make a file called Test.java, completely blank, add class Test to it, then main method. Ignore package for now. Make variables, methods.

Mention codingbat.

Basic Syntax, main Method, Print Statement, Comments, Import? (Package?)

Primitive Data Types (only basic ones, null) and Arrays

Operators:
&&, ||, !, ==, <, >, <=, >=, !=, %, +, -, /, *,
== does not work on Strings because it checks if both Strings point to the same object in memory.
s1 = "1"
s2 = "1"
s1 == s2 gives false since, although they are the same String literal value, they refer to different instantiations of that; different memory locations.
s2 = s1
s1 == s2 gives true since now both s1 and s2 point to the exact same location in memory.
This is called object equality; using String.equals(Object) method is a form of functional equality. In python, == equates values whereas the keyword “is” equates object locations (equivalent to the java == version).

Control Flow:
if, else, else ifx, break, continue?

Loops:
for (counter and for-each), while, recursion?

for-each -> read colon  (:) as "in"


**Lesson 2:**

Object Orientation:
classes, objects, extends, implements, interfaces, abstract classes, abstract methods, enumerations?
Show example without OO then one with it (e.g. game with variable for each player vs object for each player)
Constructor -> called with “new” keyword.
public, protected, default (access modifier, which is nothing), private
static vs not
final

**Lesson 3:** (if possible)

GUI:
JavaFX ONLY. FXML and CSS mini tutorials needed.

**Java Challenges:** (sort into lessons)

 - Generate an array of numbers from 1000 -> 0, inclusive, in that order.
 - Print every odd number from 0 -> 100

**Python Challenges:**

- Input three numbers, verify each one infinitely many times, print average.
- Input a temperature (in celsius): if it’s less than -30, tell the user “you really shouldn’t go outside”, if it’s between -30 and 0, tell the user “all the water should be frozen by now”, if it’s between 0 and 30 tell the user “nice and toasty” and if it greater than 30 tell the user “too hot, stay inside”. Validate input (floats acceptable), ask user infinitely.
- Make a function that takes a multi-dimensional array as input, with either an “O”, “X”, or “” in each position. Check and return who the winner is (valid returns: “O”, “X”, None). The array will always be a 3x3. Then try make it work with an nxn grid.

