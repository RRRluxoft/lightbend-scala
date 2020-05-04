## Summary of important sbt commands

* exit - ends the sbt session
* help - lists the available commands
* compile - compiles the main sources
* test:compile - compiles the test and main sources
* test - runs tests after compiling the test and main sources
* console - starts the REPL with the project on the classpath
* run - runs a main class, passing args provided on command line
* clean - deletes files produced by the build in the target directory
* reload - reloads the project in the current sbt session
* sbtVersion - provides the version of sbt

## REPL Commands
:help
:help [command]

:cp<path>           - add a jar or directory to the classpath
:history [num]      - show the history
:javap <classpath>  - disassemble a file or class name
:load <path>        - load and interpreter a Scala file
:paste              - enter paste mode: all input up to Ctrl-D compiled together
:quit               - exit the interpreter
:replay             - reset execution and replay all previous commands
:reset
:sh <command line>  - run a shell command (result is implicity => List[String])
:warnings


## Working on Exercises
* showExerciseID
* listExercises
* prevExercise
* nextExercise
* gotoExerciseNr <ex number>
* pullSolution
* savaState
* restoreState <ex Id>
* savedStates
