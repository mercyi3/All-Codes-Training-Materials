class complex_1:  
    def __init__(self, X, Y):  
        self.X = X  #23 21
        self.Y = Y  #12  22

    def __add__(self, U):  
        return self.X + U.X, self.Y + U.Y  
                # 23+21,  12+22
Object_1 = complex_1(23, 12)  
Object_2 = complex_1(21, 22)  
Object_3 = Object_1 + Object_2  
print (Object_3)  

