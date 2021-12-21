import groovy.json.JsonOutput


def hello_world() {
    println("Hello, World!")
    def habits = "coffee ps4 games"
    def jsonObj = JsonOutput.toJson([name: "Jeevan", habits: habits.split(" ")])
    println(JsonOutput.toJson(jsonObj))
}

hello_world()