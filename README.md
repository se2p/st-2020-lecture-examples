# Beispiele zur Vorlesung Software Testing WS20/21

## Woche 1

Die drei Beispiele sollen die Unterscheidung der Begriffe Fault, Error, und Failure illustrieren. Die drei Begriffe sind in der Praxis voellig ueberladen und es gibt verschiedene Definitionen (siehe  https://stackoverflow.com/questions/6323049/understanding-what-fault-error-and-failure-mean/47963772). In der Vorlesung verwenden wir die Definition aus dem folgenden Buch:
Ammann, P., & Offutt, J. (2016). Introduction to software testing. Cambridge University Press.

Unabhaengig von der genauen Begrifflichkeit, was zaehlt ist das Verstaendnis fuer die folgenden Punkte:
1. Souce Code kann falsch sein. (Wir sagen dazu Fault)
2. Wenn falscher Code ausgefuehrt wird, kann das Resultat richtig oder falsch (= Error) sein.
3. Wenn ein Programmzustand falsch ist (Error) dann kann man diese Diskrepanz erst beobachten, wenn der Error bis zu einem Output des Programms propagiert ist (Failure)

