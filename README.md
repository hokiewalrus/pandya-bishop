# Java Bishop

Welcome!  The purpose of this exercise is to give us a problem to pair program on.
It assumes basic Java knowledge and some familiarity with the game of [Chess](https://en.wikipedia.org/wiki/Chess).
Before getting started verify you have a recent version of Maven installed:

```
$ mvn -v
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T11:41:47-05:00)
    ...

```

If you do not, [download Maven here](https://maven.apache.org/download.cgi).

## Running the Example Code

To run the provided code, clone this repository and execute ...

```
$ mvn test
...

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running example.chess.BishopTest
Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.053 sec <<< FAILURE!
testDestinationsNotNull(example.chess.BishopTest)  Time elapsed: 0.006 sec  <<< FAILURE!
junit.framework.AssertionFailedError: getDestinations must never return null
    ...
Results :

Failed tests:   testDestinationsNotNull(example.chess.BishopTest): getDestinations must never return null

Tests run: 1, Failures: 1, Errors: 0, Skipped: 0
```


As you can see, out of the box the example has a single unit test `testDestinationsNotNull` that fails.

## The Provided Code
There are two provided classes in this exercise:

- `src/main/java/example/chess/Bishop.java`:  This is a Java class that represents a Bishop in the game of chess.
If you recall, the [Bishop](https://en.wikipedia.org/wiki/Bishop_(chess)) can move in any of the four
diagonal directions.
- `src/main/java/example/chess/Position.java`:  This is a Java class that represents a position on a chess
board.  Since chess is played on an 8 X 8 grid, positions can be thought of as a Column ("a" thru "h")
and a Row ("1" thru "8").

Additionally, there is a very basic unit test provided for the Bishop:
- `src/test/java/example/chess/BishopTest.java`: This currently has a single test that checks if a given
method returns `null` or not.

## The Goal of the Exercise
The `Bishop` class has a single method called `getDestinations` that, given a starting position, returns the
positions that a Bishop could reach in a single move.  Your goal is to implement that method, and prove
it works properly by adding test cases to `BishopTest.java`.

Please feel free to ask questions, and good luck!
