Втора лабораториска вежба по Софтверско инженерство
----------------------------------------------------
Наташа Стојановска, бр. на индекс 192138
----------------------------------------

Control Flow Graph
--------------------
![cfg-lab2-192138](https://user-images.githubusercontent.com/52199952/119862226-9384b400-bf18-11eb-8152-040a56269110.png)


Цикломатска комплексност
--------------------------
Цикломатската комплексност на овој код е 5, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=4, па цикломатската комплексност
изнесува 5. Цикломатската комплексност може да се добие и со следната формула E - V + 2 = 16 - 13 + 2 = 5. 
Бројот на региони = 5.

Тест случаи според критериумот Every statement
-----------------------------------------------
.....

Тест случаи според критериумот Every path
------------------------------------------

   A-B
   B-C 
   C-D
   D-E
   D-G
   D-L
   E-F
   F-G
   G-I
   G-H
   H-I
   I-J
   H-J
   I-K
   J-K
   L-M
   M-B


Објаснување на напишаните unit tests
------------------------------------
....
