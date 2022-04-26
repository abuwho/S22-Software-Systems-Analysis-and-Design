# ssad-team42

**Design Patterns**

The main design pattern of our project was implemented is an **chain of responsibility**. We used a chain of responsibility pattern as our implementation uses tracking system where both: customers and stuff are able to check the package's location. Chain of responsibility allows to go through all points of track and see what is the current position of the box. Applying such pattern we can check every step to determine whether package was lost or has came to the client.


**System Details**

Users are splited into two User's types:stuff(workers) and clients(customers). The transport method is also includes aeroplane,ship, track.


**Code Elements**

Class Location for getting the location of the package. Class Package consists of package number, location of it and transport method. Class User includes email of the user, user's password and a type of user(customer or stuff). We have an abstract class Base Handler with three extended handlers: User exist to check whether we have such an user in our base, Validate Passport to check the corectness of password. The third is Role Check to determine who user is : stuff or a client.


**UML diagram**

UML diagram for our system shows all classes, abstract classes, interfaces, and relations within our program, which was implemented in the Java programming language.


The diagram can be accessed through the link below:
https://app.diagrams.net/#Hhur41r4%2Fssad-team42%2Fmain%2Fteam42.drawio
