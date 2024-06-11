# Design Patterns with Java (LLD)
by Gaurav Kabra

![](./assets/images/types.png)
![](./assets/images/hierarchy.png)


# Creational
![](./assets/images/creational.png)

### Singleton
Logger, DB Connector 
Disadv:
- Multi threaded env: access must be thread safe
- Dependency inversion regards this as an anti-pattern since use of private and static methods

![](./assets/images/singleton.png)

### Factory
Singleton, in some sense, is also a factory pattern but returns only one type of object.

Also, in factory pattern, clients do not even know the name of class for which object is to be generated. They only know Factory name.

E.g. DB Connector Factory using getConnection method, depending on DB driver.
Different vendors implement the JDBC interfaces.

![](./assets/images/factory.png)

