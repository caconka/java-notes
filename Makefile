OBJS = *.class
INHERITANCE_PATH = src/inheritance/

clean:
	@echo "Cleaning..."
	rm -f $(INHERITANCE_PATH)$(OBJS)

inheritance:
	javac -sourcepath src src/inheritance/*.java && java -classpath src inheritance.Main

constructors:
	javac -sourcepath src src/constructors/*.java && java -cp src constructors.Main

composition:
	javac -sourcepath src src/composition/*.java && java -cp src composition.Main

.PONY: clean
