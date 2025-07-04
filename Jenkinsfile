// pipeline {
//     agent any
//
//     tools {
//         jdk 'jdk-17' // Ensure you have JDK 17 configured in Jenkins
//     }
//
//     stages {
//         stage('Checkout') {
//             steps {
//                 git 'https://github.com/roshanwickramaarachchi/spring-boot-pipline-test.git'
//             }
//         }
//
//         stage('Build') {
//             steps {
//                 sh './mvnw clean package -DskipTests'
//             }
//         }
//
//         stage('Deploy') {
//             steps {
//                 echo "Deploying application..."
//
//                 // If deploying locally on the same server
//                 sh 'docker stop springboot-app || true'
//                 sh 'docker rm springboot-app || true'
//                 sh 'docker rmi springboot-app || true'
//                 sh 'docker build -t springboot-app .'
//                 sh 'docker run -d --name springboot-app -p 8081:8080 springboot-app'
//
//                 // OR if deploying to fly.io
//                 // sh 'fly deploy'
//
//                 // OR if deploying to Render, use their CLI/API
//             }
//         }
//     }
// }

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/roshanwickramaarachchi/spring-boot-pipline-test.git'
            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying application..."
                // your deploy steps here
            }
        }
    }
}
