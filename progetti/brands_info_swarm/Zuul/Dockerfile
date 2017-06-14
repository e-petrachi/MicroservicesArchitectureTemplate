########################################################
# Dockerfile per l'applicazione zuul-9003  
########################################################

FROM frolvlad/alpine-oraclejdk8

ADD build/libs/Zuul-0.1.1.jar zuul.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "zuul.jar"]
