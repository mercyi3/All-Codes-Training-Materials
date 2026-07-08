from numpy import *

arr = array([1,2,3,4,5]) #int, fload
print(arr.dtype)
print(arr)

arr2 = linspace(0,16,5) #divide num into 5 parts in range
print(arr2)

arr3 = arange(1, 15, 2) #skip the 2nd value from 1 to 15
print(arr3)

arr4 = logspace(1, 40, 5) #divided 5 parts as log values
print('%.2f' %arr4[0]) #only 2 digit in float

arr5 = zeros(5) #ones(5, int)
print(arr5)
