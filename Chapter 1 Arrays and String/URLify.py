class Solution:

    def __init__(self):
        pass

    def URLify(self, s,trueSize): #s is a list of characters, size is the true size
        p2 = trueSize-1 #the pointer to the new string
        p1 = trueSize-1 #the pointer to the origional string

        while(s[p1] == ' '):
            p1 -= 1

        while(p1 >= 0): #keep going through each of the original characters til we reach the end
            if(s[p1] != ' '): 
                s[p2] = s[p1]
                p2 -= 1
            else: #if we see a space replace it with %20
                s[p2] = '0'
                s[p2-1] = '2'
                s[p2-2] = '%'
                p2 -= 3
            p1 -= 1