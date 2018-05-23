// Se indica nombre carpeta
project_name = "project-a/jenkins-pipeline-python-test2"
repo = "git@github.com:eugeniodc/test-jenkins-1.git"
repo_name = "repo"

folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}


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
