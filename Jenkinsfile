pipeline {
    agent any

    environment {
        DOCKERHUB_USERNAME = "sachinpachpute"
        APP_NAME = "gitops-demo-app"
        IMAGE_TAG = "${BUILD_NUMBER}"
        IMAGE_NAME = "${DOCKERHUB_USERNAME}" + "/" + "${APP_NAME}"
        REGISTRY_CREDS = 'dockerhub'
    }
    stages {
        stage('Cleanup Workspace') {
            steps {
                script {
                    cleanWs()
                }
            }
        }
        stage('Checkout SCM') {
            steps {
                git url: 'https://github.com/sachinpachpute/spring-boot.git',
                 branch:'master'
            }
        }
    }
}
