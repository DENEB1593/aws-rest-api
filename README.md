## AWS(Elastic Beanstalk) 배포용 어플

### MySQL 컨테이너

```
docker run --detach --env MYSQL_ROOT_PASSWORD=mypassword1! --env MYSQL_USER=deneb1593 --env MYSQL_PASSWORD=mypassword1! --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle
```

### 어플리케이션 빌드

```
./gradlew clean build
```
