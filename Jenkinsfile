pipeline {
  agent any
  stages {
    stage('compile') {
       
      steps {
            echo "2. 代码编译打包"
            sh 'podman run -it --rm  -v "/home/xiecan/.m2":/root/.m2   -w $PWD maven:3.8.4-openjdk-17 mvn clean package -DskipTests'
        }
    }


  }
}