# Challenge "if-else Conditional"

In this challenge, we test your knowledge of using if-else conditional 
statements to automate decision-making processes. An if-else statement 
has the following logical flow:

<img alt="if-else-diagram" src="/docs/_images/img.png" width="200" height="200" />

## Task

Given an integer **_n_**, perform the following conditional actions:

* If **_n_** is odd, print Weird
* If **_n_** is even and in the inclusive range of **_2_** to **_5_**, print Not Weird
* If **_n_** is even and in the inclusive range of **_6_** to **_20_**, print Weird
* If **_n_** is even and greater than **_20_**, print Not Weird

Complete the stub code provided in your editor to print whether or not **_n_** is weird.

## Input Format

A single line containing a positive integer **_n_**.

## Constraints

![1 <= n <= 100](/docs/_images/img_1.png)

## Output Format

Print **_Weird_** if the number is weird; otherwise, print **_Not Weird_**.

## Sample Input 0

```
3
```

## Sample Output 0

```
Weird
```

## Sample Input 1

```
24
```

## Sample Output 1

```
Not Weird
```

### Explanation

* Sample Case 0: **_n_** = 3

    **_n_** is odd and odd numbers are weird, so we print **_Weird_**.

* Sample Case 1: **_n_** = 24

    **_n > 20_** and **_n_** is even, so it isn't weird. Thus, we print **_Not Weird_**.