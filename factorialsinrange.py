def factorials(number):
  if (number == 0):
    return 1
  else:
    return number * factorials(number - 1)

with open("factorials.dat") as file:
  file.readline()
  
  for line in file:
    line = line.split(" ")
    line = [int(x) for x in line]
    
    factorial = ""
    
    for i in range(line[0], line[1] + 1):
      factorial += str(factorials(i)) + " "
      
    print(factorial)
