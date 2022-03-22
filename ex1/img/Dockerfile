FROM alpine:3.14
WORKDIR /app
COPY jre /app/jre
ENV PATH="/app/jre/bin:${PATH}"
EXPOSE 8080
COPY ex1.jar /app/ex1.jar
ENTRYPOINT ["java", "-jar", "ex1.jar"]
