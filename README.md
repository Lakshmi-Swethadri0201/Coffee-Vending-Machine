Fully Automatic Beverage Vending Machine

This program controls the process of buying a beverage from a vending Machine.

#Features implemented

1- The vending machine is designed to for an user to 
   • Select a beverage of his/her choice.
   • Provides option to add condiments like Milk and Sugar for the beverage selected.
   • For each extra unit, additional cost is shown and calculated.
   • Calculates total beverage price including additional condiments if added.
   • User can pay the total price and get back the change if there is a difference amount.   

2- The vending machine program is designed to hold all brew functions seperately for each beverage.(Implemented brew as an interface)

3- The project is designed and developed as an Object-oriented model of the vending machine, simulating the functionality, using OO analysis and techniques.

4- No specific design pattern is used as such.

5- This program can be extended to add any new beverage using the same built in brew behavior. And can implement the common functionalities from a parent beverage class.

6- Used method and classes to reduce duplicate codes.
	• Used Inheritance: Designed Beverage as a parent class, and all other beverages such as Espresso, black tea as child classes.
	 Because of which functionalities need not be repeated in the child classes.
	• Used Interface: Designed brew behavior as an interface, such that each beverage can implement this functionality in its own way.
	• Created different packages and corresponding classes to give a clear modularity in the application.	 

7- The inserting coins is not built as an application, it just accepts any money numbers and returns change.

#Assumptions

1- All beverages are hot beverages. 


#Future Implementation:

1- The project can have more functionalty for hot or cold beverage. 
2- Can have additional condiments
3- Can implement functionalities to check inventory and order chain.


Getting Started
This project built in a Java Maven Template and it use Apache Maven to compile and run.

You need to install Apache Maven (https://maven.apache.org/) on your system.

Type on the command line:


# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




