clean:
	@mvn clean

compile:
	@mvn clean install

run:
	@java -cp target/AdventOfCode-2019.jar pho.adventofcode.answers.Day$(DAY)Part$(PART) $(INPUT)
