# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# Copy war file
COPY AdnSantiagoCardozoQ-0.0.1-SNAPSHOT.jar /AdnSantiagoCardozoQ.war

# run the app
CMD ["/usr/bin/java", "-jar", "/AdnSantiagoCardozoQ.war"]
