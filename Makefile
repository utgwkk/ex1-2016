MAIN=Hoge

*.class: *.java
	javac $(MAIN).java

clean:
	rm -f *.class

run: *.class
	java $(MAIN)