# --- Stage 1: Build with Maven ---
FROM eclipse-temurin:21-jdk AS build

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# --- Stage 2: Run the app ---
FROM eclipse-temurin:21-jre

WORKDIR /app
COPY --from=build /app/target/ToDoApp-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
