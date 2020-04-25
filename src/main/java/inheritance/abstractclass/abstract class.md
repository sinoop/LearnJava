###Abstract class 
:smile:
   - may or may not have abstract methods
   - can contain implemetations as well
   - cannot be instantiated
   - If a subclass is inheriting the abstract class , but it is not implementing all the abstract methods, then the child class needs to be declared abstract   

#### When to use abstract class : (https://dzone.com/articles/when-to-use-abstract-class-and-intreface)
   - If you want to share code among several related classes
   - You expect that classes that extend the abstract class have many common methods or fields ore require access modifiers other than public (protected and private)
   - You want to declare non static or non final fields.  This enables you to define methods that can access and modify the state of the object to which they belong.


