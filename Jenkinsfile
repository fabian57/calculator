pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage("Compile") {
            steps {
                sh "mkdir bin"
                sh "javac -cp '.:./lib/*' -d './bin' src/*.java"
            }
        }
        stage("Unit test") {
            steps {
                sh "java -cp '.:./lib/*:./bin' org.testng.TestNG testng.xml"
            }
        }
    }
}
