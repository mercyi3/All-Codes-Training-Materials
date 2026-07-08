class Animal:  
    def speak(self):  
        print("Animal class")  
 
class Dog(Animal):  
    def bark(self):  
        print("dog barking")  

class DogChild(Dog):  
    def eat(self):  
        print("Eating Meat...") 
        super().speak()  
        super().bark()

d = DogChild()  
d.bark()  
d.speak()  
d.eat()  