## 🔄 The Core Concept: Inversion of Control (IoC) 🧠

This project beautifully demonstrates **Inversion of Control (IoC)**, a powerful architectural design principle. 

In traditional Java programming, a class controls its own destiny by manually creating the objects it needs using the `new` keyword. 
**IoC completely flips (inverts) this control.** Instead of your `Car` class being responsible for creating the `Engine`, 
the responsibility is handed over entirely to an external manager—the **Spring IoC Container (`ApplicationContext`)**. 



### 🏗️ How IoC Works in this Repository:
1. **Control Shifted:** The `Car` class no longer hardcodes its dependencies. It leaves an open slot.
2. **Container Management:** During application startup, the Spring Container scans our configuration,
3.  automatically instantiates the Java objects (Beans) behind the scenes, and manages their entire lifecycle.
4. **Smart Delivery:** When the application runs, Spring looks at our classes, automatically resolves
5. what needs what, and lets us fetch these fully formed, pre-built objects using `.getBean()`.

By removing the creation power from individual classes and giving it to the framework,
IoC breaks the rigid bonds in our code, making the application incredibly flexible, modular, and easy to scale! 🚀






📱 Decoupling Architecture: Loosely Coupled Sim & Mobile via Field Injection


📱 Spring Framework Dependency Injection Example
├── src/main/java/com/example
│   ├── Sim.java          (Interface)
│   ├── Jio.java          (Component Implementation)
│   ├── Airtel.java       (Component Implementation)
│   ├── Mobile.java       (Target Component with @Autowired Sim)
│   └── MobileTest.java   (Main class calling getBean)



⚙️ Spring Dependency Injection: Setter and Constructor Injection Lifecycle


📂 spring-dependency-injection
 ├── 📦 src
 │    └── 📦 main
 │         └── 📂 java
 │              └── 📂 sping_abc
 │                   ├── 📄 Icecream.java      🛑 (Interface)
 │                   ├── 📄 Chocolate.java     🍦 (Component Implementation)
 │                   ├── 📄 Vanilla.java       🍨 (Component Implementation)
 │                   ├── 📄 Baby.java          👶 (Target Component - Setter/Constructor Injection)
 │                   └── 📄 BabyTest.java      🧪 (Main Class - ApplicationContext & getBean)
 └── 📄 pom.xml                                🛠️ (Maven Configuration)
