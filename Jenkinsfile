pipeline {
  agent any
  stages {
    stage('mvn') {
      agent any
      steps {
        sh 'pwd'
        sh 'docker run -it --rm  -v "$HOME/.m2":/root/.m2   -w $PWD maven mvn clean package  '
      }
    }

  }
}