# Java Design Patterns
A repository containing basic examples of different java design patterns

## Contents
- [Strategy Design Pattern](https://jaenuguid.github.io/Java-Design-Patterns/#sdp)
- [Observer Design Pattern](https://jaenuguid.github.io/Java-Design-Patterns/#odp)




## Strategy Design Pattern<a id="sdp"></a>
<img src="https://github.com/JaeNuguid/Java-Design-Patterns/blob/master/Strategy%20design%20pattern/strategy-design-pattern.png?raw=true" height="350" width="600"/> <br/>
Strategy Design Pattern allows the algorithm to vary independently from clients that use it. It helps on designing a flexible and reusable object-oriented software.
<br/>
The ability to store and retrieve a reference to some code in a data structure is the fundamental prerequisite in order to implement Strategy Design Pattern. This is achievable by mechanisms as the native function pointer, the first-class function, classes or class instances in object-oriented programming languages, or accessing the language implementation's internal storage of code through reflection.

## Observer Design Pattern<a id="odp"></a>
<img src="https://github.com/JaeNuguid/Java-Design-Patterns/blob/master/Observer%20design%20pattern/observer-design-pattern.png?raw=true" height="350" width="600"/> <br/>
The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
<br/>
In the example that we have, LottoGame is the subject, while Players are the dependents. When LottoGame draws/rolls, it notifies all the Players, and then the Players fetch the result from LottoGame.
<br/>
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.


<br/><br/><br/>
## Disclaimer
All information stated above including the source codes and uml diagrams is provided in good faith for guidance and reference purposes only. It is of a general informational and educational nature, and the owner of this repository takes no legal responsibility for the accuracy of the information provided via this page.
