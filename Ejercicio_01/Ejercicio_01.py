# Debes invertir la entrada e intercambiar los casos
# Input: Una cadena de cadena para procesar.
# Output: La cadena invertida con mayúsculas y minúsculas intercambiadas.
# Constraints: 0 < length of string <= 50
# Example: Hello -> OLLEh

string = input()

# Solución_01:
reversed_string = ""

for c in string[::-1]:
    if c.isupper():
        c = c.lower()
        reversed_string += c
    else:
        c = c.upper()
        reversed_string += c

print(reversed_string)

# Soluciones Pythonic
# Solución_02:
# string[::1] -> Invierte la cadena
reversed = [c.upper() if c.islower() else c.lower() for c in string[::-1]]
print(*reversed, sep = "")

# Solución_03:
print("".join(c.upper() if c.islower() else c.lower() for c in string[::-1]))
