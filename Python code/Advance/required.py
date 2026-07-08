def function( n1, n2 ):    
    print("number 1 is: ", n1)    
    print("number 2 is: ", n2)    
    
print( "Passing out of order arguments" )    
function( 30, 20 )       
    
print( "Passing only one argument" )    
# try:    
function( 30 )    
# except:    
#     print( "Function needs two positional arguments" )  