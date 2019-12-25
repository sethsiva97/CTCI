class Solution:

    def __init__(self):
        pass

    def oneReplacement(self,sOne,sTwo):
        isSame = False
        for i in range(0,len(sOne)):
            if(sOne[i] != sTwo[i]):
                if(isSame):
                    return False
                else:
                    isSame = True
        return True

    def oneInsertion(self,bigger,smaller):
        isSame = False
        pB = 0
        pS = 0

        while(pB < len(bigger) and pS < len(smaller)):
            if(bigger[pB] != smaller[pS]):
                if(isSame):
                    return False
                else:
                    isSame = True
                    pB += 1
            else:
                pB += 1
                pS += 1

        return True

    def OneAway(self,sOne,sTwo):
        if(abs(len(sOne)-len(sTwo)) > 1): #if the length of both strings differ by more than one, they are not one edit away
            return False
        elif(len(sOne) == len(sTwo)):
            return self.oneReplacement(sOne,sTwo)
        elif(len(sOne) > len(sTwo)):
            return self.oneInsertion(sOne,sTwo)
        else:
            return self.oneInsertion(sTwo,sOne)

test = Solution()
print(test.OneAway("pale","ple"))
print(test.OneAway("pales","pale"))
print(test.OneAway("pale","bale"))
print(test.OneAway("pale","bake"))        
        