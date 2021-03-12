FROM openjdk:8
MAINTAINER pavansudeesh pavanperuru173@@gmail.com
COPY ./target/SPE_Miniproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPE_Miniproject-1.0-SNAPSHOT.jar", "Calculator.Calculator"]
