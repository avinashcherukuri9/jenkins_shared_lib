/*def call(String project, String ImageTag, String JfrogUser){
    withCredentials([usernamePassword(
            credentialsId: "artifactory",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        echo "username: $USER"
        echo "password: $PASS"
      
        def curlCommand = "curl -u '${USER}:${PASS}' -T target/*.jar ${params.artifactoryURL}/artifactory/example-repo-local/"
        echo "Executing curl command : $curlCommand"
        sh curlCommand
    }
      
} */
