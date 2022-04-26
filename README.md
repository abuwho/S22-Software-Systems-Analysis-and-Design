# Internet-Based Live Courier

# Tracking And Delivery System

### Course: Software Systems Analysis and Design

## Submitted by

#### Abu Huraira (a.huraira@innopolis.university)

#### Mostafa Khaled Mostafa Mohamed Aref Kira (m.kira@innopolis.university)

#### Daria Verevkina (d.verevkina@innopolis.university)

#### Vladimir Rublev (v.rublev@innopolis.university)

## Internet-Based Live Courier Tracking And Delivery System

According to Alexander Shvets, “ **Chain of Responsibility** is a behavioral design
pattern that lets you pass requests along a chain of handlers. Upon receiving a
request,eachhandlerdecideseithertoprocesstherequestortopassittothenext
handler in the chain.” [1]

The main design pattern of our project was implemented is the **Chain of
Responsibility.** Weuseda **Chain ofResponsibility** patternasourimplementation
uses atracking system whereaClientcan make a requestand therequestgoes
throughaseriesofHandlersofrequestsandultimatelyexecutestheClient’srequest.
Chain of responsibility allows togo throughall points oftrackandseewhat isthe
current positionofthebox.Byapplyingsuchapatternwe cancheckeverystepto
determine whether the package was lost or has reached the client.

### System Details

Usersaresplitinto 5 types:CUSTOMER,CUSTOMER,DISTRIBUTIONCENTER
ADMIN,AIRPORTADMIN,ROADTRANSPORTADMIN,PICKUPPOINTADMIN.
The possible locations of agivenPackageare implemented asan Enumeration
(DISTRIBUTION_CENTER, AIRPLANE, TRUCK, PICKUP_POINT). Each user is
able to see the location of the package upon successful execution of authentication.

### Code Elements

Wehaveimplementedtheclass _Location_ forstoringthelocationofthepackage.The
class _Package_ consists of the information about a package. Also, the class _User_
includes the email of the user, the user's password, and a type of user (which is
implemented using an Enumeration). We havean abstractclass _Handler_ with three
extended handlers: **ValidateUserExistsHandler** tocheck, **ValidatePasswordHandler**
tocheckthecorrectnessofthepassword.Thethirdis **RoleCheckHandler** todetermine
theuser’sroleinthesystem.Afterhandlingallthesegmentsoftherequestthesystem

finally executes the request.

As perthe projectdescription, theprojectisfurtherextendibleintroducingabarcode
scanningsystem,wheretheclientmaymakearequestjustbyscanningthebarcode.
Afterimplementing ahandlerforretrievingtheinformationfromthebarcode,thedata
then would be passed on to the existing handlers to deal with the request.

### UML diagram

```
UMLdiagramforoursystemshowsallclasses,abstractclasses,interfaces,and
relationswithinourprogram,whichwasimplementedintheJavaprogramming
language.
```

Thediagramcanbeaccessedinthe **UML.svg** inthesubmissionfile.Alinktoapublic
repository on GitHub has also been provided.

### Repository

**-** https://github.com/hur41r4/ssad-team

## References:

1. Shvets, A., 2020. Dive Into Design Patterns. 1st ed. p.256.
