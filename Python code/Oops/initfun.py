class Details:
    name = "Dog" #class attribute
    group = "Animal"
    
    def __init__(self, name, group): #dunder method or constructor
        self.name = name
        self.group = group

obj1 = Details("Salmon", "Fish")
obj1.name = "Shrimp"  #Modify object property(instance atttribute)
print(obj1.name, "belongs to the", obj1.group, "group.")

