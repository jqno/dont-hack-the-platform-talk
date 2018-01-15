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

. . .

You brought this upon yourselves

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

- Language 'features'
- Reflection
- Annotations
- External libraries

# Ratings

- ☠️
- ☠️💣
- ☠️💣💥


# ☠️ Language 'features'

# Unicode symbols

> Demo

# Unicode symbols

> Another demo

# Unicode symbols

* Hard to type
* Hard to read
* Rating: ☠️


# Unicode escapes

> Demo

# Unicode converter

> Demo

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

> Demo

# Oh man 😒

    WARNING: An illegal reflective access operation has occurred
    WARNING: Illegal reflective access by demos.reflection.CallOfTheVoid (file:/Users/jqno/w/personal/dont-hack-the-platform-talk/target/classes/) to constructor java.lang.Void()
    WARNING: Please consider reporting this to the maintainers of demos.reflection.CallOfTheVoid
    WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
    WARNING: All illegal access operations will be denied in a future release

. . .

`--add-opens java.base/java.lang=ALL-UNNAMED`

# Call of the Void

* Rating: ☠️


# Loopy

> Demo

# Immutability

. . .

Was this hack evil? ✋

. . .

Are Calendars and arrays evil? ✋

. . .

Are JPA entities evil? 👹

# Immutability

* Rating: ☠️💣💥


# Interning

> Demo

# Interning

* Fun way to mess up unit tests!
* Rating: ☠️💣


# dirty_CLASS

> Demo

# dirty_CLASS

## Another use case

Use Java 8 in Java 7 codebase

# dirty_CLASS

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

> Demo

# Constructors are tedious

* Rating: ☠️


# Singletons

"[An enum] provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. [...] A single-element enum type is often the best way to implement a singleton"

-- Joshua Bloch, Effective Java 3rd Edition

. . .

😇

# Singletons

> Demo

# Singletons

* Rating: ☠️💣


# Confusing card game

---

![](images/tarot.jpg)

# Confusing card game

> Demo

# Confusing card game

* Rating: ☠️💣💥

![](images/trump.jpg)

# Messing with Scala ![](images/scala.png)

> Demo

# Messing with Scala ![](images/scala.png)

* Rating: ☠️💣


# External libraries

`ByteBuddy`

&

`ByteBuddy Agent`


# Time Traveling 🕙🕚

> Demo

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

