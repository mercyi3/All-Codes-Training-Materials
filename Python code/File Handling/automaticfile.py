# Using "with" Statement for Automatic File Closing
with open("file.txt", "w") as file: # file= open()
   file.write("Hello, World!")
   print ("Content added Successfully!!")
   
lines = ["First line\n", "Second line\n", "Third line\n"]
with open("example.txt", "w") as file:
   file.writelines(lines)
   print ("Content added Successfully!!")