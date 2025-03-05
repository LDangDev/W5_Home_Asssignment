pipeline {
    agent any
    stages{
        stage('checking'){
            steps {
                git branch: 'master', url: 'https://github.com/LDangDev/W5_Home_Asssignment.git'

            }
        }

        stage('build'){
            steps{
                bat 'mvn clean install'
            }
        }

    }
}