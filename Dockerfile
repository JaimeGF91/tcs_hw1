FROM openjdk:8
VOLUME "/tmp"
EXPOSE 8080
ADD ./target/tcs-hw-*.jar digiapicrud.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "digiapicrud.jar"]
