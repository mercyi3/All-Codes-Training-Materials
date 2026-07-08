class Student:
    name = "Luffy"
    id = 101

    def details(my):
        print(f" ID : {my.id} \n Name : {my.name}")

    @staticmethod  #Decorator = self argument is not needed
    def head():
        print("Student 1....")

std1 = Student() 

std1.head()  #Student.head(std1)
std1.details()  #Student.details(std1)

