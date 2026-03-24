# BOBSAT-1 System Modeling and Automation
This project contains utilities for system modeling and simulation for our cubesat. 

# System Modeling
This section gives a high-level overview of the system model and file structure. It also covers best practices / conventions that we will be using to model and assess our system.

# System Automation
This section covers the automation elements that we had to build more-or-less from scratch. 

## Setting up the Automation Package from Scratch
There are some parts of the automation that we have to set up from scratch. Eventually, this will be condensed into its own repository that we can simply import by itself. Alas!

1. Download and unzip the repository from here: https://github.com/DAF-Digital-Transformation-Office/PySysML2. Rename the folder to PySysML2.
2. Run the setup_poetry.sh script from the root directory. If/when this fails, go to the BOBSAT_SysML_Automation/pyproject.toml and add this section: 
    [tool.poetry.dependencies]
    python = ">=3.12,<4.0"
    Then run the setup.poetry.sh script again.
3. Run the install_dependencies.sh script
4. Validate that the PySysML2 package is correctly installed by going to the PySysML2 directory and running this script:
    poetry run pysysml2 export examples/models/model_test_1.sysml2 --output-dir out/ --format json,txt,csv,xlsx
    This should generate a system model export in the out/ folder. The excel sheet should have like 50 different lines with all types of data in there.
5. Make sure the filepath to the PySysML2 is ../PySysML2 and not the global filepath (doxxing u)

## Basic Parsing
To validate that the top-level package is working, do the following:
1. poetry run python -m src.bobsat_sysml_automation.extract_model_hierarchy

