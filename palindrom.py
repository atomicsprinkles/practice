with open("pr71.dat") as f:
  f.readline()
  for line in f:
    line = line.replace(" ", "")
    line = ''.join(char for char in line if char.isalpha()).lower()
    print("PALINDROME" if line[::-1] == line else "NOT PALINDROME")
  
