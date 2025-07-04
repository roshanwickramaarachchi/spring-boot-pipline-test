
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                 git branch: 'main', url: 'https://github.com/roshanwickramaarachchi/spring-boot-pipline-test.git'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying application..."
                // your deploy steps here

//                 sh 'java -jar target/*.jar --server.port=8081'
                sh 'nohup java -jar target/*.jar --server.port=8081 > app.log 2>&1 & disown'
            }
        }
    }
}
