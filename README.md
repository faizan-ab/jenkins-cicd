🚀 Jenkins CI/CD Pipeline with GitHub Webhook
📌 Project Overview

This project demonstrates a complete end-to-end CI/CD pipeline using:
  GitHub (Source Control)
  Jenkins (CI/CD Automation)
  Maven (Build Tool)
  Docker (Containerization)
  AWS EC2 (Deployment Server)
  GitHub Webhook (Auto Trigger)

The pipeline automatically builds, tests, dockerizes, pushes, and deploys a Spring Boot application whenever code is pushed to GitHub.
.

🏗 Architecture
Developer → GitHub → Webhook → Jenkins → Maven Build → Docker Build → DockerHub → EC2 Deployment

🛠 Tech Stack
Java 17
Spring Boot
Maven
Jenkins
Docker
AWS EC2
GitHub Webhooks

⚙️ CI/CD Pipeline Flow
Developer pushes code to GitHub.
GitHub Webhook triggers Jenkins.
Jenkins:
  Clones repository
  Builds project using Maven
  Runs unit tests
  Packages JAR
  Builds Docker image
  Pushes image to DockerHub
  Deploys container to EC2
Application becomes live automatically.

🐳 Docker Configuration
Dockerfile:
  FROM eclipse-temurin:17-jre
  WORKDIR /app
  COPY target/*.jar app.jar
  EXPOSE 8080
  ENTRYPOINT ["java","-jar","app.jar"]

📜 Jenkins Pipeline (Declarative)
Key stages:
  Checkout
  Build
  Test
  Package
  Docker Build
  Docker Push
  Deploy


## 📸 Project Screenshots

### ✅ Jenkins Pipeline Success
![Jenkins Success](screenshots/jenkins-success.png)

### 🌍 Live Application on EC2
![Live App](screenshots/live-app.png)


🎯 Key Achievements
  Automated CI/CD pipeline
  Secure credential management
  Webhook-based trigger
  Zero manual deployment
  Production-ready containerized application

👨‍💻 Author
Faizan
DevOps & Cloud Enthusiast
