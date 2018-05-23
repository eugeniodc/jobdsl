listView('python') {
    description('Python pipeline')
    jobs {
        regex(/.*python.*/)
    }
}