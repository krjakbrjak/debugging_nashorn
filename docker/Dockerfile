FROM tomcat:8-jdk8

RUN mv /usr/local/tomcat/webapps /usr/local/tomcat/webapps2 && \
    mv /usr/local/tomcat/webapps.dist /usr/local/tomcat/webapps

COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
