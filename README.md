# AIAA-Systems-Engineering-Workshop
This is the repository for hosting the live demo materials. The purpose of these workshops was to explore Systems Engineering concepts and software. 

# 1: Systems Engineering Fundamentals
This workshop covered the basic principles and justification for Systems Engineering at a high level. 
## Systems Engineering: Why?
Systems Engineering is the process of managing and analyzing the complex interactions between different disciplines in an engineering project. It is most easily understood if you look at the history of SysE. 

In the 80s and 90s, the rapid growth of computer technologies lead to increasingly complex products, workflows, and supply chains. The senior engineers in these areas realized that it was impossible to hold the entire technical scope of their projects in one person's mind. As a result, they established a set of practices, standards, and documents that would help to reconcile this exponential complexity. This would evolve into the modern Software Engineering practice. 

In the 90s and 00s, the Aerospace and Defense sector was experiencing very similar complexity growth. As a result, they adapted the work of software engineers to create the more general field of Systems Engineering. Consider a flagship A&D project: the F-35. There are so many different domains that need to work hand-in-hand to develop this plane: Mechanical, Electrical, Computer, Software, Aerospace, and Manufacturing Engineers. That's not to mention the Business, Finance, Logistics, and Project Management experts! Systems Engineering acts as the glue that holds the technical elements of a complex project together.

## Systems Engineering: What?
You may be surprise to learn that Systems Engineers are the most important technical roles in A&D, especially since a BS in SysE is quite rare! Well, SysEs perform a very diverse set of tasks in-industry, and most people who become SysEs do so with a technical specialization. Let's run through some examples.

Systems Test Engineers: When you field a physical system, you need to test it. It goes without saying that setting up, analyzing, and justifying tests is a difficult challenge. Many ME/EE/AE majors end up as systems test engineers as a result. The work ends up not to dissimilar from your engineering labs, in fact!

Software Systems Engineers: Most actual work in A&D Software Engineering is in the design and testing of the systems. In fact, the software must be able to interface with a number of hardware elements. A Software Systems Engineer performs these tasks, in addition to acting as liaison between the software and hardware experts. 

Systems Analyst: Testing everything in a product in oftentimes infeasible, so in lieu of that we turn to simulations. Justifying, configuring, running, and analyzing these simulations is the primary work of a Systems Analyst. For instance, a team working on turbine engines could have some systems analysts conducting aero/thermal/material/structural simulations. Many AE/Phys/Math majors end up in these roles. 

(Pure) Systems Engineer: The final major area of SysE relates to how projects are managed. The PM's work concerns the budget, timeline, and manpower resources available to the project. But who sets the technical milestones? Who determines what features are actually needed in the product? Systems Engineers fill this gap. Managing and deriving the project requirements, performing trade studies, and setting timelines are common tasks in this area. Because it's so general, basically any technical domain will have systems engineers working in this capacity. 

## Systems Engineering: How? 
All of this info is all well and good, but what are some of the tools that SysEs use to facilitate these tasks? To tackle that, we should first mention some bad ways to do systems engineering.

Small-scale projects can get away with just sticking files/cad models/scripts into a Google Drive/Box folder and calling it a day. However, this very quickly leads to issues with (1) keeping track of work you've already done, (2) managing different versions of your work, (3) identifying what work needs to be prioritized, and finally (4) communicating the project to new and returning contributors. Systems Engineers of the past used a Document-Based approach to the discipline, where everything was disconnected excel sheets, powerpoints, and word docs. This system is an expensive and inflexible mess!

Of late, the SysE discipline has shifted to a model-based approach. The ideal is that there is some Single Source of Truth that underpins 100% of the project at hand. This SSoT approach takes advantage of the digital toolsets that we have in the modern day. Let's see a pertinent example where this changed approach applies. Let's say you're developing a CAD model in a team of 5; a document-based approach would require that only a single person can modify the model at a time! After all, if two people make changes to the model, how do you stitch their changes together? In a model-based approach, you can isolate what segment of the model you are changing, and everything outside of that scope is free for others to modify. 

Let's consider another similar use case. Let's say you're doing some kinematics calculations for your vehicle. How do you actually retain and update your work when you make changes down the line? How do you trace what assumptions you make in your calculation? These are tough questions to tackle in a document-based setting. Luckily, in both of these cases, we have MBSE software to resolve this. 

