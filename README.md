# Assignment – Metrika, pregled i statička analiza

## 1. Opis projekta

Predmet analize je Java projekat Calculator, koji omogućava osnovne aritmetičke operacije: sabiranje, oduzimanje, množenje i deljenje.

Originalni repozitorijum: https://github.com/vladimir-dresevic/calculator-java

Fork repozitorijum: https://github.com/ljubica09/calculator-java

## 2. LOC metrika

Broj linija koda utvrđen je korišćenjem GitHub prikaza LOC metrike za Java fajlove.

| Fajl | LOC |
|---|---:|
| Calculator.java | 134 |
| Start.java | 19 |
| **Ukupno** | **153** |

Broj fizičkih linija u fajlovima projekta:

| Fajl | Fizičke linije |
|---|---:|
| Calculator.java | 188 |
| Start.java | 26 |
| LICENSE | 21 |
| **Ukupno** | **235** |

## 3. Neformalni pregled koda i statička analiza

Pregled je obavljen analizom izvornog koda, bez pokretanja programa.

### Calculator.java

- Linija 6 – Korišćenje statičke promenljive `finalResult` može izazvati probleme pri istovremenim pozivima.
- Linija 18 – Naziv metode `ToString()` ne prati Java konvenciju imenovanja metoda.
- Linija 24 – Naziv metode `Run()` ne prati Java konvenciju imenovanja metoda.
- Linija 32 – Ne postoji provera da li je ulazni izraz prazan pre poziva `charAt(0)`.
- Linija 37 – Razdvajanje izraza pomoću regularnog izraza ne obrađuje pravilno sve slučajeve, naročito negativne brojeve unutar izraza.
- Linija 62 – Hvata se opšti tip izuzetka `Exception`, umesto konkretnog izuzetka `NumberFormatException`.
- Linija 73 – Metoda `Calculate()` menja prosleđene liste i koristi rekurzivne pozive, što otežava održavanje koda.
- Linija 80 – Promenljiva `result` inicijalizuje se nulom, a zatim se koristi operator `+=`, iako bi direktna dodela bila jednostavnija.

### Start.java

- Linija 6 – Naziv promenljive `Expression` ne prati Java konvenciju camelCase imenovanja promenljivih.
- Linija 12 – Objekat `Scanner` kreira se unutar svake iteracije petlje, iako može biti kreiran jednom pre početka petlje.
- Linija 13 – Ne postoji provera da li ulazni tok sadrži još podataka pre poziva `nextLine()`.

## 4. Zaključak

Analizirani projekat predstavlja jednostavnu Java aplikaciju za izvođenje osnovnih aritmetičkih operacija.

Pregledom koda uočene su nedoslednosti u imenovanju metoda i promenljivih, nedovoljna validacija ulaznih podataka, korišćenje opšteg tipa izuzetka i mogućnosti za poboljšanje strukture i održavanja koda.

Posebnu pažnju treba posvetiti obradi neispravnih izraza, upravljanju ulaznim tokom i načinu čuvanja rezultata.

Analiza je izvršena statički, bez pokretanja programa.
