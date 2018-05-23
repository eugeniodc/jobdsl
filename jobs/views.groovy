listView('python') {
    description('Python pipeline')
    jobs {
        regex(/.*python.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }	
}