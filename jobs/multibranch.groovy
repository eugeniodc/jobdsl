multibranchPipelineJob('python-dev') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote('git@github.com:eugeniodc/test-jenkins-1.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}