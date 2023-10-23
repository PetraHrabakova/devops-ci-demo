# Fetch the Java
FROM eclipse-temurin:17-jre

# Expose port 8088
EXPOSE 8088
# set a docker volume if you want
VOLUME /backend_volume
# Add the jar file
ADD ./target/*.jar devops-ci-demo-0.0.1-SNAPSHOT.jar
# Start the application
ENTRYPOINT ["java", "-jar", "/devops-ci-demo-0.0.1-SNAPSHOT.jar"]
