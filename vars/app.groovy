def checkout() {
    // Git checkout
    checkout([$class: 'GitSCM', 
              branches: [[name: '*/main']], 
              userRemoteConfigs: [[url: 'https://github.com/Pavithra137/test.git', 
              credentialsId: 'git']]])
}

def test() {
    // Run unit tests
    sh "mvn test"
}

def build() {
    // Build Docker image
    sh "docker build -t my-docker-image ."
}
