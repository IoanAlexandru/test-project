pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'This is from the build stage'
            }
        }

        stage('test') {
            steps {
                sh 'This is from the test stage'
            }
        }

        stage('release') {
            steps {
                sh 'This is from the release stage'
            }
        }

        stage('deploy') {
            steps {
                sh 'This is from the deploy stage'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}