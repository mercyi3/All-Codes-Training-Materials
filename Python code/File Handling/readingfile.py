# read() − Reads the entire file.
with open("example.txt", "r") as file:
   content = file.read()
   print(content)
   
# readline() − Reads one line at a time.
with open("example.txt", "r") as file:
   line = file.readline()
   while line:
      print(line, end='')
      line = file.readline()
      
# readlines − Reads all lines into a list.
with open("example.txt", "r") as file:
   lines = file.readlines()
   for line in lines:
      print(line, end='')