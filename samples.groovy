import groovy.json.JsonOutput


def hello_world() {
    println("Hello, World!")
}

def createEscapedJson() {
    def habits = "coffee ps4 games" // takes an un-seperated string

    // creates a json object with key value pair combinations, and splits 'habits'
    def jsonObj = JsonOutput.toJson([name: "Jeevan", habits: habits.split(" ")])
    
    // jsonObj is escaped via creating another json object - stringify
    println(JsonOutput.toJson(jsonObj))
}

def main() {
    hello_world()
    createEscapedJson()
}

main()