dict = {1:"Robin", 2:"Sana", 3:"Khan"}
print("Dictionary: ",dict)

dict[4] = "Nico"
print("Added: ",dict)

dict.update({2:"Sanam"})
print("Updated: ",dict)

dict.pop(3)
print("Pop[3]: ", dict )

dict.popitem()
print("Popitem(): ", dict )

del dict[2]
print("Delete: ", dict )

del dict
print("Deleted all: ", dict )

dict2 = {1:"Sanam", 2:"Robin"}
print("Copied: ", dict.copy(dict2))