pipeline {
  agent {
    node {
      label 'master'
    }

  }
  stages {
    stage('mvn') {
      agent {
        node {
          label 'master'
        }

      }
      steps {
        sh 'pwd'
        sh 'docker run -it --rm -v "$PWD":. -v "$HOME/.m2":~/.m2 -v "$PWD/target:./target" -w . maven mvn clean package  '
      }
    }

  }
}