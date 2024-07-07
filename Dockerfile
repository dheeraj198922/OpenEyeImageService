FROM openjdk:17-jdk-alpine
WORKDIR /opt
ENV PORT 8083
EXPOSE 8083
MAINTAINER dheeraj198922
COPY ./target/OpenEye_Image_Service.jar /opt
ENTRYPOINT ["java","-jar","OpenEye_Image_Service.jar"]