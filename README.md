# Beispiele zur Vorlesung Software Testing WS20/21

## Woche 1

Die drei Beispiele sollen die Unterscheidung der Begriffe Fault, Error, und Failure illustrieren. Die drei Begriffe sind in der Praxis völlig überladen und es gibt verschiedene Definitionen (siehe  https://stackoverflow.com/questions/6323049/understanding-what-fault-error-and-failure-mean/47963772). In der Vorlesung verwenden wir die Definition aus dem folgenden Buch:
Ammann, P., & Offutt, J. (2016). Introduction to software testing. Cambridge University Press.

Unabhängig von der genauen Begrifflichkeit, was zählt ist das Verständnis für die folgenden Punkte:
1. Source Code kann falsch sein. (Wir sagen dazu _Fault_)
2. Wenn falscher Code ausgeführt wird, kann das Resultat richtig oder falsch (= _Error_) sein.
3. Wenn ein Programmzustand falsch ist (Error) dann kann man diese Diskrepanz erst beobachten, wenn der Error bis zu einem Output des Programms propagiert ist (_Failure_)

## Woche 2

Die Beispielklassen und Tests dienen hauptsächlich dazu, die Unterschiede zwischen den in der Praxis verwendeten Kriterien (Line Coverage, Branch Coverage) und den in der Vorlesung besprochenen theoretischen Kriterien zu illustrieren.

Line Coverage entspricht in den meisten Fällen Statement Coverage, da guter Coding Style dazu führt, dass im Normalfall nur ein Statement pro Zeile steht.

Branch Coverage in Jacoco/IntelliJ bezieht sich nur auf Conditional Statements (`if`, `while`, etc.) und nicht auf Kanten im Kontrollflussgraphen. Somit subsumiert diese Variante von Branch Coverage _nicht_ Statement Coverage.

Die Short-Circuiting-Beispiele zeigen dass Condition Coverage in Java nicht immer offensichtlich erfüllbar ist, da der Compiler durch Short Circuiting komplexe Bedingungen in verschachtelte atomare Bedingungen übersetzt. Um die kompilierte Variante im Bytecode anzusehen, kann man das `javap` Tool an der Kommandozeile verwenden.

Die Beispiele sollen weiters Diskrepanzen zwischen Coverage-Messungen in Jacoco und IntelliJ zeigen (z.B. siehe DivisionByZero, oder TryCatchExample, oder SwitchExample).

  