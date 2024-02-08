def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "artifactory",
            usernameVariable: "admin",
            passwordVariable: "@vinAsh994"
    )]) {

      
        def curlCommand = "curl -u '${USER}:${PASS}' -T target/*.jar ${params.artifactoryURL}/artifactory/example-repo-local/"
        echo "Executing curl command : $curlCommand"
        sh curlCommand
    }
      
}
