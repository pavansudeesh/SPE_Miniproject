FROM openjdk:8
#File Author
MAINTAINER pavansudeesh pavanperuru173@@gmail.com
#Add target
COPY ./target/SPE_Miniproject-1.0-SNAPSHOT.jar ./
# Set Working Directory
WORKDIR ./
#Container command
CMD ["java", "-cp", "SPE_Miniproject-1.0-SNAPSHOT.jar", "Calculator.Calculator"]
