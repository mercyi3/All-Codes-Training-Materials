# Open a file
fo = open("demo.txt", "w")
print ("Name of the file: ", fo.name)
print ("Closed or not: ", fo.closed)
print ("Opening mode: ", fo.mode)
fo.close() #for closing file
print ("Closed or not: ", fo.closed)

# Using "with" Statement for Automatic File Closing
with open("file.txt", "w") as file: # file= open()
   file.write("Hello, World!")
   print ("Content added Successfully!!")
   
lines = ["First line\n", "Second line\n", "Third line\n"]
with open("example.txt", "w") as file:
   file.writelines(lines)
   print ("Content added Successfully!!")