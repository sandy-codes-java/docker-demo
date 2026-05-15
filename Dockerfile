# Use lightweight Java runtime
FROM eclipse-temurin:17-jdk-jammy

# Set working directory
WORKDIR /app

# Copy jar file into container
COPY target/Docker-demo.jar app.jar

#this is for documentation actual port mapping is in docker composer file
EXPOSE 8080

 ENTRYPOINT ["java", "-jar", "app.jar"]