The first is a modeling language (more general than a programming language) called SysML. Specifically, there is a specification on how to make a model in SysML with text (ie in a .sysml file). This allows for SysEs to crystallize all sorts of things into a concrete model, in the same way that programming languages crystallize algorithms into code. Notably, text is very easy to isolate, generalize, and abstractify.

SysML v2 works particularly well with a number of powerful tools for performing the tasks mentioned above. Namely, many enterprise softwares for systems engineering / modeling (Cameo, Ansys STK) can directly import sysml files. Furthermore, it meshes well with version control through git (ie Github, Bitbucket). Finally, there is a growing ecosystem for performing analyses based on a system model (ie OpenMDAO, SysIDE Automator). In the future there may even be ways to parametrically generate CAD files and assemblies from a sysml backbone. If you're interested in the topic, then look for Digital Engineering online. 

# 2: System Architecture and Requirements
The fundamental question of system modeling is: How detailed of a model do I need? What do I need to cover? The answer relates to what info you want to get from the model. Recall that the main focus of Systems Engineering is to mitigate the complexity of the system. Therefore, the act of modeling should make it easier to understand and compartmentalize the different parts of the system. 

## Physical Architecture
With that in mind, the most natural thing to model is the physical parts of the system. The hierarchy of system elements (composition, inheritance, interfaces, etc.) constitute the Physical Architecture. Oftentimes, engineers have a general idea of what parts go into the plane. However, an Electrical Engineer's view into how the physical parts interface looks very different from a Structural Engineer (or an Aerodynamics Engineer). The physical architecture must be able to capture each of these views and communicate them to the relevant people. 

With a physical architecture defined, some relatively complicated results become easy to determine. Firstly, it's very simple to assemble a Bill of Materials from the physical architecture. Secondly, grouping elements into a hierarchy can aid in splitting a project's workforce up into technical domains. Thirdly, you can specify in-detail the physical interfaces between every single part. We will go more in-depth on this use case, as it shows some of the advantages of a Model-Based approach over a Document-Based one. 

## Interfaces
Let's justify why someone would want to examine the interfaces of a system in detail. For regulatory reasons, the risk associated with operating any system must be pretty well-defined. But where do you start? Well, one method of Failure Analysis is to associate every failure mode with a physical element or interface (and vice versa). As a result, to "fully categorize" the failure of your system, it becomes necessary to model the interfaces. One way to do this is in an N2 Diagram, where every single element of the system is laid on each side of a matrix. The elements of the matrix represent an interface between two elements. 

This matrix is pretty hard to maintain if you want to swap out different components (you have to re-assess the interactions between it and every other element). If you instead represent the system as a physical architecture, you can synthesize the N2 diagram from that programmatically. You can also do a number of other useful features, such as filtering by domain or evaluating variations of the system. 

## Requirements
Every system is subject to requirements. The hardest and most nebulous part of system design is to take the vague, high-level requirements and synthesize them into design choices. Systems Engineers are often tasked with reconciling requirements with the technical specifications of the product. Requirements tie into every aspect of the engineering process, and they tie directly into the systems engineering stuff.

Let's examine how requirements work with the physical architecture and interfaces. You can imagine a requirement would read as follows: "The system must be able to sustain nominal structural loads with a safety factor of 2". This exists at the system scope, and each of the subsystems must have their own "flow-down" version of this requirement. For the demo project, this only applies to the Airframe and Control subsystems. For the airframe, this derived requirement would look like: "The airframe must be able to sustain nominal structural loads with a safety factor of 2. The composite elements must avoid compressive loads." You can see that the requirement becomes more specific as it gets flowed down. 

Next, there could be a requirement related to the interfaces. For the demo project, it could look like this: "The system must use the standard XT-30, XT-60, and XT-90 connectors for power cables." This pertains to each of the power interfaces in the Electrical N2 diagram. 

Finally, major design reviews necessitate that requirements are satisfied. It makes no sense to proceed with the manufacturing of the product if it doesn't perform what the customer needs! Requirement satisfaction is tracked through Verification. Often, verification of requirements is very simple. ie. it is resolved by inspecting the system and saying, "Yep, that's satisfied." Other Verification tasks include evaluating the outputs of a test or simulation campaign. Either way, there needs to be a way to trace requirements to design decisions to verify that they're all covered. This results in a traceability matrix, very similar in affect to the N2 Diagram.  
