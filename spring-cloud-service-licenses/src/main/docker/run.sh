#!/bin/sh
echo "********************************************************"
echo "Starting [spring-cloud-service-licenses]... "
echo "********************************************************"
java -jar -Xms128m -Xmx512m /mycloud/spring-cloud-service-licenses/@project.build.finalName@.jar --spring.profiles.active=prod