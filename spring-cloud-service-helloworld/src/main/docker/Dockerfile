# 基础镜像：仓库是java，tag是8
FROM java:8
# 容器对外暴露9000端口
EXPOSE 9000
# 创建目录
RUN mkdir -p /mycloud/spring-cloud-service-helloworld
# 将打包好的jar复制到指定目录
ADD @project.build.finalName@.jar /mycloud/spring-cloud-service-helloworld/
# 将run.sh复制到指定目录
ADD run.sh /mycloud/spring-cloud-service-helloworld/
# 将run.sh改成可执行文件
RUN chmod +x /mycloud/spring-cloud-service-helloworld/run.sh
# 执行run.sh
CMD /mycloud/spring-cloud-service-helloworld/run.sh