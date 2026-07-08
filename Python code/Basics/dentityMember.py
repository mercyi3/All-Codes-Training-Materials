x = ["apple", "banana"]
y = ["apple", "banana"]
z = x # copying object value 

print(x is z) # z is the same object as x

print(x is y) #  x is not the same object as y, even if they have the same content

print(x == y) # x is equal to y(values)

print("banana" in x)
print("Grapes" in y) 

print("Grapes" not in x)
