########################################################
# Dockerfile per l'applicazione brands-sales-9003
########################################################

FROM frolvlad/alpine-oraclejdk8

ADD build/libs/BrandsSales-0.1.1.jar brands-sales.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "brands-sales.jar"]
