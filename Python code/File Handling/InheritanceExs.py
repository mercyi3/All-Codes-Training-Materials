#single level inheritance 

class Vehicle:
    def start(self):
        print("Vehicle starts")

class Bike(Vehicle):
    def ride(self):
        print("Bike is riding")

b = Bike()
b.start()
b.ride()

#Multiple Inheritance (Smart Device)
class Camera:
    def click(self):
        print("Photo captured")

class Phone:
    def call(self):
        print("Calling someone")

class SmartPhone(Camera, Phone):
    def features(self):
        print("Smartphone features")

s = SmartPhone()
s.click()
s.call()
s.features()


#Multilevel Inheritance (Student System) 

class Person:
    def info(self):
        print("Basic person info")

class Student(Person):
    def study(self):
        print("Student studies")

class GraduateStudent(Student):
    def research(self):
        print("Doing research")

g = GraduateStudent()
g.info()
g.study()
g.research()

#Hierarchical Inheritance (Bank Accounts)

class Account:
    def account_type(self):
        print("General account")

class Savings(Account):
    def interest(self):
        print("Savings: 4% interest")

class Current(Account):
    def overdraft(self):
        print("Current: Overdraft allowed")

s = Savings()
c = Current()

s.account_type()
s.interest()

c.account_type()
c.overdraft()

#Hybrid Inheritance (School System)
class School:
    def school_name(self):
        print("ABC School")

class Teacher(School):
    def teach(self):
        print("Teacher teaches")

class Student(School):
    def study(self):
        print("Student studies")

class Monitor(Teacher, Student):
    def role(self):
        print("Monitor manages class")

m = Monitor()
m.school_name()
m.teach()
m.study()
m.role()