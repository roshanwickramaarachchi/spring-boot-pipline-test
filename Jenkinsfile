
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
            }
        }
        stage('Deploy Docker') {
            steps {
//                 sh 'docker build -t spring-boot-app .'
//                 sh 'docker run -d -p 8081:8081 --name spring-boot-app  spring-boot-app'

                sh '''
                            docker stop spring-boot-app || true
                            docker rm spring-boot-app || true
                            docker build -t spring-boot-app .
                            docker run -d -p 8081:8081 --name spring-boot-app spring-boot-app
                        '''
            }
        }
    }
}
