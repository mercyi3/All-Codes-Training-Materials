import re  
  
# 1. re.match 
pattern = "hello"   
match = re.match(pattern, "hello world")  
  
print(match) # Printing the match object  
print("Span:", match.span()) # Return the tuple (start, end) index 
print("Start:", match.start()) # Return the starting index  
print("End:", match.end()) # Returns the ending index 

# 2. re.sub
pattern = "like" # to be replaced  
repl = "love" # Replacement  
text = "I like python!" # String   
new_text = re.sub(pattern, repl, text)  
   
print("Original text:", text)  
print("Substituted text: ", new_text) 