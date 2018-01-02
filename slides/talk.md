---
author: Jan Ouwens
title: Don't hack the platform? ☠️💣💥
date: January 30, 2018
theme: a-new-moon
transition: none
progress: "false"
controls: "false"
---
# About me 🤓

![](images/codestar.png)

EqualsVerifier

![](images/twitter.png) [jqno](https://twitter.com/jqno)


# About this talk

How to hack Java

. . .

How to hack a conference ☠️💣💥



# About this talk

![](images/Bob_at_Easel.jpg)

Happy accidents

# About this talk

![](images/dr-evil.jpg)

Evil consequences

# Things you can do RIGHT NOW:

- Pure Java
- Reflection
- Annotations
- External libraries


# Pure Java


# Unicode symbols

> Demo 1

# Unicode symbols

* Hard to type
* Hard to read


# Unicode escapes

> Demo 2

# Unicode escapes

* Harder to type and read
* Maven says ¯\\\_(ツ)\_/¯


# Hash-code

> Demo 3

# Hash-code

* Fun when coworkers insist on hashCode as key

. . .

![](images/rtlnieuws.png)


# Reflection

# Call of the Void

> Demo 4 

# Oh man 😒

    WARNING: An illegal reflective access operation has occurred
    WARNING: Illegal reflective access by demos.demo4.CallOfTheVoid (file:/Users/jqno/w/personal/dont-hack-the-platform-talk/target/classes/) to constructor java.lang.Void()
    WARNING: Please consider reporting this to the maintainers of demos.demo4.CallOfTheVoid
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release

. . .

`--add-opens java.base/java.lang=ALL-UNNAMED`


# Loopy

> Demo 5

# Loopy

Was this mutability evil? ✋

. . .

Are Calendars and arrays evil? ✋

. . .

Are JPA entities evil? 👹


# Interning

> Demo 6

# Interning

* Fun way to mess up unit tests!


# Compiler

> Demo 7

# Compiler

* `JavaCompiler` available since Java 6
* Use Java 8 in Java 7 codebase


# Annotations

# Lombok 🌶

uses annotations

to trick the Java _**compiler**_

into doing things it shouldn't do

# Spring & Hibernate

use annotations

to trick the Java _**runtime**_

into doing things it shouldn't do

# Boring

![](images/boring.jpg)


# External libraries

`Objenesis`

# Objenesis

> Demo 8


# Singleton

"[An enum] provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. [...] A single-element enum type is the best way to implement a singleton"

-- Joshua Bloch, Effective Java 2nd Edition

. . .

😇

# Singleton

> Demo 9 


# Confusing card game

---

![](images/tarot.jpg)

# Confusing card game

> Demo 10


# Messing with Scala

> Demo 11


# External libraries

`ByteBuddy`

&

`ByteBuddy Agent`


# Time Traveling 🕙🕚🕛

> Demo 12

# Time Traveling 🕙🕚🕛

* Unit testing legacy code
* Messing up any code


# Conclusion

# Do try this at home!

But maybe not at work?

# Questions?

slides & code at<br>
![](images/github.png)[/jqno/dont-hack-the-platform-talk](https://github.com/jqno/dont-hack-the-platform-talk)

