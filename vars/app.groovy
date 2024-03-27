def checkout() {
    // Git checkout
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], [[credentialsId: 'git', url: 'https://github.com/Pavithra137/dotnet-demo.git']]])        
}

def test() {
    // Run unit tests
    sh "mvn test"
}

def build() {
    // Build Docker image
    sh "docker build -t my-docker-image ."
}
