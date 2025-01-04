# Compiletime and Runtime Explore
Exploring what compile time and runtime checks happen

## ./test1.sh

* Compiles a Thing from Thing.java
* Deletes the class
* Compiles a Thing from Thing2.java (compiler doesn't whinge because this class isn't public so can be in wrongly named file)
* Runs Main with Thing (from Thing2)


* Crashes _only_ when invoking Callable<String>.call().
* Does not crash because thing is not Callable when passed into doThingCall(thing) which is expected a Callable<String>.
