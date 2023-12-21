# Import Control [![setup automated][gitpod-shield]][gitpod]
[![Maven Central][maven-central-shield]][maven-central]
[![License][license-shield]][license]

![Project Maintenance][maintenance-shield]
[![Code Coverage][codecov-shield]][codecov]

[![Build Status][build-status-shield]][build-status]
[![Deploy Status][deploy-status-shield]][deploy-status]

Import control annotation to use for lightweight module system in Java.

## Motivation
Java previous to JDK 9 has a visibility concept that does not support modules very well.
If modules are structured into various packages, and only dedicated packages should be exported to other modules, the visibility modifiers do not fit at all. All public classes can be imported to other modules.<br>
With JDK 9 JPMS was introduced to solve this issue. Using JPMS in a project is not an easy task and sometimes even not possible due to runtime restrictions (see [jpms-negative-benefits][jpms-negative-benefits]).
This is where [Import Control][import-control-readme] comes to rescue. It fully supports the need for import control between modules but with no runtime impact nor restrictions.
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
Install the plugin [Import Control][import-control-plugin] to add a new code inspection rule that marks all undesirable imports as errors.  

## Add dependency
To use import-control in your project you can add the dependency from [maven central][maven-central-import-control-api] to your software project management tool:
In Maven just add the following dependency to your pom.xml:
```xml
      <dependency>
        <groupId>com.github.frimtec</groupId>
        <artifactId>import-control-api</artifactId>
        <version>1.1.1</version>
      </dependency>
```

[gitpod-shield]: https://img.shields.io/badge/Gitpod-ready_to_code-orange?logo=gitpod
[gitpod]: https://gitpod.io/from-referrer/
[maven-central-shield]: https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control-api/badge.svg
[maven-central]: https://maven-badges.herokuapp.com/maven-central/com.github.frimtec/import-control-api
[maintenance-shield]: https://img.shields.io/maintenance/yes/2024.svg
[license-shield]: https://img.shields.io/github/license/frimtec/import-control.svg
[license]: https://opensource.org/licenses/Apache-2.0
[codecov-shield]: https://codecov.io/gh/frimtec/import-control/branch/main/graph/badge.svg?token=XPU22BU7VN
[codecov]: https://codecov.io/gh/frimtec/import-control
[build-status-shield]: https://github.com/frimtec/import-control/workflows/Build/badge.svg
[build-status]: https://github.com/frimtec/import-control/actions?query=workflow%3ABuild
[deploy-status-shield]: https://github.com/frimtec/import-control/workflows/Deploy%20release/badge.svg
[deploy-status]: https://github.com/frimtec/import-control/actions?query=workflow%3A%22Deploy+release%22
[import-control-readme]: https://github.com/frimtec/import-control/blob/main/README.md
[maven-central-import-control-api]: https://search.maven.org/artifact/com.github.frimtec/import-control-api
[jpms-negative-benefits]: https://blog.joda.org/2018/03/jpms-negative-benefits.html
[import-control-plugin]: https://plugins.jetbrains.com/plugin/15308-import-control