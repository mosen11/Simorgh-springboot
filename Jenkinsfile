pipeline{
	agent any
	stages{

		stage('compile stage'){
			steps{
				withMaven(maven: '3.3.9'){
					sh 'mvn clean compile'
				}
			}
		}
		stage ('test stage'){
			steps{
          		withMaven(maven: '3.3.9'){
          		sh 'mvn test'
          		}
          	}
		}
		stage ('deploy stage'){
			steps{
          		withMaven(maven: '3.3.9'){
          			sh 'mvn deploy'
          			}
          	}
		}

	}

}