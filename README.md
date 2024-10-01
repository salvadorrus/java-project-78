# Project 3: Data validator.

### Hexlet tests and linter status:
[![Actions Status](https://github.com/salvadorrus/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/salvadorrus/java-project-78/actions)
<a href="https://codeclimate.com/github/salvadorrus/java-project-78/maintainability"><img src="https://api.codeclimate.com/v1/badges/28a7aa200b503ae0e9d6/maintainability" /></a>
[![Java CI](https://github.com/salvadorrus/java-project-78/actions/workflows/main.yml/badge.svg)](https://github.com/salvadorrus/java-project-78/actions/workflows/main.yml)
<a href="https://codeclimate.com/github/salvadorrus/java-project-78/test_coverage"><img src="https://api.codeclimate.com/v1/badges/28a7aa200b503ae0e9d6/test_coverage" /></a>
 ____
 
### Валидатор данных, это библиотека проверяющая корректность данных, таких как: ***String, Integer, Map.***
#### Библиотека содержит следующие методы:
### > String:
#### - `required()` — добавляет в схему ограничение, которое не позволяет использовать null или пустую строку в качестве значения.
#### - `minLength()` — добавляет в схему ограничение минимальной длины для строки. Строка должна быть равна или длиннее указанного числа.
#### - `contains()` — добавляет в схему ограничение по содержимому строки. Строка должна содержать определённую подстроку.

### > Integer:
#### - `required()` — добавляет в схему ограничение, которое не позволяет использовать null в качестве значения.
#### - `positive()` — добавляет ограничение на знак числа. Число должно быть положительным.
#### - `range()` — добавляет допустимый диапазон, в который должно попадать значение числа включая границы.

### > Map:
#### - `required()` — добавляет в схему ограничение, которое не позволяет использовать null в качестве значения. Требуется тип данных Map.
#### - `sizeof()` — добавляет ограничение на размер мапы. Количество пар ключ-значений в объекте Map должно быть равно заданному.
#### - `shape()` — добавляет проверку вставленных объектов мапы по ключу.