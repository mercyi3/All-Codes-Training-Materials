# import time;  

# print(time.localtime(time.time()))  
# print(time.asctime(time.localtime(time.time())))  #time formate

# for i in range(0,5):  
#     print(i)   
#     time.sleep(2) 

import datetime  
#returns the current datetime object     
print(datetime.datetime.now())  
print(datetime.datetime(2020,4,4,1,26,40))  

import calendar;    
cal = calendar.month(2020,3)       
print(cal)   

s = calendar.prcal(2026)  #whole year
print(s)
