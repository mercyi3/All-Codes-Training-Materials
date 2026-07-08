# a = ["Python", "Exceptions", "try and except"]  #list
# try:  
#     for i in range( 4 ): #4loop i=0 
#         print( "index =", i," Value = ", a[i] )  
# except:  
#     print ("Index out of range") 
# finally:  
#     print( 'This is code of finally clause' )   
# print("After the error....")
    
#Python code to show how to raise an exception in Python  
num = [3, 4, 5, 7]
if len(num) > 3:  
    raise Exception( f'''Length of the given list must be 
                    less than or equal to 3 but is {len(num)}''' )  