class Duck:
   def sound(self):
      return "Quack, quack!"

class AnotherBird:
   def sound(self):
      return "I'm similar to a duck!"

def makeSound(call): #class object
   print(call.sound())

duck = Duck()#obj creation
anotherBird = AnotherBird()

makeSound(duck)   
makeSound(anotherBird) 