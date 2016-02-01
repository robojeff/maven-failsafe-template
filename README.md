# maven-failsafe-template
Use this template to configure a maven project with separate folders for unit and integration tests.  The "verify" goal will execute integration tests (*IT.java files) after all unit tests (*Test.java files) pass.

+ Unit tests are placed in src/test/unit/java
+ Integration tests are placed in src/test/integration/java
