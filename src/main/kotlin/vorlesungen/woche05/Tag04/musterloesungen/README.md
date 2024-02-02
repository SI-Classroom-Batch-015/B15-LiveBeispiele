# Grundlagen der Programmierung

## Lambda


### Beschreibung:
*Lambda-Funktionen* können einem viel Zeit einsparen und vor allem viel Code!
Sie sind eine Art vorgefertigte Schleife, welche uns viel Arbeit abnehmen kann.
Wir befassen uns nun erstmal mit *Lambda-Funktionen* für Listen und Maps.

Hier einmal eine Auflistung der wichtigsten *Lambda-Funktionen* für Listen und Maps:
- `forEach` so ziemlich genau dasselbe wie eine *for-Schleife*
- `count` zählt wie oft Elemente auftreten, welche die gegebene Bedingung erfüllen
- `filter` sortiert alle Element raus, welche nicht die gegebene Bedingung erfüllen
- `sortedBy` bzw. `sortedByDescending` sortiert eine Liste nach der gegebenen Bedingung (!! Funktioniert nicht bei maps, diese müssen erst zu einer Liste umgewandelt werden !!)
- `minBy` bzw. `maxBy` das Maximum bzw. Minimum nach der gegebenen Bedingung
- `any` schaut ob mindestens ein Element existiert, welches die gegebene Bedingung erfüllt
- `all` schaut alle Elemente die gegebene Bedingung erfüllen
- `map` eine Art Zuweisung, womit wir bestimmen können, was am Ende in der Liste stehen soll. Wenn wir `map` auf eine Map
  anwenden, dann erzeugen wir eine Liste

> Der Kompiler kann eine andere Art von den jeweiligen *Lambda-Funktionen* vorschlagen, solltest du keine `{}` beim Benutzen
> einer *Lambda-Funktion* haben, musst du diese anpassen, damit du `{}` anstelle von `()` benutzt.


### Hinweise zur Bearbeitung:
- Lies erst die ganze Aufgabenstellung, bevor du die Aufgabe bearbeitest.
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Nutze den Debugger, wenn du nicht mehr weiter weißt.
- Achte darauf deinen Code sinnvoll zu kommentieren.

> In den Aufgaben 1 - 6 sind die `main()` Funktionen, die Listen und Maps und auch die Funktionsköpfe
> (Namen der Funktion usw.) bereits gegeben. Diese sollen nicht verändert werden, es soll lediglich in den Funktionen
> gearbeitet werden.

> Häufig brauchen wir eine *Hilfsvariable* bei *for-Schleifen*, auch hier kann es dazu kommen. Hilfsvariablen sind z.B.
> Variablen, in denen wir unsere Aufzählung oder ähnliches speichern können.

---
### Aufgabe 1 - ForEach

<details>

In dieser Aufgabe arbeiten wir in den Funktionen `loopForEach()` und `lambdaForEach()`.
Wir möchten den Inhalt der List `sentenceList` einmal auf der Konsole ausgeben.
Dies soll innerhalb der `loopForEach()` mittels einer *for-Schleife* geschehen.  
In `lambdaForEach()` soll dagegen mit `forEach` gearbeitet werden.

Am Ende sollte auf der Konsole also folgendes stehen:

```
loopForEach():
Das hier ist ein kleiner Satz.
lambdaForEach():
Das hier ist ein kleiner Satz.
```

Beide Funktionen sollten die exakt selbe Ausgabe haben, jedoch über einen anderen Weg erreicht worden sein.

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *Aufgabe1.kt*

</details>

---

### Aufgabe 2 - Count

<details>

In dieser Aufgabe wollen wir einmal schauen, wie viele Zahlen in `countNumbersList` **unter 50** liegen.  
In `loopCounter()` soll nun analog zur ersten Aufgabe mithilfe von einer *for-Schleife* gezählt werden,
wie viele der Zahlen **unter 50** liegen.  
In `lambdaCounter()` wollen wir auch zählen wie viele Zahlen **unter 50** liegen, jedoch wollen wir hierfür `count` benutzen.


