package Harrier_Physical_Architecture {
    doc /* This is the definitions for the physical architecture of the whole harrier system. */

    part def Physical_Harrier_System {
        doc /* This is the plane */

        part Airframe: Airframe_Subsystem;
        part Propulsion: Propulsion_Subsystem;
        part Controls: Control_Subsystem;
        part Computing: Computing_Subsystem;
        part Electrical: Electrical_Subsystem;

        part def Airframe_Subsystem {
            doc /* This is the subsystem aggregating each of the structural elements of the plane. */

            part Fuselage: Fuselage_Element;
            part Wings: Wings_Element;
            part Tail: Tail_Element;

            part def Fuselage_Element {
                doc /* This is each structural element in the fuselage. */
            }
            part def Wings_Element {
                doc /* This is each structural element in the wings. */
            }
            part def Tail_Element {
                doc /* This is each structural element in the tail. */
            }
        }
        part def Propulsion_Subsystem {
            doc /* This is the subsystem aggregating the propulsion elements in the plane. */
        }
        part def Control_Subsystem {
            doc /* This is the subsystem aggregating the control surfaces and actuators in of the plane. */
        }
        part def Computing_Subsystem {
            doc /* This is the subsystem aggregating the on-board processing, sensing, and communications elements. */
        }
        part def Electrical_Subsystem {
            doc /* This is the subsystem aggregating the electric generation, storage, and distribution elements of the plane. */
        }

    }

    part def Physical_Ground_System {
        doc /* This is the elements on the ground, operating and assisting the plane. */
    }

}