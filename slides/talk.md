---
author: Jan Ouwens
title: Don't hack the platform? ☠️💣💥
date: January 30, 2018
theme: moon
transition: none
progress: "false"
controls: "false"
center: "false"
---
# ಠ_ಠ

::: notes

What are you doing here?
I told you not to come in my abstract

Also: this is how you hack a conference

:::

# About me 🤓

Jan Ouwens

![](images/codestar.png)

EqualsVerifier

![](images/twitter.png) [jqno](https://twitter.com/jqno)


# About this talk

![](images/Bob_at_Easel.jpg)

Happy accidents

# About this talk

![](images/dr-evil.jpg)

Evil consequences

# Things you shouldn't mess with RIGHT NOW:

- Pure Java
- Reflection
- Annotations
- External libraries

# Ratings

- ☠️
- ☠️💣
- ☠️💣💥


# ☠️ Pure Java

# Unicode symbols

> Demo 1

# Unicode symbols

* Hard to type
* Hard to read
* Rating: ☠️


# Unicode escapes

> Demo 2

# Unicode escapes

* Harder to type and read
* Maven says ¯\\\_(ツ)\_/¯
* Rating: ☠️💣


# Hash-code

> Demo 3

# Hash-code

* Fun when coworkers insist on hashCode as key
* Rating: ☠️

. . .

However...
![](images/rtlnieuws.png)


# ☠️ Reflection

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

# Call of the Void

* Rating: ☠️


# Loopy

> Demo 5

# Loopy

Was this mutability evil? ✋

. . .

Are Calendars and arrays evil? ✋

. . .

Are JPA entities evil? 👹

# Loopy

* Rating: ☠️💣


# Interning

> Demo 6

# Interning

* Fun way to mess up unit tests!
* Rating: ☠️💣


# Avoiding Checkstyle

> Demo 7

# Avoiding Checkstyle

## Another use case

Use Java 8 in Java 7 codebase

# Avoiding Checkstyle

* `JavaCompiler` available since Java 6
* Rating: ☠️💣


# ☠️ Annotations

# Lombok 🌶

use annotations

to trick the Java _**compiler**_

into generating bytecode

that does something else

# Spring & Hibernate

use annotations

to trick the Java _**runtime**_

into generating bytecode

that does something else

# Boring

* Rating: ☠️

![](images/boring.jpg)


# ☠️ External libraries

`Objenesis`

# Constructors are tedious

> Demo 8

# Constructors are tedious

* Rating: ☠️


# Singleton

"[An enum] provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. [...] A single-element enum type is the best way to implement a singleton"

-- Joshua Bloch, Effective Java 2nd Edition

. . .

😇

# Singleton

> Demo 9 

# Singleton

* Rating: ☠️💣


# Confusing card game

---

![](images/tarot.jpg)

# Confusing card game

> Demo 10

# Confusing card game

* Rating: ☠️💣💥

![](images/trump.jpg)

# Messing with Scala ![](images/scala.png)

> Demo 11

# Messing with Scala ![](images/scala.png)

* Rating: ☠️💣


# External libraries

`ByteBuddy`

&

`ByteBuddy Agent`


# Time Traveling 🕙🕚

> Demo 12

# Time Traveling 🕙🕚

* Unit testing legacy code
* Messing up any code
* Rating: ☠️💣💥


---

![](images/thats-all-folks.png)

# Do try this at home!

Maybe not at work though?

# Questions?

slides & code at<br>
![](images/github.png)[/jqno/dont-hack-the-platform-talk](https://github.com/jqno/dont-hack-the-platform-talk)

