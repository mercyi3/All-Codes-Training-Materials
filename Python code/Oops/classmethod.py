class Demo:
    a=10 # class attribute
    @classmethod 
    def show(cls):
        print(f"Class Atttribute a = {cls.a}")

obj = Demo() #object creation
obj.a= 20  #instance attribute
obj.show()