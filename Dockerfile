# Use the official Maven image to build the application
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use a lightweight Java runtime image for the final application
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy the built JAR file from the Maven build stage
COPY --from=build /app/target/CarManagementSystem-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that Spring Boot will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
