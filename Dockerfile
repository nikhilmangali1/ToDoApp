FROM eclipse-temurin:21-jdk as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# --- Stage 2: Run the JAR ---
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/ToDoApp.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
