# CSIS10A Week 2 - void Methods

> Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ~ Martin Fowler

## Day 3

- [Survey]()
- [Lecture 3](https://docs.google.com/presentation/d/1zr7aoCgG0RaB-SQX1mEW3xmFWZWa3tUaQMaYFS4xPRg/edit?usp=sharing)
- [Lab 3 part A](https://github.com/mpc-csis/csis10a-lab-03)


## Day 4

- [Lecture 3](https://docs.google.com/presentation/d/1zr7aoCgG0RaB-SQX1mEW3xmFWZWa3tUaQMaYFS4xPRg/edit?usp=sharing)
- [Lab 3 part B](https://github.com/mpc-csis/csis10a-lab-03)


## Assignment 

### Tasks

- Read [Chapter 3](http://greenteapress.com/thinkapjava/html/thinkjava005.html)
- [Assignment 3](https://classroom.github.com/a/fvVgBLCi)

## Developer tool of the week 

[maven](http://maven.apache.org/)

Maven is a build automation tool. It allows you to quickly create a project with a standard layout and focus on coding. Build automation tools handle the details of compiling, running unit tests, packing and installing software. There are a number of build tools that you can use for Java projects; some examples include: [Maven](http://maven.apache.org/), [Ant](http://ant.apache.org/), [Make](http://www.gnu.org/software/make/), and [Gradle](http://www.gradle.org/). For Java, Maven is probably the tool you will encounter the most often in open source and enterprise projects. Most IDEs support opening Maven projects with little to no hassles too.

### Quickstart

Like javac (from last week), Maven is a command line tool that is run from a terminal or command window. As it is a java program, the same maven download will run on basically any desktop operating system.


1. __Installation:__ Installing Maven on Windows is relatively straightforward. Basically, you'll download maven, extract the archive file (zip, gz), and add the extracted directory to the PATH environment variable. More detailed instructions are at <http://maven.apache.org/download.cgi#Installation>. On Mac OS X, I would recommend installing maven using [homebrew](http://brew.sh/). Once homebrew is installed you can install maven in a terminal using brew install maven.
2. __Create a project:__ In a terminal run `mvn archetype:generate`. This will allow you to interactively create a project. When giving a choice, accept the default. For groupId enter __csis10a__, for packageId enter __testprj__ (with no spaces or hyphens). This will create a directory named 'testprj'. Inside that directory will be two things: a file named _pom.xml_ and a directory named _src_. The source directory contains all the code. By default, it contains some simple placeholder code.
3. __Build the Project:__ To build the project, run it's unit tests (which will cover in the future), and package the compiled code, run the following in a terminal: `mvn package`. After running the package command there will be a new directory under 'testprj' named _target_ which contains all the build products. You can delete this directory at any time or run `mvn clean`` and maven will do it for you.
4. __Running a Project:__ Maven provides tools for running any piece of code in your project with a main method. In our test project, you can run the default class using `mvn exec:java -Dexec.mainClass=csis10a.App`.
5. __Much, Much More:__ This is just the tip of the iceberg. Maven supports much, much more, such as dependency management, project interogation, site generation, cross-language compilation, multi-module projects, etc.

### References

- [Getting Started with Maven](https://maven.apache.org/guides/getting-started/)
