import os
from pysysml2.modeling import Model


# in_dir = "./examples/models"
# out_dir = "./examples/output"
# in_sysml2 = [f for f in os.listdir(in_dir) if f.endswith(".sysml2")]

# # Looping through all model files in the input directory
# for in_f in in_sysml2:
#     in_f = os.path.join(in_dir, in_f) # Set filename
#     model = Model() # Create Model object
#     model.from_sysml2_file(in_f) # Parse the textual model
#     model.to_dot(out_dir) # Tranform model to a .dot file
#     model.to_png(out_dir) # Export PNG of tree graph
#     model.to_excel(out_dir) # Convert to tabular format
#     model.to_csv(out_dir) # Export tabular view to CSV
#     model.to_JSON(out_dir) # Serialize Model object to JSON
#     model.to_txt(out_dir) # Output string representation


in_dir = "./examples/models"
# in_dir = "./examples/updated_test"
# model_file = "simplified_beagleplay.sysml"
# model_file = "model_test_3.sysml2"
model_file = "model_test_2.sysml2"
out_dir = "./examples/output"

in_f = os.path.join(in_dir, model_file) # Set filename
model = Model() # Create Model object
model.from_sysml2_file(in_f)
model.to_excel(out_dir)

