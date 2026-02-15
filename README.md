# 🚀 Jenkins CI/CD Pipeline with GitHub Webhook & Docker (AWS EC2 Deployment)

A production-style CI/CD pipeline that automatically builds, tests,
containerizes, and deploys a Spring Boot application to AWS EC2
using Jenkins and GitHub Webhooks.

---

## 💡 Why This Project?

This project simulates a real-world DevOps workflow where code changes
automatically trigger a CI/CD pipeline, ensuring faster deployments,
reduced manual effort, and improved software reliability.

---

## 📌 Project Overview

This project demonstrates a complete end-to-end CI/CD pipeline built using:
-GitHub (Source Control)
-Jenkins (CI/CD Automation Server)
-Maven (Build & Dependency Management)
-Docker (Containerization)
-DockerHub (Image Registry)
-AWS EC2 (Deployment Environment)
-GitHub Webhook (Auto Trigger)
The pipeline automatically builds, tests, dockerizes, pushes, and deploys a Spring Boot application whenever code is pushed to GitHub — with zero manual intervention.


## 🏗 Architecture
Developer → GitHub → Webhook → Jenkins
        ↓
Maven Build → Test → Package
        ↓
Docker Build → DockerHub Push
        ↓
AWS EC2 Deployment
        ↓
Live Application

---

## ⚙️ Tech Stack
-Java 17
-Spring Boot
-Maven
-Jenkins (Declarative Pipeline)
-Docker
-DockerHub
-AWS EC2
-GitHub Webhooks

---

## 🔄 CI/CD Pipeline Stages
1️⃣ Checkout
Clones source code from GitHub repository.

2️⃣ Build
Compiles the application using Maven.

3️⃣ Test
Executes unit tests to ensure code quality.

4️⃣ Package
Creates executable JAR file.

5️⃣ Docker Build
Builds a Docker image from the JAR.

6️⃣ Docker Push
Pushes image to DockerHub using secure credentials.

7️⃣ Deploy
Stops old container and deploys updated container on EC2.

---

## 🐳 Docker Configuration
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

---

## 📜 Jenkinsfile (Declarative Pipeline)

The pipeline includes:
-Tool configuration
-Secure DockerHub credentials
-Automated deployment
-Workspace cleanup
-Versioned Docker tagging using BUILD_NUMBER

---

## 🏗 Project Structure
jenkins-cicd/
├── src/                  # Spring Boot source code
├── Dockerfile            # Docker image configuration
├── Jenkinsfile           # CI/CD pipeline definition
├── pom.xml               # Maven build configuration
├── screenshots/          # Project screenshots
└── README.md             # Project documentation


---


## 🔐 Security & Best Practices Implemented
-GitHub Webhook for automated triggering
-DockerHub credentials stored securely in Jenkins
-Versioned Docker images using build numbers
-Workspace cleanup after each build
-Separation of build and runtime environments

##🎯 Key Learning Outcomes
-Designing production-style CI/CD pipelines
-Integrating GitHub with Jenkins using Webhooks
-Automating Docker image build & deployment
-Managing secure credentials in Jenkins
-Deploying containerized apps on AWS EC2

---

## 📸 Project Screenshots

### ✅ Jenkins Pipeline Success
![Jenkins Success](screenshots/jenkins-success.png)

### 🌍 Live Application on EC2
![Live App](screenshots/live-app.png)

---


## 👨‍💻 Author
Faizan
DevOps & Cloud Engineering Enthusiast


