import random

points =0
while(True):
    computer = random.choice([-1, 0 , 1])
    print("\nChoose s for Snake w for Water g for Gun e for exit...")

    option = input("Enter your option: ")
    if(option == "e"):
        print(f"Your Total points: {points}")
        exit()

    YourDict = {"s":1, "w":0, "g":-1}
    Dict = { 1: "Snake", 0:"Water", -1:"Gun"} 

    you = YourDict[option]

    if(computer == you):
        print("It's Draw")
       
    else:
        if(computer==1 and you==0):
            print("You Lose...")
           
        elif(computer==0 and you==1):
            print("You Won..!!!")
            points+=1
            
        elif(computer==0 and you==-1):
            print("You Lose..!!!")
            
        elif(computer==-1 and you==0):
            print("You Won..!!!")
            points+=1
          
        elif(computer==-1 and you==1):

            print("You Lose..!!!")
            
        elif(computer==1 and you==-1):
            print("You Won..!!!")
            points+=1
         
        else:
            print("Choose the Correct option...")
           
    print(f"You choosed {Dict[you]} \nComputer choosed {Dict[computer]}")

