def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "artifactory",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {

      
        def curlCommand = "curl -X PUT -u '${USER}:${PASS}' -T target/*.jar ${params.artifactoryURL}/artifactory/example-repo-local/"
        echo "Executing curl command : $curlCommand"
        sh curlCommand
    }
      
}
