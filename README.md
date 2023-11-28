# Programming Patterns - Exam 3

This template repository is the starter project for Programming Patterns Exam 3 section 3. Written in Java, and tested with Gradle/JUnit.

### Question(s)

1. **Multithreading**

You have a function printNumber that can be called with an integer parameter and prints it to the console.

- For example, calling `printNumber(7)` prints `7` to the console.
  You are given an instance of the class `ZeroEvenOdd` that has three functions: `zero`, `even`, and `odd`. The same instance of `ZeroEvenOdd` will be passed to three different threads:

- Thread A: calls `zero()` that should only output `0`'s.
- Thread B: calls `even()` that should only output even numbers.
- Thread C: calls `odd()` that should only output odd numbers.

Modify the given class to output the series `"010203040506..."` where the length of the series must be `2n`.

Implement the `ZeroEvenOdd` class:

- `ZeroEvenOdd(int n)` Initializes the object with the number `n` that represents the numbers that should be printed.
- `void zero(printNumber)` Calls `printNumber` to output one zero.
- `void even(printNumber)` Calls `printNumber` to output one even number.
- `void odd(printNumber)` Calls `printNumber` to output one odd number.

**Example 1:**

```
Input: n = 2
Output: "0102"
Explanation: There are three threads being fired asynchronously.
One of them calls zero(), the other calls even(), and the last one calls odd().
"0102" is the correct output.
```

**Example 2:**

```
Input: n = 5
Output: "0102030405"
```

**Constraints:**

`1 <= n <= 1000`

2. Connect the MVCExample project to a database using SQLite, called **School.db** and do the following operations:

- Create a student table, a course table and a fall2022 table.
- Have studentID as primary key in the student table and as foreign key to the fall2022 table. Other columns would be name, and phone number.
- Have courseID as primary key for the course table and as foreign key to the fall2022 table. Other columns would be nameOfCourse, numberOfCredits.
- Have RegistrationID as primary key for the fall2022 table.
- Add 5 records to all the tables.
- Get all the records and show them in the form.
- The user should be able to search based on the RegistrationID or nameOfCourse.

Also, there's a SQL cheat sheet available to you.
