# Stream Challenges - roadmap

Source video: **"Java Stream Interview Preparation: 41 Coding Questions Solved & Explained"**
<https://www.youtube.com/watch?v=7vmdkQtRGzQ>

Chapter structure of the video (from its description):

| Timestamp | Chapter | Questions |
| --- | --- | --- |
| 0:00 | Introduction And Agenda | - |
| 2:31 | Super Easy Level | 10 |
| 34:25 | Easy Level | 10 |
| 58:45 | Intermediate A Level | 6 |
| 1:32:10 | Intermediate B Level | 5 |
| 1:57:00 | Intermediate C Level | 5 |
| later | Hard Level | 5 |
|  | **Total** | **41** |

The description is truncated after `1:57:00`, so the last two chapter names are inferred;
10 + 10 + 6 + 5 + 5 + 5 = 41 matches the video title. The individual question order is a
proposed mapping of the classic question set - it can be re-ordered before generation.

## Layout convention

Rule: **one challenge = one package, and its answer lives in that package's own
`solution` sub-package.** Two challenges never share a package, and nothing is shared
between challenges - there is no common `solutions`, `model` or `util` package that
would couple two challenges together.

    com.electronik54.streamchallenges
      challengeNN                     one package per challenge
        Challenge                     Javadoc carries title, Problem, Hint, Expected Output and TODO; main prints the banner plus the starter code
        <Model>                       domain types the challenge needs, as separate top-level classes
        solution                      the sub-package holding the answer
          Solution                    reference implementation; main mirrors the starter code and prints the expected output

Every `Challenge` class documents the task in exactly this section order:
title line (`Challenge NN: Title`), `Problem:`, `Hint:` with dash bullets,
`Expected Output:` with the literal lines the solution prints, `TODO:` with the
numbered steps, and the closing pointer to `solution/Solution.java`.

The `Solution` class is one class per challenge: a short "how it works" block at the
top (no Javadoc sections), the implementing method and `main`. Comments are added only
where they explain the working of the code (null handling, collector choice, read-only
wrapping) - never above every single line.

Dependencies point one way only: `challengeNN.solution` may use `challengeNN`, but
`challengeNN` never imports `challengeNN.solution`, so the problem statement stays
solvable without looking at the answer. Because every package is self-contained, a model
such as Employee is declared once in each challenge that needs it instead of living in a
shared package.

## Progress

| # | Challenge | Level | Status |
| --- | --- | --- | --- |
| 01 | Separate even and odd numbers | Super Easy | DONE |
| 02 | Remove duplicate elements from a list | Super Easy | DONE |
| 03 | Sum and average of all numbers | Super Easy | DONE |
| 04 | Maximum and minimum value | Super Easy | DONE |
| 05 | Count elements matching a condition | Super Easy | DONE |
| 06 | Sort numbers ascending and descending | Super Easy | DONE |
| 07 | Convert strings to upper case / lower case | Super Easy | DONE |
| 08 | Filter strings starting with a given letter | Super Easy | DONE |
| 09 | Find the first element satisfying a condition | Super Easy | DONE |
| 10 | Join strings with a delimiter and prefix/suffix | Super Easy | DONE |
| 11 | Second highest and second lowest number | Easy | DONE |
| 12 | Find duplicate elements in a list | Easy | DONE |
| 13 | Character frequency in a string | Easy | DONE |
| 14 | Word frequency in a sentence | Easy | DONE |
| 15 | Sort a Map by key and by value | Easy | DONE |
| 16 | Flatten nested lists with flatMap | Easy | DONE |
| 17 | Convert a list into a Map with a duplicate-key policy | Easy | DONE |
| 18 | Longest and shortest string in a list | Easy | DONE |
| 19 | Sum and product with reduce | Easy | DONE |
| 20 | Numbers above / below the average | Easy | DONE |
| 21 | Group employees by department | Intermediate A | DONE |
| 22 | Highest paid employee per department | Intermediate A | DONE |
| 23 | Multi-key sorting (salary then name) | Intermediate A | DONE |
| 24 | Partition by a threshold and count with teeing | Intermediate A | DONE |
| 25 | Group strings by their length | Intermediate A | DONE |
| 26 | Average salary per department | Intermediate A | DONE |
| 27 | K-th largest distinct number | Intermediate B | DONE |
| 28 | Most and least frequent element | Intermediate B | DONE |
| 29 | Common and different elements of two lists | Intermediate B | DONE |
| 30 | Running total / cumulative sum | Intermediate B | DONE |
| 31 | Group names per department and join them | Intermediate B | DONE |
| 32 | Custom collector with Collector.of | Intermediate C | DONE |
| 33 | Top N most frequent words | Intermediate C | DONE |
| 34 | Group anagrams together | Intermediate C | DONE |
| 35 | Pairs whose sum equals a target | Intermediate C | DONE |
| 36 | First non-repeating character | Intermediate C | DONE |
| 37 | Why side effects break parallel streams | Hard | DONE |
| 38 | Infinite streams: iterate, generate and limit | Hard | DONE |
| 39 | Sliding window over a list | Hard | DONE |
| 40 | Summary statistics with IntSummaryStatistics and teeing | Hard | DONE |
| 41 | Streams with records, sealed types and Java 21 collections | Hard | DONE |

## Commands

- Compile: `mvn -B compile`
- Print a challenge: `mvn -B -q exec:java -Dexec.mainClass=com.electronik54.streamchallenges.challenge01.Challenge`
- Run a solution: `mvn -B -q exec:java -Dexec.mainClass=com.electronik54.streamchallenges.challenge01.solution.Solution`

The project targets Java 21 (`maven.compiler.release`). On a machine whose JDK is older,
add `-Dmaven.compiler.release=17` to the command line - the current code is source compatible
with 17 and 21.
