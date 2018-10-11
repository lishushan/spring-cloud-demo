#!/bin/sh
echo "********************************************************"
echo "Starting [spring-cloud-server-config]... "
echo "********************************************************"
java -jar -Xms128m -Xmx512m /mycloud/spring-cloud-server-config/@project.build.finalName@.jar