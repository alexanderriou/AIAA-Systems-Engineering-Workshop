package B_1R_Architecture {
    doc /* This is the definitions for the physical architecture of the whole B-1R system */

    part def Physical_B_1R_System {
        doc /* This is the plane */

        part Airframe: Airframe_Subsystems;
        part Propulsion: Propulsion_Subsystems;
        part Controls: Controls_Subsystems;
        part Computing: Computing_Subsystems;
        part Electrical: Electrical_Subsystems;

    part def Airframe_Subsystems {
        doc /* This is the subsystem aggregating each of the structural elements of the Aircraft Subsystems*/

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

    part def Propulsion_Subsystems {
        doc /* This is the subsystem aggregating each of the propulsion elements in the plane */

        part Motor: Motor_Element;

        part def Motor_Element {
            doc /* This is the motor. */
        }
    }
    
    part def Controls_Subsystems {
        doc /* This is the subsystem aggregating the control surfaces and actuators */

        part Wing_Control_Surfaces: Wing_Control_Surfaces_Element;
        part Tail_Control_Surfaces: Tail_Control_Surfaces_Element;

        part def Wing_Control_Surfaces_Element {
            doc /* This is the wing control surfaces. */
        }

        part def Tail_Control_Surfaces_Element {
            doc /* This is the tail control surfaces. */
        }

    }

    part def Computing_Subsystems {
        doc /* This is the subsystem aggregating the on-board processing, sensing.*/
    }

    part def Electrical_Subsystems {
        doc /* This is the subsystem aggregating the eletric generation, storage.*/

        part Battery: Battery_Element;

        part def Battery_Element {
            doc /* This is the battery for the plane. */
        }
    }
    }

    part def Physical_Ground_System {
        doc /* This is the elements on the ground operating and assisting the plane. */
        
        part Pilot: Pilot_Subsystems;
        part Transmitter: Transmitter_Subsystems;

    part def Pilot_Subsystems {
        doc /* This is the pilot. */
    }

    part def Transmitter_Subsystems {
        doc /* This is the transmitter. */

        part Live_Telemetry: Live_Telemetry_Element;

        part def Live_Telemetry_Element {
            doc /* This is the live telemetry. */
        }
    }
    }

}