# Micro-Benchmarks

The benchmark set contains seven self-contained micro-benchmarks:

* `Hello.java`: "Hello, world" program
* `BinarySearchTree.java`: a binary search tree benchmark. The 
  benchmark adds 1000 integers to a BST, calculates the height, and
  then in-order traverses the tree. It runs the benchmark on two 
  sets of data: the integers 1 to 1000, and 1000 random integers 
  between 1 and 10000.
* `LambdaCalc.java`: a simple lambda-calculus evaluator in Java, 
  using immutable data structures. The benchmark attempts to reduce the 
  untyped lambda calculus expression `λx . (x x) (λy. y) (λz . z)` 
  until it is reduced into beta-normal form.
* `NatArith.java`: an implementation of simple Presburger arithmetic 
  in Java. The benchmark adds 1921 to 3385 and prints the result as an 
  integer.
* `FunctionalCounter.scala`: an implementation of a counter in Scala
  using function closures. The benchmark simply invokes the 
  counter 1000 times.
* `FunctionalRBT.scala`: perhaps the most interesting benchmark. The 
  benchmark implements a red-black tree in the style of Okasaki (1999).
  Then, it performs the same tasks as the `BinarySearchTree` benchmark.
  However, this benchmarks operates on the integer 1 to 1,000,000.

## References
* Chris Okasaki. 1999. Purely Functional Data Structures. Cambridge University
  Press, New York, NY, USA.
