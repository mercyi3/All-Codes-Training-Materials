def square( item_list ):       
    squares = [ ]    
    for l in item_list:   #l=17 
        squares.append( l**2 )  #17**2  
    return squares    

my_list = [17, 52, 8];    
my_result = square( my_list ) # function call   
print( "Squares of the list are: ", my_result )    