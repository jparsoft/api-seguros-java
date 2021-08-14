FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
EXPOSE 3000
RUN javac Main.java
CMD ["java", "Main"]