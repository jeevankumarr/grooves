import groovy.json.JsonOutput


def hello_world() {
    println("Hello, World!")
}

def createEscapedJson() {
    def habits = "coffee ps4 games"
    def jsonObj = JsonOutput.toJson([name: "Jeevan", habits: habits.split(" ")])
    println(JsonOutput.toJson(jsonObj))
}

def main() {
    hello_world()
    createEscapedJson()
}
main()