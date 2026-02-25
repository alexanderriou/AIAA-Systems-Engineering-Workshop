package Cubesat_Logical_Architecture {
    doc /* These are the definitions of the logical/functional systems of the satellite and the analyses therein. */
    //* Imports */
    private import ScalarValues::*;
    private import ISQ::*;

    //* Part Definitions */
    part def Satellite_and_Mission_System {
        doc /* This combines the Satellite System, Ground System, and Mission Profile to represent all elements involved in the operation of the mission. */
    }
    part def Mission_Profile {
        doc /* This is the information pertaining to the operation of the satellite. Includes the orbit and pointing info. */
    }
    part def Logical_Satellite_System {
        doc /* This is a combination Logical and Functional Architecture for a generic imaging cubesat. */
        part def Mission_Information {
            attribute Downlink_Period: TimeValue;
            attribute Downlinks_per_Day: ScalarValue;
        }
        part def Payload_Subsystem {
            attribute Horizontal_Swath_Width: LengthValue;
            attribute Vertical_Swath_Width: LengthValue;
            attribute GSD: LengthValue;
            attribute Bit_Depth: BinaryDigitRateValue;
            attribute Number_of_Bands: ScalarValue;
            attribute Compression_Factor: ScalarValue;
            
        }
        part def ADCS_Subsystem {
            
        }
        part def EPS_Subsystem {
            part def Power_Storage{
                attribute mass;
                attribute capacity;
            }
        }
        part def SENV_Subsystem {
            
        }
        part def COMMS_Subsystem {
            attribute Downlink_Rate: BinaryDigitRateValue;
        }
        part def CNDH_Subsystem {
            
        }
        part def FSW_Subsystem {
            
        }
    }

    part def Logical_Ground_System {
        part def Ground_Hardware_Subsystem {
            
        }
        part def Ground_Software_Subsystem {
            
        }
    }
}

package Cubesat_Physical_Architecture {
    doc /* These are the definitions and usages describing the physical systems of the satellite. It also describes the testing procedures. */
}