package Cubesat_Reference_Model {
    doc /* This is the interpreted information from the Cubesat Reference Model by the Object Management Group. https://www.omg.org/spec/CSRM/1.1/PDF */
    private import ScalarValues::*;
    private import ISQ::*;
    
    //* Requirement Definitions (CSRM Section 6.1 hierarchy) */

    // Base type used by the CSRM Concerns & Requirements Profile.
    // In CSRM, most requirement types in this profile generalize ExtRequirement.
    abstract requirement def ExtRequirement {
        // Optional metadata placeholders (tool-specific implementation may vary)
        // attribute source: String;
        // attribute risk;
        // attribute validatedBy;
    }

    // ---- High-level mission/concern requirement types ----
    requirement def StakeholderConcern :> ExtRequirement;
    requirement def MissionObjective   :> ExtRequirement;
    requirement def MissionNeed        :> ExtRequirement;
    requirement def MissionConstraint  :> ExtRequirement;
    requirement def MissionRequirement :> ExtRequirement;

    // ---- Architecture-level requirement types ----
    requirement def SubsystemRequirement :> ExtRequirement;
    requirement def ComponentRequirement :> ExtRequirement;
    requirement def DeployerRequirement  :> ExtRequirement;
    requirement def Group                :> ExtRequirement;

    // ---- Spacecraft / satellite branch ----
    requirement def SpacecraftRequirement :> ExtRequirement;
    requirement def SatelliteRequirement  :> SpacecraftRequirement;
    requirement def CubeSatRequirement    :> SatelliteRequirement;

    // ---- Segment branch ----
    abstract requirement def SegmentRequirement :> ExtRequirement;
    requirement def GroundSegmentRequirement    :> SegmentRequirement;
    requirement def SpaceSegmentRequirement     :> SegmentRequirement;


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