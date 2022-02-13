FROM openjdk:8
EXPOSE 8383
ADD target/exam-final-HARRY.jar exam-final-HARRY.jar
ENTRYPOINT ["java","-jar","/exam-final-HARRY.jar"]