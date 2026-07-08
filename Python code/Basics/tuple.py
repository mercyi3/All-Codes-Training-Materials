# tup1 = (1,2,3.5,4,5.2)
# tup2 = ("Apple", "banana", "Orange")

# print(tup1,"\n",tup2)

# countries = ("Spain", "Italy", "India", "England", "Germany")
# temp = list(countries)
# temp.append("Russia")       #add item 
# temp.pop(3)                 #remove item
# temp[2] = "Finland"         #change item
# print("List: ", temp)
# countries = tuple(temp)
# print("Tuple: ",countries)

info = ("Marcus", 20, "MIT")
(name, age, university) = info
print("Name:", name)
print("Age:",age)
print("Studies at:",university)

fauna = ("cat", "dog", "horse", "parrot", "salmon")
(*animals, bird, fish) = fauna
print("Animal: ", animals)
print("Birds: ", bird)
print("Fish: ", fish)
