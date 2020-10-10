FROM azul/zulu-openjdk-centos:11

RUN mkdir /application

COPY build/libs/spring-k8s.jar /application

CMD ["java", "-jar", "spring-k8s.jar"]