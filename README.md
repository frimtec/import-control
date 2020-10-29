# Import Control
[![Build Status](https://travis-ci.com/frimtec/import-control.svg?branch=master)](https://travis-ci.com/frimtec/import-control) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control) 
[![Coverage Status](https://coveralls.io/repos/github/frimtec/import-control/badge.svg?branch=master)](https://coveralls.io/github/frimtec/import-control?branch=master)
[![license](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Import control annotation to use for lightweight module system in Java.

## Motivation
Java previous to JDK 9 has a visibility concept that does not well support modules.
Modules should be structured into various packages but only dedicated packages should be exported to other modules.
In Java all public classes can be imported to other modules but unless a module is in single package you cannot use the visibility
keywords to control what the module should export.

With JDK 9 JPMS was introduced to solve this issue. 
Using JPMS in a project is not easy task and sometimes even not possible/wanted due to runtime consequences (see [jpms-negative-benefits](https://blog.joda.org/2018/03/jpms-negative-benefits.html)).

Import-Control comes to rescue. 
It fully supports the need for import control between modules but with no runtime impact and restrictions.
Packages of modules that shall be exported to other modules can be annotated with ```@ExportPackage``` and then your IDE can control
whether your imports are correct or not.
                
## How to use
In your projects modules, annotate the packages of modules that should be exported to other modules with the annotation ```com.github.frimtec.libraries.importcontrol.ExportPackage```.
To annotate a package create a ```package-info.java``` file inside the package folder with the following content:
```java
@ExportPackage
package org.organisation.project.module;
```

## IDE-Integration
### IntelliJ-IDEA
Install the plugin IDEA-Import-Control to add a new code inspection rule that marks all not allowed imports as errors during editing.  

## Add dependency
To use import-control in your project you can add the dependency from [maven central](https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control) to your software project management tool:
In Maven just add the following dependency to your pom.xml:
```xml
      <dependency>
        <groupId>com.github.frimtec</groupId>
        <artifactId>import-control</artifactId>
        <version>1.0.0</version>
      </dependency>
```
