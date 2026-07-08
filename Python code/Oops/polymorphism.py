#def add(*nums):
   #return sum(nums)

#result1 = add(10, 25)
#result2 = add(10, 25, 35)

#print(result1) 
#print(result2)



def sub(*nums):
   result = nums[0]   # start from first number
   for num in nums[1:]:
      result -= num   # subtract remaining numbers
   return result

result1 = sub(25, 10)        # 25 - 10 = 15
result2 = sub(35, 25, 10)    # 35 - 25 - 10 = 0

print(result1)
print(result2)