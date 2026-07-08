# Days1 = {"Monday","Tuesday","Wednesday","Thursday"}    
# Days2 = {"Thursday","Friday","Saturday","Sunday"}    
# print("Union: ",Days1.union(Days2))
# print("Intersection: ",Days1.intersection(Days2))


# set1 = {1, 2, 3}  
# set2 = {2, 3, 4}  
# set3 = {3, 4, 5}  
  
# common_elements_union = set1.union(set2, set3) 
# common_elements_intersect = set1.intersection(set2, set3)  
   
# print(common_elements_union) 
# print(common_elements_intersect) 

#intersect_Update()
a = {"Devansh", "bob", "castle"}    
b = {"castle", "dude", "emyway"}    
c = {"fuson", "gaurav", "castle"}    
    
a.intersection_update(b, c)      
print(a)  

# difference()
Days1 = {"Monday",  "Tuesday", "Wednesday", "Thursday"}    
Days2 = {"Monday", "Tuesday", "Sunday"}    
print(Days1.difference(Days2)) # subtraction

a = {1,2,3,4,5,6}  
b = {1,2,9,8,10}  
c = a.symmetric_difference(b)  
print(c)  
