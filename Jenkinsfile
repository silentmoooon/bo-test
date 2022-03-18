pipeline {
  agent any
  stages {
    stage('mvn') {
      agent any
      steps {
        sh 'pwd'
        sh 'docker run -i --rm   maven mvn clean package  '
      }
    }

  }
}