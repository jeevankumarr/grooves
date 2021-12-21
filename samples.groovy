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
// extracts the common elements from lists and returns a list of common elements
// excludes nulls
def getCommonElements(firstList, secondList) {
    def opt = []
    for (f in firstList) {
        for (s in secondList) {
            if (f != null && f.equals(s)) {
                opt.add(s)
            }
        }
    }
    return opt
}
def main() {
    hello_world()
    createEscapedJson()
    println(getCommonElements(["dog", "cat", "mouse", "racoon"], ["elephant", "mouse", "cat"]))
}

main()
