# Java programozási alapok

## Nevezetes programozási tételek

### Összegzés tétele

Hozzatok létre egy egész számok listáját, és számoljátok ki a számok összegét!

### Számlálás tétele

Hozzatok létre egy egész számok listáját, pozitív és negatív számokkal,
és számoljátok össze, hogy hány negatív szám szerepel a listában!

### Szélsőérték keresés tétele

Hozzatok létre szavak listáját, és keressétek ki a leghosszabb szót!

### Eldöntés tétele

Mond meg egy egész számokat tartalmazó listáról, hogy csak
páros számokat tartalmaz-e!

## Transzformáció

Hozz létre egy Employee osztályt, névvel. Majd hozz létre egy Employee
objektumokat tartalmazó listát!
Hozz létre egy olyan másik String listát, mely az alkalmazottaknak csak a neveit
tartalmazza!

List<Employee> -> List<String>

## Szűrés

Hozz létre egy List<Employee> objektumot, és szűrd ki belőle a 100_000-nél 
nagyobb fizetésű alkalmazottakat. Hozz létre egy új listát a feltételnek
megfelelő alkalmazottakkal.

## Autók

A `Car` osztályból öröklődik a `Jeep` osztály, egyes metódusokat felülírva és használva az ős attribútumait. 
Mindkét autótípus esetében van `drive(int)` metódus, ami a vezetést szimulálja, adott km megtételét és közben 
az elhasznált üzemanyaggal csökkenti annak mennyiségét is, valamint ki tudjuk számítani a tankolható üzemanyagot 
is (`calculateRefillAmount()`).
A `Jeep` abban különbözik ősosztályától, hogy üzemanyagot nem csak a tankban, hanem kannákban is tud szállítani.
Felhasználáskor mindig először a kannákat ürítjük ki, utána a tankban levő üzemanyag mennyisége csökken.

Készíts egy `Car` osztályt `double fuelRate`, `double fuel`, `double tankCapacity` attribútumokkal:

* Konstruktor:

```java
public Car(double fuelRate, double fuel, double tankCapacity)
```

* Publikus metódusok:

```java
public void modifyFuelAmount(double fuel)
public void drive(int km) // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
public double calculateRefillAmount() //kiszámolja, mennyit lehet tankolni
```

Készíts egy `Jeep` osztályt `double extraCapacity` és `double extraFuel` attribútumokkal:

* Konstruktor

```java
public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel)
```

* Publikus metódusok:

```java
public void modifyFuelAmount(double fuel) // örökölt metódus az ősosztályból, nem kell felülírni
public void drive(int km) // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
public double calculateRefillAmount() //kiszámolja, mennyit lehet tankolni
```

Érdemes egy külön metódusba kiszervezni, hogy adott km megtételéhez van-e elegendő üzemanyagunk!

## Tudásellenőrző teszt

https://forms.office.com/Pages/ResponsePage.aspx?id=uo8WgI7Wd0uJJxcOS3B8gc7cFEH0fnFAsSYLZeAqjs9UMkczSjc4TEZOMElFSTRLRjJKSkI3WjNPVi4u