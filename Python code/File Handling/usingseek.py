with open("file.txt", "r+") as fo:
   # Move the read/write pointer to the 10th byte position
   fo.seek(7, 0)
    
   # Read 3 bytes from the current position
   data = fo.read(6)
   print(data)