# Open a file in binary write mode
with open('test.bin', 'wb') as f:
   # Binary data
   data = b"Hello World"  
   f.write(data)
   
with open('test.bin', 'wb') as f:
   # Convert text string to bytes
   data = "Python World".encode('utf-8')  
   f.write(data)
   
# # Open the file in binary read mode
with open('test.bin', 'rb') as f:
   data = f.read()
   print(data.decode(encoding='utf-8'))
   
