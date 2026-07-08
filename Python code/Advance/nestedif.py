num = int(input("Enter a number")) #15

if(num%3 == 0): #15 % 3= 0==0 true
    if(num%5 == 0): # 15 % 5 =0 == 0 true
        print("Number is divisible by 3 & 5")
    else:
        print("Number is divisible by 3 but not 5")
elif(num%5 ==0 ):
    print("Number is not divisible by 3 but divisible by 5")
else:
    print("Number is not divisible by 3 & 5")
    