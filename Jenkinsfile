pipeline {
  agent any
  tools {
        maven "Maven 3.8.6" 
   }

  stages {
      stage('Build Artifact') {
            steps {
              sh "mvn clean install -DskipTests=true"
              archive 'target/*.jar' 
            }  
       }

     }
}
