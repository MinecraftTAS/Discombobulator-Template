# Discombobulator-Template
Disco is a preprocessor for Minecraft mods. This project is useful, if you create mods for multiple versions at once.


## Version blocks
You can define version specific code in the text via comments:

```java
		//#1.16.1
		System.out.println("Only enabled in 1.16.1 and above");
		//#end
```

In other versions this line will be commented out.

This works also with multiple version statements:
```java
		//# 1.15.2
//$$		System.out.println("Only enabled in 1.15.2 and above");
		//# 1.14.4
		System.out.println("Only enabled in 1.14.4 and above");
		//# end
```

## Setup
Create a new project then clone this repository into it. You can then import the one or both gradle projects and rename them.

Disco has 2 main gradle tasks:
- `preprocessBase` copies the src folder to all versions and preprocesses it.
- `preprocessWatch` watches over all source folders for changes and updates the base src when a change happens.

You should first do preprocessBase to setup your versions, then run the fabric specific tasks like genSources.

For coding, run preprocessWatch, preferrably in a seperate console window, as eclipse will not build the project when the task is started from the IDE.