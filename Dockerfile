FROM openjdk:11
VOLUME /tmp
ADD ./target/stockQuoteManager-1.0 stockQuoteManager.jar
ENTRYPOINT ["java","-jar","/stockQuoteManager.jar"]