FROM openjdk:17-alpine
EXPOSE 8000 
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.ustc.edu.cn/g' /etc/apk/repositories \
&& apk add --no-cache tzdata \
&& ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
&& echo "Asia/Shanghai" > /etc/timezone \
&& apk del tzdata \
&& rm -rf /var/cache/apk/* /tmp/* /var/tmp/* $HOME/.cache

COPY ./target/spring-test.jar ./app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"] 