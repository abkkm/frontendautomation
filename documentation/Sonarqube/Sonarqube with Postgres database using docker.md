# Setup Sonarqube with Postgres database using docker
Both Sonarqube and Postgres database should be same network in order communicate with each other. First create docker network using the following commands

## Create docker network
Delete existing docker network and create new docker network **sonarqube**
  ```
  docker network rm sonarqube_network
  docker network create sonarqube_network
  ```
## Run PostGres DB container
Delete existing postgres docker container
  ```
  docker stop postgres
  docker rm postgres
  ```
Run new postgres docker container 
  ```
  docker run --name postgres  -e POSTGRES_USER=root -e POSTGRES_PASSWORD=Test12345  -p 5432:5432 --network sonarqube_network -d postgres
  ```
## Run Sonarqube container
Delete existing sonarqube containers
  ```
  docker stop sonarqube
  docker rm sonarqube
```
Run new sonarqube container 
  ```
  docker run -d --name sonarqube   -p 9000:9000  -e sonar.jdbc.url=jdbc:postgresql://postgres/postgres  -e sonar.jdbc.username=root -e sonar.jdbc.password=Test12345  --network sonarqube_network sonarqube
  ```
Sonarqube should be up and running at http://localhost:9000. Use the following default credentials to login into the sonarqube
  ```
  username: admin
  password: admin
  ```
  
  ---
# Optional
## docker-compose-postgres.yml
```
version: "3"

services:
  sonarqube:
    image: sonarqube
    ports:
      - "9000:9000"
    networks:
      - sonarnet
    environment:
      - sonar.jdbc.url=jdbc:postgresql://db:5432/sonar
    volumes:
      - sonarqube_conf:/opt/sonarqube/conf
      - sonarqube_data:/opt/sonarqube/data
      - sonarqube_extensions:/opt/sonarqube/extensions

  db:
    image: postgres
    networks:
      - sonarnet
    environment:
      - POSTGRES_USER=sonar
      - POSTGRES_PASSWORD=Test12345
    volumes:
      - postgresql:/var/lib/postgresql
      - postgresql_data:/var/lib/postgresql/data

networks:
  sonarnet:
    driver: bridge

volumes:
  sonarqube_conf:
  sonarqube_data:
  sonarqube_extensions:
  postgresql:
  postgresql_data: