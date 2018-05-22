project_name = "jenkins-pipeline-python-test2"
repo = "git@github.com:eugeniodc/test-jenkins-1.git"
repo_name = "repo"

pipelineJob(project_name) {
	definition {
		triggers{
			scm('H/1 * * * *')
		}
		
		cpsScm {
			scm {
				git (repo)
				scriptPath("Jenkinsfile")
				
			}
		}
	}
}
