FROM openjdk:8
ADD target/springboot-postgres-k8s.jar springboot-postgres-k8s.jar
ENTRYPOINT ["java","-jar","springboot-postgres-k8s.jar"]