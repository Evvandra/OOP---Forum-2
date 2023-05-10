# OOP---Forum-2
Evandra Harya Putra - 2602118433(L2AC) OOP Forum week 9

1.(a) By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)

- class is consider as a template/blueprint for an object that we want to create. on example of a class is
    a car class will contain the color of the car, the top speed of the car. on the other hand, instantiation class is
    the actual object we want to make by using the template/blueprint that the class provided.

The different modules in the program each open a graphical user interface (GUI). Each GUI has a similar design but contains differences specific to each module.
(b) By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)

- example 1 = a "employee" superclass that allows the different characteristics of car to inherit the common characteristics
    to its sub-classes
- example 2 = The Ui for the monitor contain the main element in the GUI superclass that is inheriting from its parent

(c) Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)

- Libraries contain prebuilt and usable codes that could be used to perform general tasks in the administration program
     by using libraries, it reduces the development time since developers dont have to spend significant amount of time to trial
     and error numerous amount of code to perform general task.
     
2.(b) Explain why accessor methods are necessary for the SalesPerson class. (3 points)

- when we declare a variable that is private, we are unable to access the value from the outside of the class, therefore we have to use accessor to 
  in order to get the access to the value.
  
(c) (ii) Outline a negative effect that a future change in the design of the Sales object might have on this suite of programs. (2 points)

- by changing some of the codes in the sales object, we might have to change some of the code in Salesperson, since both of the class are related.
  example = if we have to change the type of string in Sales class, we have to change it also in SalesPerson class.

A further class in this suite of programs is the Payroll class. This class is run at the end of each month to calculate each salesperson’s salary, which is based on the sales that have been made during that month.

(h) Suggest changes that must be made to the SalesPerson class and/or the Sales class to allow these calculations to be made. (3 points)

- in the sales class, we have to add one variable which is date variable. we also have to change the constructor and add getter and setter for the date variable. we also have to rewrite the method for Calctotalsales.

(i) Discuss the use of polymorphism that occurs in this suite of programs. (3 points)

- one of the example of polymorphism that has been applied to this code is in Salesperson class, where there are 2 constructor. this is an example of overloading which means same name, different signature, same classes. the code will execute one of the constuctor based on the parameters whereby the parameters align with the calling statement's arguments
