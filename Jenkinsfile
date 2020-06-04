node {
    notify('started')
   try {
       def mvnHome
       stage('Preparation') {     
          mvnHome = tool 'M3'
       }
      stage('checkout'){
          
          git branch: 'master',
          credentialsId: 'aab30840-d97e-4796-965b-db96581c627d',
          url: 'git@gitlab.com:safiullahsafi/rms-back.git'
      }
      stage('Build') {
          withEnv(["MVN_HOME=$mvnHome"]) {
             if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" clean'
                sh '"$MVN_HOME/bin/mvn" compile '
                sh '"$MVN_HOME/bin/mvn" package'
                
             } else {
                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
             }
          }
      }
      stage('Results') {
          junit '**/target/surefire-reports/TEST-*.xml'
          
          archiveArtifacts 'bootstrap/target/*.jar'
      }
    notify("success")
   } catch (e) {
       notify("err ${e}")
            currentBuild.result = 'FAILURE'
    }
 
sshagent(['aab30840-d97e-4796-965b-db96581c627d']) {
     stage('deploy'){
         sh 'pwd'
         sh 'cd bootstrap'
         sh 'ls'
         sh "scp -o StrictHostKeyChecking=no bootstrap/target/rms-back.jar root@51.15.216.115:/rms-back"
      
           
     }
  }
}
def notify(status){
    emailext body: """<p> ${status} : Job '${env.JOB_NAME} [${env.BUILD_NUMBER}] ' : </P>
                     <p> check console outoup at <a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}] </a> </p>""",
    subject: "${status} : Job '${env.JOB_NAME} [${env.BUILD_NUMBER}] '", 
    to: 'safiullahstudent45@gmail.com'
   
}