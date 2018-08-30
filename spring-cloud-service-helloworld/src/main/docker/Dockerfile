# 基础镜像：仓库是java，tag是8
FROM java:8
# 容器对外暴露9000端口
EXPOSE 9000
# 创建目录
RUN mkdir -p /usr/local/spring-cloud-service-helloworld
# 将打包好的jar复制到指定目录
ADD @project.build.finalName@.jar /usr/local/spring-cloud-service-helloworld/
# 将run.sh复制到指定目录
ADD @project.basedir@/src/main/docker/run.sh /usr/local/spring-cloud-service-helloworld/
# 将run.sh改成可执行文件
RUN chmod +x /usr/local/spring-cloud-service-helloworld/run.sh
# 执行run.sh
CMD /usr/local/spring-cloud-service-helloworld/run.sh