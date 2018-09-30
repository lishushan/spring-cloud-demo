#!/bin/sh
echo "********************************************************"
echo "Starting [spring-cloud-service-helloworld]... "
echo "********************************************************"
java -jar -Xms128m -Xmx512m /mycloud/spring-cloud-service-helloworld/@project.build.finalName@.jar --spring.profiles.active=prod