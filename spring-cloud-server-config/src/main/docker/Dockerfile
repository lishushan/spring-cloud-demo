# 指定基础镜像，在其上进行定制：仓库是java，tag是8
FROM java:8
# 维护者
MAINTAINER Storm 648417473@qq.com
# 容器对外暴露9000端口
EXPOSE 9001
# 在容器中创建目录
RUN mkdir -p /mycloud/spring-cloud-server-config
# 将打包好的jar复制到容器中指定目录
ADD @project.build.finalName@.jar /mycloud/spring-cloud-server-config/
# 将run.sh复制到容器中指定目录
ADD run.sh /mycloud/spring-cloud-server-config/
# 将run.sh改成可执行文件
RUN chmod +x /mycloud/spring-cloud-server-config/run.sh
# 在镜像启动的时候执行run.sh
CMD /mycloud/spring-cloud-server-config/run.sh