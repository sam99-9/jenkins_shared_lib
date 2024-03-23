def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name: "main" stageParams.branch ]],
        userRemoteConfigs: [[ url:"https://github.com/sam99-9/mrdevops_java_app.git" stageParams.url ]]
    ])
  }
