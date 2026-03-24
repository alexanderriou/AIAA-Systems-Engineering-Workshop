import os
from pysysml2.modeling.model import Model

EXAMPLES_DIR = os.path.dirname(os.path.abspath(__file__))

# Use this file to perform a quick test of the package. However, it is better
# to use the Jupiter notebook for testing in the main directory.

in_dir = os.path.join(EXAMPLES_DIR, "models")
out_dir = os.path.join(EXAMPLES_DIR, "output")

in_sysml2 = [f for f in os.listdir(in_dir) if f.endswith(".sysml2")]

# Looping through all model files in the input directory
for in_f in in_sysml2:
    in_f = os.path.join(in_dir, in_f)
    model = Model()
    model.from_sysml2_file(in_f)
    model.to_csv(out_dir)
    model.to_JSON(out_dir)
    model.to_txt(out_dir)
    model.to_excel(out_dir)
    model.to_dot(out_dir)
    model.to_png(out_dir)
