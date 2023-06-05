# DemoUp Clipster Coding Challenge

## Questions and Answers

### - What is the name of the algorithm?
It is the merge sort algorithm.

### - Reprogram the algorithm with a newer Java version (>= 8)! What would you change and why?
* Slice the algorithm in small methods to make better to read the code.
* Rename the variables to make the code more understandable since, for example, only i, j, k does not explicit what they are about.
* Change copy array to add Stream as part of add java 8+ features, so the loop can perform better, has less code and easy to maintain.
* Use recursion to sort the arrays, but I have some doubt about how deep I should use java 8 features to restructure the sort functionality. For example I could use Arrays.parallelsort() but don't make too much sense too me to use that in the algorithm.
* Instead compare the elements of the array with '== 1' I decided to use '<= 0' since the compareTo() method don't specify the value of return but instead the <, > and == and then avoid inconsistency in the sort result.
* Change the sort implementation to be generic to avoid raw type usage of Comparable.

### - Compare the output of the two solutions with the output of Java's standard sort algorithm. What differences can you observe?
* The legacy code brings an inconsistent sort since it declares a specific positive integer in the compareTo() method from Comparable;
* The refactored algorithm brings the sorted array in an asc order since I change the comparison logic
* The default sort() from java Arrays sorts the array in asc oder by default, however we can manage to change to a different order using Comparator.

### - Finally, perform the microbenchmarking collect and present the results. What are the issues with such an approach?
* Reuse the same input for all the different sorts will make some of the algorithms perform better than the others. Since they change the existing array the last algorithm to be called will get the array already sorted, so maybe to compare the real performance of each one for a specific scenario would be better have different runners for each one or different inputs.

## Side notes:
Thank you for this challenge, it was fun and interesting to working on it. 
I had some difficult to understand some of the questions, so my answers was based on what I understood.
