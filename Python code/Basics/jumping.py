# break
for i in range(1, 50):
    if(i == 7):
        break 
    print(i)
#continue
sum=0
for i in range(0,10):  
    a = int(input("Enter a number: "))  
    if(a>0):  
        sum = sum+a  
    else:  
        continue  
print("The sum of the 10 positive numbers you gave:", sum) 
# pass
for alphabet in 'Legends':
    if(alphabet == 'e'):
        pass
    else:
        print(alphabet)
        
