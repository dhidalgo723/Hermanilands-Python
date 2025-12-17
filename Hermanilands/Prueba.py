# importacion de librerias
import random
import math

# input es el Scanner de python
name = input("Ingrese su nombre: ")
age = int(input("Ingrese su edad: "))

# son lo mismo estos dos
# print("Hola {}, tienes {} años.").format(name, age)
print(f"Hola {name}, tienes {age} años.")

# este sirve para decidir que quieres mostrar de un arraylist por ejemplo
# sintaxis --> string[start:end:step]
appName = "PythonX"
print(appName[:4])
print(appName[2:5])
print(appName[3:])
print(appName[::2])

# genera una secuencia de numeros, se suele usar en for
print(list(range(5)))
print(list(range(1,5)))
print(list(range(1,10,2)))


# bucle while
i = 0
while i < 3:
	print("I Love Python")
	i = i+1

# bucle for
for i in range(5):
    print(i)


# multiplicacion
num = int(input("Enter the number for which you wish to generate the multiplication table:"))
for i in range(1, 11):
  print(num, "x", i, "=", num*i)

# numeros pares
num = int(input("Enter the number till where you want to generate even numbers:"))
i=0
while i<= num:
  if i%2==0:
  print(i)
  i=i+1

# arrays
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)
    
# concatenacion de arrays
lst1 = [1, 2, 3]
lst2 = [4, 5, 6]
print(lst1+lst2)
print(lst1 * 3)

# busqueda en arrays
enrolledList = ["Sam", "Mike", "Kane", "Nick"]
print("Sam" in erolledList)
print("Samuel" in erolledList)

# busqueda en arrays en bucle
fruits = ["Apple", "Mango", "Cherry", "Banana"]
for i in fruits:
  if i == "Mango":
      print("Mango Found")
      break
  else: 
    print("Mango not Found")

# minimo maximo y longitud de un array 
numbers = [23, 56, 78, 13, 98, 33]
print(len(numbers))
print(min(numbers))
print(max(numbers))

# crear un array de numeros pares del 1 al 10
even = [ ]
for x in range(1,11):
  if x % 2 == 0:
    even.append(x)
print(even)

# tupla (los arrays pueden cambiarse, las tuplas no)
employees=(1984, 1995, 1998, 1976)
print(employees)

# manipular tuplas
tuple1=(1, 2, 3, 4, 5)
tuple1[3]=5
print(tuple1)

# busqueda en tuplas
tupla = ["Sam", "Mike", "Kane", "Nick"]
print("Sam" in tupla)
print("Samuel" in tupla)