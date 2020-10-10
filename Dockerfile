FROM azul/zulu-openjdk-centos:11

RUN mkdir /application
RUN chmod 700 /application

COPY build/libs/spring-k8s.jar /application

CMD ["java", "-jar", "/application/spring-k8s.jar"]