**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *Aufgabe2.kt*

</details>

---

### Aufgabe 3 - MaxBy / MinBy und SortedBy / SortedByDescending

<details>

In dieser Aufgabe haben wir eine Liste von Listen namens `listOfScores`, in dieser sind Bewertungen von 1 bis 7 gespeichert.
Wir möchten diese nun nach einem bestimmten Index der inneren Listen sortieren sprich,
wenn wir nach dem ersten Index sortieren, dann betrachten wir von allen inneren Listen nur das erste Element und sortieren
danach.  
Als Beispiel wurde einmal die Funktion `sortedByLoop()` komplett gegeben und muss nicht verändert werden.  
Keine Sorge so eine Funktion müsst ihr nicht bauen, sie dient lediglich als Beispiel, wie umständlich es sein kann, ohne
Prädikate diese Aufgabe zu lösen. Die eigentliche Aufgabe besteht nun hieraus:
- `sortedByLambda()` soll `listOfScores` sortiert nach dem Index 2 ausgeben, nutze dafür `sortedBy` und gebe die sortiere Liste aus
- `maxByLambda()` soll die Liste ausgeben, welche den größten Wert in `listOfScores` an dem Index 3 hat, nutze dafür `maxBy` und gebe diese aus
- `minByLambda()` soll die Liste ausgeben, welche den kleinsten Wert in `listOfScores` an dem Index 4 hat, nutze dafür `minBy` und gebe diese aus.

Am Ende sollte auf der Konsole also folgendes stehen:

```
sortedByLoop():
[[1, 6, 7, 4, 4, 6], [2, 4, 2, 5, 1, 3], [3, 3, 6, 2, 7, 3], [4, 2, 5, 5, 5, 4], [4, 6, 3, 3, 7, 3], [5, 4, 2, 2, 3, 5]]
sortedByLambda():
[[2, 4, 2, 5, 1, 3], [5, 4, 2, 2, 3, 5], [4, 6, 3, 3, 7, 3], [4, 2, 5, 5, 5, 4], [3, 3, 6, 2, 7, 3], [1, 6, 7, 4, 4, 6]]
maxByLambda():
[2, 4, 2, 5, 1, 3]
minByLambda():
[2, 4, 2, 5, 1, 3]
```

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *Aufgabe3.kt*

</details>

---

### Aufgabe 4 - Filter

<details>

In dieser Aufgabe ist die Liste `filterNamesList` gegeben, wir wollen nun aus dieser Liste alle Namen rausfiltern,
welche ein `o` **oder** `i` enthalten.
In `loopFilter()` soll dies wieder durch eine *for-Schleife* umgesetzt werden.
`lambdaFilter()` soll mit `filter` gelöst werden.
Gebe bei beiden Funktionen die gefilterte Liste auf der Konsole aus.

> Mit `in` kann überprüft werden, ob etwas in einer Liste ist, jedoch geht `in` auch bei strings!

Am Ende sollte auf der Konsole also folgendes stehen:

```
loopFilter():
[angelo, christopher, frederic, manolito, mike, oliver, sebastian, timur, vinzenz, katharina]
lambdaFilter():
[angelo, christopher, frederic, manolito, mike, oliver, sebastian, timur, vinzenz, katharina]
```

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *Aufgabe4.kt*

</details>

---

### Aufgabe 5 - Any / All

<details>

In der folgenden Aufgabe ist die Liste `anyAndAllList` gegeben.
Wir möchten nun die Liste auf bestimmte Vorkommen überprüfen.
Dazu sollen die Funktionen wie Folgt ergänzt werden:
- `loopAny()` soll schauen, ob es eine Zahl gibt, welche durch 17 teilbar ist.
  Dies soll dies wieder durch eine *for-Schleife* realisiert werden
