########################################################
# Dockerfile per l'applicazione brands-famous-9003
########################################################

FROM frolvlad/alpine-oraclejdk8

ADD build/libs/BrandsFamous-0.1.1.jar brands-famous.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "brands-famous.jar"]
