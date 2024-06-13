# Design Patterns with Java (LLD)
by Gaurav Kabra

![](./assets/images/types.png)
![](./assets/images/hierarchy.png)


# Creational
![](./assets/images/creational.png)

### 1. Singleton
Logger, DB Connector 
Disadv:
- Multi threaded env: access must be thread safe
- Dependency inversion regards this as an anti-pattern since use of private and static methods

![](./assets/images/singleton.png)

### 2. Factory
Singleton, in some sense, is also a factory pattern but returns only one type of object.

Also, in factory pattern, clients do not even know the name of class for which object is to be generated. They only know Factory name.

E.g. DB Connector Factory using getConnection method, depending on DB driver. E.g. Oracle driver:
```
Connection conn = DriverManager.getConnection("url", "uname", "pwd");
```
Now different DB vendors have different URL formats.

Different vendors implement the JDBC interfaces.

![](./assets/images/factory.png)
![](./assets/images/factory_2.png)
![](./assets/images/factory_eg.png)

### 3. Abstract Factory
Factory for factories. E.g. a factory that returns Maruti factory or Skoda factory:

![](./assets/images/abstract_factory.png)
![](./assets/images/abstract_factory_eg.png)
![](./assets/images/abstract_factory_comp.png)

### 4. Prototype
For cloning - shallow or deep.

In Java, unlike Python, we have to implement our own shallow/deep copy methods.

![](./assets/images/proto.png)

# Structural

### 1. Adapter
When we do not have src code, so no modification is possible.

![](./assets/images/adapter.png)

### 2. Proxy
Unlike Adapter, which does "conversion", in Proxy pattern, one object represents another.

Both RealSubject and Proxy must have same method signatures.

Useful in caching responses (optimizations), where first time original class fetches from DB but then proxy caches the response.

![](./assets/images/proxy.png)
![](./assets/images/proxy_eg.png)
![](./assets/images/proxy_uses.png)

#### RMI
(Now deprecated due to RPC)

A method can call only method within same JVM. But RMI allows it to invoke method in another JVM, may be on another OS.
![](./assets/images/rmi.png)

Communication happens via RMI interface (proprietary to Java) unlike HTTPS.
Stub and Skeleton are generated by RMI. Stub passes information like method to be invoked and parameters. Skeleton executes using this info and returns results.

### 3. Facade
E.g. customer service can answer all queries, we reach to warden regarding any hostel query etc.

![](./assets/images/facade.png)
![](./assets/images/facade_eg.png)

### 4. Decorator
If `classA` has features `f1` and `f2` and a `classB` has features `f13` and `f4` and we just want features `f1` and `f4`.

It helps avoid inheritance.

Base class will be same to have common behaviour.

![](./assets/images/decorator.png)
![](./assets/images/decorator_eg.png)
![](./assets/images/decorator_eg_2.png)

Unlike inheritance, decorator is plug-n-play.

![](./assets/images/decorator_vs_inherit.png)

# Behavioral
![](./assets/images/behave.png)
### 1. Strategy

![](./assets/images/strategy.png)
![](./assets/images/no_inheritance.png)
![](./assets/images/yes_strategy.png)