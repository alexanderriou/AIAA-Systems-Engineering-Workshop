package Cubesat_Reference_Model {
    doc /* This is the interpreted information from the Cubesat Reference Model by the Object Management Group. https://www.omg.org/spec/CSRM/1.1/PDF */
    private import ScalarValues::*;
    private import ISQ::*;

package CSRM_Concerns_and_Requirements_Profile {
    private import ScalarValues::*;
    
    /* * Base Requirement Stereotypes 
     * All requirements in this profile inherit from ExtRequirement [cite: 198, 241, 759]
     */
    
    // Enumerations used in ExtRequirement
    enum def RiskKind {
        High;
        Medium;
        Low;
    }

    requirement def ExtRequirement {
        attribute source: String; 
        attribute risk: RiskKind = RiskKind::Medium; 
        // Note: validatedBy is often a derived relationship in MBSE tools 
    }

    /* * 6.1.1 - 6.1.5 Top-Level Mission Drivers [cite: 68]
     */
    
    requirement def StakeholderConcern specialize ExtRequirement; 
    
    requirement def MissionNeed specialize ExtRequirement; 
    
    requirement def MissionObjective specialize ExtRequirement; 
    
    requirement def MissionConstraint specialize ExtRequirement; 
    
    requirement def MissionRequirement specialize ExtRequirement; 

    /* * 6.1.7 - 6.1.15 Segment and Structural Requirements [cite: 68]
     */

    // Abstract base for segment-level needs 
    abstract requirement def SegmentRequirement specialize ExtRequirement; 

    requirement def SpaceSegmentRequirement specialize SegmentRequirement; 
    
    requirement def GroundSegmentRequirement specialize SegmentRequirement; 

    requirement def SpacecraftRequirement specialize ExtRequirement; 

    requirement def SatelliteRequirement specialize SpacecraftRequirement; 

    requirement def CubeSatRequirement specialize SatelliteRequirement; 

    /* * 6.1.8 - 6.1.10 Low-Level Design Requirements [cite: 68]
     */

    requirement def SubsystemRequirement specialize ExtRequirement; 

    requirement def ComponentRequirement specialize ExtRequirement; 

    requirement def DeployerRequirement specialize ExtRequirement; 

    // Organizational element for requirement grouping 
    requirement def Group specialize ExtRequirement; 
}

    //* 
    6 CSRM Profile (Normative)  5
    6.1 Concerns and Requirements Profile  5
    6.1.1 StakeholderConcern .. 6
    6.1.2 MissionObjective... 6
    6.1.3 MissionNeed  7
    6.1.4 MissionConstraint. 7
    6.1.5 MissionRequirement.. 7
    6.1.6 CubeSatRequirement  7
    6.1.7 GroundSegmentRequirement . 8
    6.1.8 SubsystemRequirement . 8
    6.1.9 ComponentRequirement .... 8
    6.1.10 DeployerRequirement .. 8
    6.1.11 SpaceSegmentRequirement ... 9
    6.1.12 Group 9
    6.1.13 SpacecraftRequirement 9
    6.1.14 SegmentRequirement . 10
    6.1.15 SatelliteRequirement .. 10
    6.2 Technical Measures Profile ... 10
    6.2.1 moeSpecification ... 11
    6.2.2 mopSpecification . 11
    6.2.3 tpmSpecification . 11
    6.2.4 MOP . 12
    6.2.5 TPM . 12
    6.2.6 kppSpecification .. 12
    6.2.7 KPP .. 12
    6.2.8 MeasurementSpecification .... 13
    6.2.9 mopRequirement  13
    6.2.10 tpmRequirement  13
    6.2.11 moeRequirement 14
    6.2.12 kppRequirement  14
    6.3 Architecture Structures Profile . 14
    6.3.1 Component ... 15
    6.3.2 Segment .... 15
    6.3.3 CubeSat .... 15
    6.3.4 Facility  16
    6.3.5 Equipment . 16
    6.3.6 Stakeholder 16
    6.3.7 GroundSegment .. 16
    6.3.8 SpaceSegment . 17
    6.3.9 Spacecraft  17
    6.3.10 Satellite  17
    6.3.11 CubeSatDeployer . 18
    6.3.12 Mission 
    6.3.13 ConcernOf .... 18
    6.4 Validation and Verification Profile .. 18
    6.4.1 ValidationActivity  19
    6.4.2 Validation .. 20
    6.4.3 VerificationActivity . 20
    6.4.4 Verification  21
    6.5 Comments Profile .... 21
    6.5.1 Explanation .... 22
    6.5.2 HowTo... 22
    6.6 SysML Extensions .... 22
    6.6.1 performanceRequirement .. 23
    6.6.2 MoE  23
    6.6.3 ExtRequirement .. 23
    6.6.4 SystemContext 24
    6.6.5 SystemContext 24
    6.6.6 Subsystem ..
    6.6.7 Domain 
    6.6.8 VerificationMethodKind
    6.6.9 RiskKind 
    */

    //* Imports */

    //* TBD Definitions */

}