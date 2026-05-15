
#  Docker Assignment – Spring Boot + MySQL Application

This project demonstrates a complete implementation of Docker concepts including:
- Containerization
- Docker commands
- Multi-container setup using Docker Compose
- Docker registry usage (push & pull)
- Deployment and execution steps

---

#  Tech Stack

- Java 17 (Spring Boot)
- MySQL 8
- Docker
- Docker Compose
- Maven

---

#  Assignment Tasks Covered

-  Install Docker and Docker Compose
-  Verify installation using test container
-  Create a web application (Spring Boot)
-  Write Dockerfile
-  Build Docker image and run container
-  Use Docker commands (start/stop/list/remove)
-  Inspect containers and view logs
-  Create docker-compose.yml for multi-container setup
-  Run application using Docker Compose
-  Create local Docker registry
-  Push image to registry
-  Pull image from registry
-  Submit project to GitHub

---

# 🛠️ Prerequisites

Make sure the following are installed:

- Docker
- Docker Compose
- Java 17
- Maven
- Git

---

#  Step 1: Verify Docker Installation
        docker --version
        docker compose version

#  Step 2: Run Test Container
        docker run hello-world

#  Step 3: Build Spring Boot Application This generates target/Docker-demo.jar
        mvn clean package 

#  Step 4: created Dockerfile which is present in project directory

#  Step 5: Build Docker Image
        docker build -t docker-demo-app .

# Step 6: Run Container
        docker run -p 8080:8080 docker-demo-app

# Step 7 : open the postman and hit
http://localhost:8080/hello-world ->  now you will hit this api and will see the response
hello-world from docker project

# Step 8: Docker Commands
#   List containers
        docker ps  - gives us running containers
        docker ps -a - gives us the details of all containers
#   Stop container
        docker stop <container_id>
#   Start container 
        docker start <container_id>
#   Remove container
        docker rm <container_id>

# Step 9: Inspect & Logs
        docker inspect <container
        docker logs <container_id>
# Step 10: created docker-compose.yml

# Step 11: Run with Docker Compose
        docker compose up --build
# Step 12: Setup Local Docker Registry
        docker run -d -p 5000:5000 --name registry registry:
# Step 14: Tag Image
        docker tag docker-demo-app localhost:5000/my-java-app:latest
# Step 15: Push Image to Registry
        docker push localhost:5000/my-java-app:latest
# Step 16: Pull Image from Registry
        docker pull localhost:5000/my-java-app:latest
# Step 17: Run Pulled Image
        docker run -p 8080:8080 localhost:5000/my-java-app:latest
# Step 18: Hit the api from postman
        http://localhost:8080/getAccount?accountNo=1
        i have added some test data in mysql db getting this response 
        {
            "accountNumber": "2",
            "balance": 101.0,
            "customerId": 456
        }




