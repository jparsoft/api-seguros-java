FROM openjdk:11
EXPOSE 3100
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]docker war
