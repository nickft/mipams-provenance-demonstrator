FROM adoptopenjdk/openjdk11:debian-slim

ARG JAR_FILE=target/demo-1.0.jar
ARG EXIF_TOOL_DOWNLOAD=https://www.exiftool.org/Image-ExifTool-12.76.tar.gz

RUN groupadd mipams && useradd -g mipams -s /bin/bash mipams

WORKDIR /app
RUN mkdir /app/assets
RUN mkdir /app/credentials
RUN mkdir /app/generated
RUN chown -R mipams:mipams /app/assets
RUN chown -R mipams:mipams /app/credentials
RUN chown -R mipams:mipams /app/generated

RUN apt-get update && \
    apt-get -y install openssl wget && \
    apt-get clean

COPY ./generateCredentials.sh /app/credentials/generateCredentials.sh
RUN chown -R mipams:mipams /app/credentials
RUN chmod +x /app/credentials/generateCredentials.sh

RUN wget ${EXIF_TOOL_DOWNLOAD} -O /app/exiftool.tar.gz
RUN tar -xzf /app/exiftool.tar.gz && rm /app/exiftool.tar.gz
RUN chown -R mipams:mipams /app/Image-ExifTool-12.76

USER mipams:mipams
VOLUME /tmp
ADD ${JAR_FILE} /app/app.jar

EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]