import numpy as np
import pandas as pd

data = pd.DataFrame(data=pd.read_csv('enjoysport.csv'))
concepts = np.array(data.iloc[:,0:-1])
print(concepts)
target = np.array(data.iloc[:,-1])
print(target)
def learn(concepts, target): specific_h = concepts[0].copy()
print("initialization of specific_h and general_h")
print(specific_h)
general_h = [["?" for i in range(len(specific_h))]
             for i in range(len(specific_h))]
print(general_h)


