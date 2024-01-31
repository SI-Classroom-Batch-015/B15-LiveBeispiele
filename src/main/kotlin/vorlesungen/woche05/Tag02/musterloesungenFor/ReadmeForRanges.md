# Grundlagen der Programmierung

## Schleifen

### Beschreibung:

In dieser Tagesaufgabe vertiefen wir einmal unser Wissen über Schleifen.


### Hinweise zur Bearbeitung:
- Lies erst die ganze Aufgabenstellung, bevor du die Aufgabe bearbeitest.
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Achte darauf deinen Code sinnvoll zu kommentieren.

---

### Aufgabe 1 - Programmfluss verstehen I

<details>

- Führe den folgenden Code **nicht** aus!
- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort in den Kommentar in der Aufgabendatei.

```kotlin
fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0 until books.size) { 
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}
```

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *TextAbgabe.kt*

</details>

---

### Aufgabe 2 - Programmfluss verstehen II

<details>

- Führe den folgenden Code **nicht** aus!
- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
fun main() { 
    val weekDays: List<String> = listOf(  
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.") 
        } else {
            println("am $day muss ich arbeiten.")
        }
    }
}
```

**Modul für die Aufgabe:** *Aufgabe2*
**Datei für die Aufgabe:** *TextAbgabe.kt*

</details>

---

### Aufgabe 3 - Programmfluss verstehen III

<details>

- Führe den folgenden Code **nicht** aus!
- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2 until brands.size) {
        println(brands[i])
    }
}
```

**Modul für die Aufgabe:** *Aufgabe3*
**Datei für die Aufgabe:** *TextAbgabe.kt*

</details>


---

### Aufgabe 4 - Programmfluss verstehen IV

<details>

- Führe den folgenden Code **nicht** aus!
- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Was ist die letzte Zahl, die ausgegeben wird?
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
fun main() {
    var i = 0
    do{
        println(i)
        i++
    } while (i < 10)
}
```

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *TextAbgabe.kt*


</details>


---

### Aufgabe 5 - Programmfluss verstehen V

<details>

- Führe den folgenden Code **nicht** aus!
- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
fun main() {
    val randomNumbers : List<Int> = listOf(351, 9, 100, 5078, 13)
    var i = 0
    while (i <= 5) {
        println(randomNumbers[i])
        i++
    }
}
```

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *TextAbgabe.kt*


</details>


---

### Aufgabe 6 - Menu

<details>

In dieser Aufgabe sollst du jedes Element in der Liste `menu` auf der Konsole ausgeben.
Nutze dafür, die für dich sinnvollste Schleifenart.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *Menu.kt*

</details>

---

### Aufgabe 7 - Alphabet

<details>

**A)**  
In dieser Aufgabe sollst du nun innerhalb der Funktion `printAlphabet()` das Alphabet von `b` bis `n` auf der Konsole ausgegeben.  
Die Buchstaben sollen in einer Zeile nur mit Komma und Leerzeichen getrennt angezeigt werden

Die Ausgabe sollte wie folgt aussehen:  
`b, c, d, e, f, g, h, i, j, k, l, m, n`

**B)**  
Ändere die Funktion nun so, dass ihr zwei Buchstaben als Parameter übergeben werden sollen.
Diese sollen die range des Alphabets bestimmen.  
z.B. wenn `q` und `t` übergeben werden, soll auf der Konsole `q, r, s, t` angezeigt werden.

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *Alphabet.kt*

</details>

---

### Aufgabe 8 - Einkäufe auflisten

<details>

In dieser Aufgabe geht es darum, eine MutableList zu verändern.
In der Aufgabendatei findest du eine Liste mit dem
Namen `shoppingList`, in der Lebensmittel in Form von Strings gespeichert sind.
Deine Aufgabe ist es vor jedes Lebensmittel die Stelle zu schreiben, an der es
in der MutableList steht. Verwende hierfür eine Schleife deiner Wahl.

Am Ende sollte in der `shoppingList` also folgendes stehen:  
`"1. Reis", "2. Tofu", "3. Brokkoli", ...`

> Wenn du einen Integer zu einem String hinzufügen willst, musst du .toString() verwenden.

**Modul für die Aufgabe:** *Aufgabe8*  
**Datei für die Aufgabe:** *Einkaeufe.kt*

</details>

---

### Aufgabe 9 - Schleifen und Listen

<details>

In der Aufgabendatei findest du eine Liste namens `satzRueckwaerts`.  
Verwende für jede Teilaufgabe eine Schleife deiner Wahl.

**A)**  
Gib den Inhalt der Liste rückwärts in der Konsole aus.

In der Konsole sollte folgendes ausgegeben werden:  
`Heute ist ein sehr schöner Tag `

**B)**  
Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus.  
Diesmal allerdings nur jedes *zweite* Wort.

In der Konsole sollte folgendes ausgegeben werden:  
`ist sehr Tag`

**C)**  
Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus.  
Diesmal allerdings nur die ersten 3 Wörter.

In der Konsole sollte folgendes ausgegeben werden:  
`Heute ist ein`

**Modul für die Aufgabe:** *Aufgabe9*  
**Datei für die Aufgabe:** *SchleifenUndListen.kt*
</details>

---

### Bonus

<details>

Wir wollen ein kleines Ratespiel schreiben.

**A)**  
Das Spiel besteht aus einem Spieler (Du) und einem Computerspieler.  
Wenn das Programm gestartet wird, denkt sich der Computer eine
zufällige Zahl zwischen 1 und 100 aus.  
(Dieser Teil ist bereits vorgegeben.)

Der Spieler gibt dann über die Konsole eine Zahl ein:
- Wenn die eingegebene Zahl *kleiner* ist, als die Zahl des Computers,
  wird in der Konsole "Zu klein!" ausgegeben.
- Wenn die eingegebene Zahl *größer* ist, als die Zahl des Computers,
  wird in der Konsole "zu groß" ausgegeben.
- Ist die eingegebene Zahl *gleich* der Zahl des Computers,
  wird in der Konsole "Du hast gewonnen!" ausgegeben.

Wenn die eingegebene Zahl kleiner oder größer war (Der Spieler also falsch lag), wird die Runde wiederholt,
solange bis der Spieler die Zahl erraten hat.

**B)**
Zähle jetzt zusätzlich auch die Anzahl an Versuche, die der Spieler
gebraucht hat, bis er die Zahl des Computers erraten konnte.

**C)**
Sei kreativ und erweitere dein Spiel wie du möchtest und mach es somit einzigartig.

**Modul für die Aufgabe:** *Bonus*  
**Datei für die Aufgabe:** *Ratespiel.kt*
</details>

---
