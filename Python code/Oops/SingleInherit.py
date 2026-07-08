class Person(object):#parent class

  def __init__(self, name, id):
    self.name = name
    self.id = id

  def Display(self):
    print(self.name, self.id)

# emp = Person("Satyam", 102) 
# emp.Display()

class Emp(Person): #class child(parent):
  
  def Print(self):
    print("Emp class called")
    
Emp_details = Emp("Mayank", 103)

Emp_details.Display()
Emp_details.Print()
