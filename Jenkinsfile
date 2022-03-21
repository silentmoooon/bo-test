pipeline {
  agent any
  stages {
    stage('compile') {
       
      steps {
            echo "2. 代码编译打包"
            sh 'podman run -it --rm -v /home/xiecan/.m2:/root/.m2 -v "$PWD:/usr/src/app" -w /usr/src/app maven:3.8.4-openjdk-17 mvn clean package -DskipTests'
        }
    }

    
    stage('build image') {
      steps {
            echo "3. build"
            sh 'docker build -t 192.168.50.96:5000/spring-test:latest .'
        }

        steps {
            echo "4. push"
            sh 'docker push  192.168.50.96:5000/spring-test:latest'
        }
    }

    stage('deploy to k8s') {
      steps {
            echo "5. deploy"
            sh 'helm upgrade -i helm/values.yaml spring-test ./heml'
        }

        
    }
  }
}