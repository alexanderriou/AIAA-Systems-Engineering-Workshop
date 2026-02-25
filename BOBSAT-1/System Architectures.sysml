package Cubesat_Display_Model {
    //* Imports */
    private import ScalarValues::*;
    private import ISQ::*;

    //* Part Definitions */
    part def Logical_Satellite_System {
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

    //* Part Usages */
    part logical_flatsat: Logical_Satellite_System {
        part flatsat_payload: Payload_Subsystem;
        part flatsat_eps: EPS_Subsystem{
            part flatsat_battery: Power_Storage{
                redefines mass = 10; 
            }
        }
    }
}