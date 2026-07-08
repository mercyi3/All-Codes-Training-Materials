from array import *

# val = array('i', [1,2,3,4,5])

# print(val.buffer_info()) #printing address, size

# for e in val:
#     print(e)
    
# newArr = array(val.typecode, (a*a for a in val)) #copying array to another array
# print(newArr)

# Getting user input

arr1 = array('i', [])

n = int(input("Enter size of an array:"))

for i in range(n):
    x = int(input("Enter array elements:"))
    arr1.append(x)

print(arr1)

val = int(input("Enter a value to search:"))
# print(arr1.index(val))
k=0
for e in arr1:
    if e==val:
        print(k)
    k+=1
