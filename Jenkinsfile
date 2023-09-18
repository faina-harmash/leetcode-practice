pipeline {
    agent any
    parameters {
        choice(
                choices:
                        [
                                'dev',
                                'test',
                                'acc',
                                'prod'
                        ],
                description:
                        'Environment under testing.',
                name:
                        'env'
        )
        choice(
                choices:
                        [
                                'chrome',
                                'firefox',
                                'safari',
                        ],
                description:
                        'Browser under testing',
                name:
                        'browser'
        )

    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            when {
                expression {
                    BRANCH_NAME == 'master' || BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }

    }
    post {
        always {
            echo "Notifying build result by email"
        }
        success {
            mail to: 'faya.garmash.work@gmail.com',

                    subject: "SUCCESS: ${currentBuild.fullDisplayName}",

                    body: "Test Complete Build passed."
        }
        failure {
            mail to: 'faya.garmash.work@gmail.com',

                    subject:"FAILURE: ${currentBuild.fullDisplayName}",

                    body: "Test Complete Build failed."
        }
    }

}