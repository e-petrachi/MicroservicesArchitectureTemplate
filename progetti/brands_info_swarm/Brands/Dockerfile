########################################################
# Dockerfile per l'applicazione brands-9003
########################################################

FROM frolvlad/alpine-oraclejdk8

ADD build/libs/Brands-0.1.1.jar brands.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "brands.jar"]
