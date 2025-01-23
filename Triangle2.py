# Problem:  Write a program that uses nested loops to print out the triangle shown below.

# Input:  The first line in the data file is an integer that represents the number of data sets to folow.  Each data set will contain a single number that represents the size of the triange.
 
# data file:  pr31.dat
 
# Output:  Print out the triangle as shown below.
 
# Assumptions:  None.
 
# Sample Input:  
# 3
# 3
# 7
# 4
 
# Sample Output: 
# ***
# **
# *
 
# *******
# ******
# *****
# ****
# ***
# **
# *
 
# ****
# ***
# **
# *

with open("pr31.dat") as file:
  file.readline()
  for line in file:
    triangleMax = ["*" for _ in range(int(line))]
    while len(triangleMax) > 0:
      print(''.join(triangleMax))
      triangleMax = triangleMax[1::]
