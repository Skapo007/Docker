FROM openjdk:11
ADD target/demo-jar.jar demo-jar.jar
Expose 8080
EntryPoint ["java", "-jar", "demo-jar.jar"]