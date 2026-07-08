# Syntax:
# assert Expressions[, Argument]  

def square_root( Number ):  
    assert ( Number < 0), "Give a positive integer"  
    return Number**(1/2)  

print( square_root( 36 ) )
print( square_root( -36 ) ) 