- `lambdaAny()` soll schauen, ob es eine Zahl gibt, welche **über 500** ist. Nutze hierfür `any`
- `lambdaAll()` soll schauen, ob alle Zahlen gerade sind. Nutze hierfür `all`

> Falls dir nicht mehr einfällt, wie man schaut, ob etwas durch etwas teilbar ist, schaue dir nochmal *Modulo* an.

Am Ende sollte auf der Konsole also folgendes stehen:

```
loopAny():
true
lambdaAny():
true
lambdaAll():
false
```

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *Aufgabe5.kt*

</details>

---

### Aufgabe 6 - Map

<details>

`map` erstellt eine neue Liste basierend auf der alten Liste oder auch der alten Map und den gegebenen Regeln.
In dieser Aufgabe wollen wir nun einmal die Zahlen in der List `integerList` quadrieren.
Dafür müssen wir keine library oder ähnliches benutzen, wir nehmen einfach die Zahl mal sich selbst.
Ziel ist in `loopMap()` mithilfe einer *for-Schleife* die quadrierte Liste auszugeben.
In `lambdaMap()` soll auch die quadrierte Liste ausgegeben werden, jedoch soll hierfür `map` verwendet werden.

Am Ende sollte auf der Konsole also folgendes stehen:

```
loopMap():
[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
lambdaMap():
[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
```

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *Aufgabe6.kt*

</details>

---

### Aufgabe 7 - Kombinieren

<details>

> *Lambda-Funktionen* können wir auch kombinieren. Das heißt wir können erst filtern und dann das maximum finden, oder
> erst sortieren und dann mappen usw. Das ganze erfolgt durch einen weiteren `.` am Ende des Prädikates.
> Ein Beispiel für eine Aneinanderreihung:  
> `nameEinerListe.filter{ it < 10 }.count{ it > 0 }`  
> mit dieser Folge von *Lambda-Funktionen* würden wir zum Beispiel aus einer
> Liste von Zahlen alle Zahlen filtern, welche unter 10 sind und daraufhin dann nur die Zahlen zählen, welche über 0 sind.

In dieser Aufgabe haben wir nun die Map `gradesMap` gegeben, in der Schüler und ihre Durchschnittsnote stehen.
Wir wollen eine Liste der Namen der Schüler haben, welche nach den Durchschnittsnoten sortiert ist,
mit der niedrigsten (damit die beste) zuerst.
Dies kann direkt in der `main()` Funktion gemacht werden.
Es soll keine Schleife benutzt werden!

> `sortedBy` kann man nicht auf eine Map anwenden, versuche hierfür eine Lösung zu finden

Am Ende sollte auf der Konsole also folgendes stehen:

```
[Murat, David, Kevin, Onur, Jeremy, Olivia, Florian, Phil, Lisa, Chantal, Joachim]
```

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *Aufgabe7.kt*

</details>

---

### Aufgabe 8 - Bonus

<details>

In dieser Aufgabe haben wir nun die Map `movieMap` gegeben, in der Filme bzw. Serien und ihre Bewertungen gespeichert sind.
Ziel der Aufgabe ist es, die Filme zu finden, welche am meisten Bewertungen zwischen 3 und 7 bekommen haben.
Es soll auch hier keine Schleife benutzt werden!

> Wenn man *Lambda-Funktionen* in *Lambda-Funktionen* verwendet, ist es ratsam den Standardnamen der variable `it` umzubenennen.
> Dies kann man, indem man bevor man etwas in der *Lambda-Funktion* macht, einen *namen* mit einem `->` schreibt.  
> Beispiel: `.count { neuerNameFürIt -> neuerNameFürIt > 50 }`

Am Ende sollte auf der Konsole also folgendes stehen:

```
[James Bond, Der Schacht, Dragon Ball, Van Helsing, Avatar, One Piece]
```

**Modul für die Aufgabe:** *Aufgabe8*  
**Datei für die Aufgabe:** *Aufgabe8.kt*

</details>

---
