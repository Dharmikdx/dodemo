FROM Java:17
EXPOSE:8080
ADD target/dodemo.jar dodemo.jar
ENTRYPOINT ["java","-jar","dodemo.jar"]
