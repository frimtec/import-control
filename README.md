# Import Control
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control-api)
[![codecov](https://codecov.io/gh/frimtec/import-control/branch/main/graph/badge.svg?token=XPU22BU7VN)](https://codecov.io/gh/frimtec/import-control)
[![license](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

[![Build](https://github.com/frimtec/import-control/workflows/Build/badge.svg)](https://github.com/frimtec/import-control/actions?query=workflow%3ABuild)

Import control annotation to use for lightweight module system in Java.

## Motivation
Java previous to JDK 9 has a visibility concept that does not support modules very well.
If modules are structured into various packages, and only dedicated packages should be exported to other modules, the visibilty modifiers do not fit at all. All public classes can be imported to other modules.<br>
With JDK 9 JPMS was introduced to solve this issue. Using JPMS in a project is not an easy task and sometimes even not possible due to runtime restrictions (see [jpms-negative-benefits](https://blog.joda.org/2018/03/jpms-negative-benefits.html)).
This is where [Import Control](href="https://github.com/frimtec/import-control/blob/main/README.md) comes to rescue. It fully supports the need for import control between modules but with no runtime impact nor restrictions.
Packages of modules that shall be exported to other modules can be annotated with ```@ExportPackage```.
Your IDE can control whether your imports are correct or not.
                
## How to use
In your projects modules, annotate the packages of modules that should be exported to other modules with the annotation ```com.github.frimtec.libraries.importcontrol.api.ExportPackage```.
To annotate a package create a ```package-info.java``` file inside the package folder with the following content:
```java
@ExportPackage
package org.organisation.project.module;
```

## IDE-Integration
### IntelliJ-IDEA
Install the plugin [IDEA Import Control](https://plugins.jetbrains.com/plugin/15308-import-control) to add a new code inspection rule that marks all undesirable imports as errors.  

## Add dependency
To use import-control in your project you can add the dependency from [maven central](https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control-api) to your software project management tool:
In Maven just add the following dependency to your pom.xml:
```xml
      <dependency>
        <groupId>com.github.frimtec</groupId>
        <artifactId>import-control-api</artifactId>
        <version>1.1.0</version>
      </dependency>
```
