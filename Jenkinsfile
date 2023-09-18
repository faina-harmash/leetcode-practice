pipeline {
    agent any
    parameters {
        choice(
                choices:
                        [
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

}