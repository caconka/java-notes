OBJS = *.class
INHERITANCE_PATH = src/inheritance/

clean:
	@echo "Cleaning..."
	rm -f $(INHERITANCE_PATH)$(OBJS)

inheritance:
	javac -sourcepath src src/inheritance/*.java && java -classpath src inheritance.Main

.PONY: clean
