from random import randint

class Train:

    def __init__(self, trainNo):
        self.trainNo = trainNo

    def book(self, source, des):
        print(f"Your Train tickets of Train Number {self.trainNo} from {source} to {des} is Confirmed")
    
    def status(self):
        print(f"Train Number {self.trainNo} is running...")

    def fare(self, source, des):
        print(f"Your Train Number {self.trainNo} from {source} to {des} fare is {randint(200, 1000)}")
        
J = Train(12389)
J.book("s()Bangalore", "Salem")
J.statu
J.fare("Bangalore", "Salem")
