package High_Level_Design_Analyses {
    doc /* These are the analyses that influence the high-level design decisions for the cubesat. */
    
    private import ScalarValues::*;
    private import ISQ::*;
    private import Cubesat_Logical_Architecture::*;

    
    part Satellite_and_Mission_Variation: Satellite_and_Mission_System {      
        variation part :>> Mission {
            variant part mission_1 {
                attribute :>> Downlink_Period = 0.5; /* hr */
                attribute :>> Downlinks_per_Day = 1;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_2 {
                attribute :>> Downlink_Period = 1; /* hr */
                attribute :>> Downlinks_per_Day = 1;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_3 {
                attribute :>> Downlink_Period = 0.5; /* hr */
                attribute :>> Downlinks_per_Day = 2;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_4 {
                attribute :>> Downlink_Period = 1; /* hr */
                attribute :>> Downlinks_per_Day = 2;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_5 {
                attribute :>> Downlink_Period = 0.5; /* hr */
                attribute :>> Downlinks_per_Day = 3;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_6 {
                attribute :>> Downlink_Period = 1; /* hr */
                attribute :>> Downlinks_per_Day = 3;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_7 {
                attribute :>> Downlink_Period = 0.5; /* hr */
                attribute :>> Downlinks_per_Day = 4;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
            variant part mission_8 {
                attribute :>> Downlink_Period = 1; /* hr */
                attribute :>> Downlinks_per_Day = 4;
                attribute :>> Vertical_Swath_Width = 600000*10^3; /* m */
            }
        } 
        part :>> Satellite {
            variation part :>> CNDH {
                variant part CNDH_1 {
                    attribute :>> Compression_Factor = 1; 
                }
                variant part CNDH_2 {
                    attribute :>> Compression_Factor = 2;
                }
                variant part CNDH_3 {
                    attribute :>> Compression_Factor = 3;
                }
                variant part CNDH_4 {
                    attribute :>> Compression_Factor = 4;
                }
                variant part CNDH_5 {
                    attribute :>> Compression_Factor = 5;
                }
                variant part CNDH_6 {
                    attribute :>> Compression_Factor = 8;
                }
                variant part CNDH_7 {
                    attribute :>> Compression_Factor = 12;
                }
                variant part CNDH_8 {
                    attribute :>> Compression_Factor = 16;
                }
                variant part CNDH_9 {
                    attribute :>> Compression_Factor = 20;
                }
                variant part CNDH_10 {
                    attribute :>> Compression_Factor = 25;
                }
            }
            variation part :>> COMMS {
                variant part COMMS_1 {
                    attribute :>> Downlink_Rate = 25; /* Mbps*/
                }
                variant part COMMS_2 {
                    attribute :>> Downlink_Rate = 50; /* Mbps*/
                }
                variant part COMMS_3 {
                    attribute :>> Downlink_Rate = 100; /* Mbps*/
                }
                variant part COMMS_4 {
                    attribute :>> Downlink_Rate = 250; /* Mbps*/
                }
                variant part COMMS_5 {
                    attribute :>> Downlink_Rate = 500; /* Mbps*/
                }
                variant part COMMS_6 {
                    attribute :>> Downlink_Rate = 1000; /* Mbps*/
                }
            }
            variation part :>> Payload {
                variant part Payload_1 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 8;
                    attribute :>> Number_of_Bands = 4;
                    
                }
                variant part Payload_2 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 12;
                    attribute :>> Number_of_Bands = 4;
                    
                }
                variant part Payload_3 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 16;
                    attribute :>> Number_of_Bands = 4;
                    
                }
                variant part Payload_4 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 8;
                    attribute :>> Number_of_Bands = 6;
                    
                }
                variant part Payload_5 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 12;
                    attribute :>> Number_of_Bands = 6;
                    
                }
                variant part Payload_6 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 16;
                    attribute :>> Number_of_Bands = 6;
                    
                }
                variant part Payload_7 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 8;
                    attribute :>> Number_of_Bands = 8;
                    
                }
                variant part Payload_8 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 12;
                    attribute :>> Number_of_Bands = 8;
                    
                }
                variant part Payload_9 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 16;
                    attribute :>> Number_of_Bands = 8;
                    
                }
                variant part Payload_10 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 8;
                    attribute :>> Number_of_Bands = 12;
                    
                }
                variant part Payload_11 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 12;
                    attribute :>> Number_of_Bands = 12;
                    
                }
                variant part Payload_12 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 16;
                    attribute :>> Number_of_Bands = 12;
                    
                }
                variant part Payload_13 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 8;
                    attribute :>> Number_of_Bands = 16;
                    
                }
                variant part Payload_14 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 12;
                    attribute :>> Number_of_Bands = 16;
                    
                }
                variant part Payload_15 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 16;
                    attribute :>> Number_of_Bands = 16;
                    
                }
                variant part Payload_16 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 8;
                    attribute :>> Number_of_Bands = 32;
                    
                }
                variant part Payload_17 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 12;
                    attribute :>> Number_of_Bands = 32;
                    
                }
                variant part Payload_18 {
                    attribute :>> Horizontal_Swath_Width = 120*10^3; /* m */
                    attribute :>> GSD = 30; /* m */
                    attribute :>> Bit_Depth = 16;
                    attribute :>> Number_of_Bands = 32;
                    
                }
            }
        }
    }
    
    
}