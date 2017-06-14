########################################################
# Dockerfile per l'applicazione eureka-9003 
########################################################

FROM frolvlad/alpine-oraclejdk8

ADD build/libs/Eureka-0.1.1.jar eureka.jar

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "eureka.jar"]
