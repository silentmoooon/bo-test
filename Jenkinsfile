pipeline {
  agent any
  stages {
    stage('mvn') {
      agent any
      steps {
        sh 'pwd'
        sh 'docker run -it --rm -v "$PWD":. -v "$HOME/.m2":~/.m2 -v "$PWD/target:./target" -w . maven mvn clean package  '
      }
    }

  }
}