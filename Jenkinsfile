pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        DOCKER_IMAGE = "faizanab/jenkins-cicd"
        DOCKER_TAG   = "${BUILD_NUMBER}"
    }

    options {
        buildDiscarder(logRotator(numToKeepStr: '10'))
        timestamps()
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh "docker build -t ${DOCKER_IMAGE}:${DOCKER_TAG} ."
            }
        }

        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh """
                        echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
                        docker push ${DOCKER_IMAGE}:${DOCKER_TAG}
                    """
                }
            }
        }

        stage('Deploy') {
            steps {
                sh """
                    docker stop jenkins-cicd || true
                    docker rm jenkins-cicd || true
                    docker run -d -p 8080:8080 \
                    --name jenkins-cicd \
                    ${DOCKER_IMAGE}:${DOCKER_TAG}
                """
            }
        }
    }

    post {
        always {
            cleanWs()
        }

        success {
            echo "✅ Pipeline executed successfully"
        }

        failure {
            echo "❌ Pipeline failed"
        }
    }
}
