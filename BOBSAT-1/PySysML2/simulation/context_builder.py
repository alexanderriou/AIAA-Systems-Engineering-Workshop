import os,sys 
from src.modeling.model import Model
from src.modeling.element import Element, Relationship
from anytree import Node, RenderTree, NodeMixin
from anytree.exporter import DotExporter, JsonExporter


class SimContext:
    
    def __init__(self, model_file):
        
        self.model = Model().from_sysml2_file(model_file)
        
        for pre, fill, node in RenderTree(self.model):
                print("{}".format(node.name))
        
        print('stop')




