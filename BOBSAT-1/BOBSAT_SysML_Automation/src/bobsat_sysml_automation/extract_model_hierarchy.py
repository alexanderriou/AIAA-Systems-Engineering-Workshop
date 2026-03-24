""" This test script imports a system model and prints it to the terminal. """
from pysysml2.modeling.model import Model

model = Model()
model.from_sysml2_file("../System Modeling/System Architectures.sysml")
print(model)
model.to_excel("out/")
