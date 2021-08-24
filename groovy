pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                echo 'Build up application ...'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing the application ...'
           }
       }
        stage('Deploy'){
            steps{
                echo 'Deploying the code into the application ...'
           }
       }
    }       
}
